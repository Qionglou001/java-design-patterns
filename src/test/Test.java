package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Test {
	public static void main(String[] args) {
	    Map<String, String> map = new HashMap<String, String>();
	    map = Collections.synchronizedMap(map);
    }
}
