package dynamicFactory_singleton;

public interface IDao <T>{
	void save(T t);
	
	T getOne(int id);


}
