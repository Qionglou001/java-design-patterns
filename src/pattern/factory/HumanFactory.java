package pattern.factory;


public class HumanFactory extends AbstractHumanFactory{

	@Override
    public <T> T createHuman(Class<T> cls) {
		T human = null;
		try {
	        human = cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
	    return (T)human;
    }

	
}
