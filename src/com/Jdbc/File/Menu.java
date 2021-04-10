package com.Jdbc.File;
import java.sql.SQLException;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int n, id, salary;
		String name, job;
		boolean x = false;
		
		do {
			
			System.out.println("1. Select Records");
			System.out.println("2. Insert Records");
			System.out.println("3. Delete Records");
			System.out.println("4. Update Records");
			System.out.println("5. select All Records");
			System.out.println("Enter Above Mention Option: ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			

			switch (n) {
			case 1:
				System.out.println("1. Employee Records Selection");
				System.out.println("Please Select id");
				id = sc.nextInt();
				Select select = new Select(id);
				x = true;
				break;
			case 2:
				System.out.println("2. Employee Records Insertiton");
				System.out.println("Enter Employee  id");
				id = sc.nextInt();
				System.out.println("Enter Employee  Name");
				name = sc.next();
				System.out.println("Enter Employee  Job");
				job = sc.next();
				System.out.println("Enter Employee  Salary");
				salary = sc.nextInt();

				Insert insert = new Insert(id, name, job, salary);
				x = true;
				break;
			case 3:
				System.out.println("3. Employee Records Deletion");
				System.out.println("Enter Employee  id");
				id = sc.nextInt();
				Delete delete = new Delete(id);
				// Delete D1 = new Delete(id);
				x = true;
				break;
			case 4:
				System.out.println(" Employee Records Updation");

				System.out.println("Enter Employee Name You Have To Update");
				name = sc.next();
				System.out.println("Enter Employee Salary You Have To Update");
				salary = sc.nextInt();
				System.out.println("Enter Employee Job You Have To Update");
				job = sc.next();
				System.out.println("Enter Confirm Employee id You Have To Update");
				id = sc.nextInt();

				Update update = new Update(name, job, salary, id);
				x = true;
				break;
			case 5:

				SelectAll selectAll = new SelectAll();
				x = true;
				break;

			default:
				System.out.println(" **-- Invalid Selection--** ");
				x = true;
				// break;

			}
		} while (x != false);

	}

}
