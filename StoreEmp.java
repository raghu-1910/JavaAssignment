package casestudy3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StoreEmp {
	public static void main(String[] args) {
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		int empid=100;
		
		
		while(true)
		{
			System.out.println("Employee Managament Application :");
			System.out.println("1).Add Employee Details :");
			System.out.println("2).Update Employee Details :");
			System.out.println("3).Delete Employee Detail :");
			System.out.println("4).Get Employee Detail :");
			System.out.println("5).Get All Employee Details :");
			Scanner sc = new Scanner(System.in);
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter the add Employee Detail :");
				System.out.println("Enter Employee Name :");
				String empname = sc.next();
				System.out.println("Enter Employee Code :");
				int empcode = sc.nextInt();
				System.out.println("Enter Employee Email Id :");
				String empmail = sc.next();
				System.out.println("Enter Employee Salary :");
				int empsalary = sc.nextInt();
				System.out.println("Enter Employee Address :");
				String empadd = sc.next();
				
				Employee ep = new Employee(empname,empcode,empmail,empsalary,empadd);
				emp.put(++empid, ep);
				System.out.println("Employee Details Added  Successfully :"+empid);
				
				break;
			case 2://For Updating Employee Detail:
				System.out.println("Enter to update the employee detail :");
				System.out.println("Enter Id to update : ");
					int empid1 = sc.nextInt();
				System.out.println("Enter Employee Name :");
				String empname1 = sc.next();
				System.out.println("Enter Employee Code :");
				int empcode1 = sc.nextInt();
				System.out.println("Enter Employee Email Id :");
				String empmail1 = sc.next();
				System.out.println("Enter Employee Salary :");
				int empsalary1 = sc.nextInt();
				System.out.println("Enter Employee Address :");
				String empadd1 = sc.next();
				
				Employee ep1 = new Employee(empid, empcode1, empmail1, empsalary1, empadd1);//Using Parameterized Constructor
				emp.put(empid1, ep1);
				System.out.println("Employee Detail Update Successfully : "+empid1);
				
				
				break;
			case 3://For Deleting Employee Detail:
				System.out.println("Enter id to delete Employee Detail :");
		    	   int empid2= sc.nextInt();
		    	   
		    	   Employee empobj=emp.remove(empid2);
		    	   System.out.println("Employee Detail Deleted :"+empid2);
				
				break;
			case 4://For Particular Employee details
				System.out.println("Enter id to get the Employee details");
	    	      int empid3=sc.nextInt();
	    	      Employee empobj1=emp.get(empid3);
	    	      System.out.println(empobj1);
				
				break;
			case 5://For details of all the Employees
				Set<Entry<Integer,Employee>> res = emp.entrySet();
				Iterator<Entry<Integer,Employee>> itr = res.iterator();
				while(itr.hasNext())
				{
					Entry<Integer,Employee> finalres = itr.next();
					System.out.println(finalres.getKey()+" "+finalres.getValue());
				}
				
				
				break;
				default:
					System.out.println("--------Wrong Selection--------");
			}
		}
	}
}


