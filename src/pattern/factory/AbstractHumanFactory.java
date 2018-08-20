package pattern.factory;


public abstract class AbstractHumanFactory {
	public abstract <T> T createHuman(Class<T> cls);
}

