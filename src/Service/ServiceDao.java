package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dto.Hospital;

public interface ServiceDao
{
	public void addHospital(Hospital h) throws ClassNotFoundException, SQLException;
	public void deleteHospital(String pname) throws ClassNotFoundException, SQLException;
	public void updateHospital(Hospital h) throws ClassNotFoundException, SQLException;
	public void displayHospital() throws ClassNotFoundException, SQLException;
	public void sortHospital(Hospital h) throws ClassNotFoundException, SQLException;
}
