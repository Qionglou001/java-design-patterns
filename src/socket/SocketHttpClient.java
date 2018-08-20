package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;


public class SocketHttpClient {
	private Socket socket;
	
	public void start(String host, int port){
		socket = new Socket();
        try {
        	//设置socket连接
        	SocketAddress socketAddess = new InetSocketAddress(host,port);
	        socket.setSoTimeout(5000);
	        socket.connect(socketAddess);
	        
	        //发起请求
	        BufferedWriter printWrite = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	        printWrite.write(compositeRequest(host));
	        printWrite.flush();
	        
	        //读取响应
	        BufferedReader  br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        String msg = "";
	        while((msg = br.readLine()) != null){
	        	System.out.println(msg);
	        }
	        
        } catch (IOException e) {
	        e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       
	}
	
    private String compositeRequest(String host){

        return "GET / HTTP/1.1\r\n" +
                "Host: " + host + "\r\n" +
                "User-Agent: curl/7.43.0\r\n" +
                "Accept: */*\r\n\r\n";
    }
}
