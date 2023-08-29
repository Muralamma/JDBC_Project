package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dto.Hospital;
public interface HospitalDao 
{
	public void add(Hospital h) throws ClassNotFoundException, SQLException;
	public void delete(String pname) throws ClassNotFoundException, SQLException;
	public void  update(Hospital h) throws ClassNotFoundException, SQLException;
	public void  display() throws ClassNotFoundException, SQLException;
	public void sort()throws ClassNotFoundException, SQLException;
}
