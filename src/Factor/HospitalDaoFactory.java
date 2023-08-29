package Factor;

import Dao.HospitalDao;
import Dao.HospitalDaoImpl;

public class HospitalDaoFactory
{
	static HospitalDao hospitaldao;
	static
	{
		hospitaldao=new HospitalDaoImpl();
	}
	public static HospitalDao get()
	{
		return hospitaldao;
	}
	
}
