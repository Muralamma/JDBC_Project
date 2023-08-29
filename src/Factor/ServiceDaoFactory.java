package Factor;

import Service.ServiceDao;
import Service.ServiceDaoImpl;

public class ServiceDaoFactory 
{
	static ServiceDao servicedao;
	static
	{
		servicedao=new ServiceDaoImpl();
	}
	public static ServiceDao get()
	{
		return servicedao;
	}
}
