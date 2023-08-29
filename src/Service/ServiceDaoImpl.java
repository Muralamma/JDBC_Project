package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.HospitalDao;
import Dto.Hospital;
import Factor.HospitalDaoFactory;

public class ServiceDaoImpl implements ServiceDao
{
	@Override
	public void addHospital(Hospital h) throws ClassNotFoundException, SQLException 
	{
		HospitalDao d=HospitalDaoFactory.get();
		d.add(h);
	}

	@Override
	public void deleteHospital(String pname) throws ClassNotFoundException, SQLException 
	{
		HospitalDao d=HospitalDaoFactory.get();
		d.delete(pname);
	}

	@Override
	public void updateHospital(Hospital h) throws ClassNotFoundException, SQLException 
	{
		HospitalDao d=HospitalDaoFactory.get();
		d.update(h);
	}

	@Override
	public void displayHospital() throws ClassNotFoundException, SQLException 
	{
		HospitalDao d=HospitalDaoFactory.get();
		d.display();
	}
	@Override
	public void sortHospital(Hospital h) throws ClassNotFoundException, SQLException 
	{
		HospitalDao d=HospitalDaoFactory.get();
		d.sort();
	}
}
