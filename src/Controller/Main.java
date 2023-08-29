package Controller;

import java.security.Provider.Service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Dto.Hospital;
import Factor.ServiceDaoFactory;
import Service.ServiceDao;

public class Main {

	private static final String ServiceFactory = null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc=new Scanner(System.in);
		Hospital h=new Hospital();
		while(true)
		{
			System.out.println("==================");
			System.out.println("WELCOME TO HOSPITAL APPLICATION");
			System.out.println("1: INSERTION");
			System.out.println("2: DELETION");
			System.out.println("3: UPDATE");
			System.out.println("4: DISPLAY");
			System.out.println("5: SORTING");
			System.out.println("6: EXIT");
			System.out.println("===================");
			System.out.println("ENTER OPTION");
			int option=sc.nextInt();
			String hname="";String pname="";String disease="";String consultantfee="";String beadcharges="";String medicineamount="";
			ServiceDao s=ServiceDaoFactory.get();
			switch(option)
			{
			case 1:
					System.out.println("===inserted here======");
					System.out.println("enter hname");
					hname=sc.next();
					System.out.println("enter pname");
					pname=sc.next();
					System.out.println("enter disease");
					disease=sc.next();
					System.out.println("enter consultantfee");
					consultantfee=sc.next();
					System.out.println("enter beadcharges");
					beadcharges=sc.next();
					System.out.println("enter medicineamount");
					medicineamount=sc.next();
					h.setHname(hname);
					h.setPname(pname);
					h.setDisease(disease);
					h.setConsultantfee(consultantfee);
					h.setBeadcharges(beadcharges);
					h.setMedicineamount(medicineamount);
					s.addHospital(h);
					System.out.println("data inserted successfully");
					break;
			case 2:
					System.out.println("======deletion here=======");
					System.out.println("enter pname");
					pname=sc.next();
					h.setPname(pname);
					s.deleteHospital(pname);
						System.out.println("row deleted successfully");
						break;
			case 3:
					System.out.println("======update here======");
					System.out.println("enter pname");
					pname=sc.next();
					System.out.println("enter hname");
					hname=sc.next();
					h.setPname(pname);
					h.setHname(hname);
					s.updateHospital(h);
					System.out.println("update successfully");
					break;
			case 4:
					System.out.println("======display here======");
					s.displayHospital();
					break;
			case 5:
					System.out.println("====sorting=====");
					s.sortHospital(h);
					break;
			case 6:
					System.out.println("=====exit=======");
					System.out.println("thank you for using hospital application");
					System.exit(0);
			default:
					System.out.println("enter a valid option");	
			}
			System.out.println("-------******-------");
			System.out.println("enter press yes to continue no to exit");
			String st=sc.next();
			if(st.equalsIgnoreCase("yes"))
			{
		}
			else 
				break;
	}}

}
