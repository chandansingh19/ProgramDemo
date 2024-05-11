package Arrayproject;

import java.util.Scanner;

public class App {
	
public static void main(String[] args) {
	Service s=new Service();
	System.out.println("======Product Management System=========");
	Scanner ip=new Scanner(System.in);
	System.out.println("enter size of Database!!!!...");
	int size=ip.nextInt();
	s.createDatabase(size);
	while(true) {
		System.out.println("=======Menu========");
		System.out.println("1.add product\n2.Find by id\n3.Find by Company\n4.Update by id\n5.All Deatils\n6.Exit");
	    System.out.println("Enter the option");
	    int op=ip.nextInt();
	    switch(op) {
	    case 1: s.Addproduct();;break;
	    case 2:s.findById();break;
	    case 3:System.out.println("Not implemented");break;
	    case 4:s.update();break;
	    case 5:s.Alldetails();break;
	    case 6:System.out.println("Thank you....!!!");System.exit(0);;
	    default:System.out.println("invalid option....");
	    }
		
	}
}
}
