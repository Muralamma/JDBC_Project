package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dto.Hospital;
import Factor.ConnectionFactory;

public class HospitalDaoImpl implements HospitalDao
{
	String query="";
	@Override
	public void add(Hospital h) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getConnection();
		query="insert into hospital values(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, h.getHname());
		pst.setString(2, h.getPname());
		pst.setString(3, h.getDisease());
		pst.setString(4, h.getConsultantfee());
		pst.setString(5, h.getBeadcharges());
		pst.setString(6, h.getMedicineamount());
		int count=pst.executeUpdate();
		if(count>0)
			System.out.println("inserted successfully");
		else
			System.out.println("please try again");			
	}

	@Override
	public void delete(String pname) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getConnection();
		query="delete from hospital where pname=?";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, pname);
		int rows=pst.executeUpdate();
		if(rows>0)
			System.out.println("pasient delete successfully");
		else
			System.out.println("pasient not deleted");
	}

	@Override
	public void update(Hospital h) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getConnection();
		query="update hospital set hname=? where pname=?";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, h.getHname());
		pst.setString(2, h.getPname());
		int count=pst.executeUpdate();
		if(count>0)
			System.out.println("updated successfully");
		else
			System.out.println("not updated");
	}

	@Override
	public void display() throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getConnection();
		query="select * from hospital";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet r=pst.executeQuery();
		while(r.next())
		{
			System.out.print("Hname: "+r.getString(1));
			System.out.print("Pname: "+r.getString(2));
			System.out.print("disease: "+r.getString(3));
			System.out.print("consultantfee: "+r.getString(4));
			System.out.print("beadcharges: "+r.getString(5));
			System.out.print("medicineamount: "+r.getString(6));
			System.out.println();
		}
	}
	@Override
	public void sort() throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getConnection();
		query="select * from hospital order by hname";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet r=pst.executeQuery();
		while(r.next())
		{
			System.out.print("Hname: "+r.getString(1));
			System.out.print("Pname: "+r.getString(2));
			System.out.print("disease: "+r.getString(3));
			System.out.print("consultantfee: "+r.getString(4));
			System.out.print("beadcharges: "+r.getString(5));
			System.out.print("medicineamount: "+r.getString(6));
			System.out.println();
		}
	}
	
}
