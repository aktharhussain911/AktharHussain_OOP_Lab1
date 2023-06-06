package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.EmployeeService.EmpServiceImplements;

public class EmployeeApp {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first Name");
			String fname=sc.next();
			System.out.println("Enter Last Name");
			String lname=sc.next();
			Employee e1=new Employee(fname,lname);
			
				
			EmpServiceImplements ess=new EmpServiceImplements();
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. HR");
			System.out.println("4. Legal");
			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			String genemial="";
			String genpass="";
			switch(choice)
			{
			case 1:
				genemial=ess.generateEmailId(e1, "tech");
				break;
			case 2:
				genemial=ess.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "admin");
				break;
			case 3:
				genemial=ess.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "hr");
				break;
			case 4:
				genemial=ess.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "legal");
				break;
			default:
				 System.out.println("Please enter valid choice");
				
			}
			genpass=ess.generatePassword();
			e1.setEmail(genemial);
			e1.setPassword(genpass);
			
			ess.showDetails(e1);
	}

}
