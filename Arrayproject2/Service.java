package Arrayproject2;

import java.util.Scanner;

public class Service {
Product[] arr;
int k=0;
Scanner ip=new Scanner(System.in);
void createDatabase(int size) {
	arr=new Product[size];
	System.out.println("Database is created");
}
void Addproduct()
{
	System.out.println("========Adding the product in database=============");
	
	if(k==arr.length) {
		System.out.println("Database is full...");
	}
	else {
		System.out.println("enter the product id");
		int pid=ip.nextInt();
		System.out.println("enter the product name");
		String pname=ip.next();
		System.out.println("enter the product price");
		double price=ip.nextDouble();
		System.out.println("enter the product company");
		String company=ip.next();
		System.out.println("enter the product quantity");
		int qty=ip.nextInt();
		Product p=new Product(pid, pname, price, company, qty);
	    arr[k]=p;
	    k++;
	}
}
void findById() {
	System.out.println("========================");
	System.out.println("Enter the id");
	int c=0;
	int pid=ip.nextInt();
	for(Product ele:arr) {
		if(ele.getPid()==pid) {
			System.out.println("pid:"+ele.getPid());
			System.out.println("pname:"+ele.getPname());
			System.out.println("price:"+ele.getPrice());
			System.out.println("company:"+ele.getCompany());
			System.out.println("quantity:"+ele.getQty());
			c++;break;
		}
	}
	if(c==0) {
		System.out.println("Id Not found");
	}
	System.out.println("===========================");
}
void findbycompany() {
	System.out.println("========================");
	System.out.println("Enter the company");
	int c=0;
	String cmp=ip.next();
	for(Product ele:arr) {
		if(ele.getCompany()==cmp) {
			System.out.println("pid:"+ele.getPid());
			System.out.println("pname:"+ele.getPname());
			System.out.println("price:"+ele.getPrice());
			System.out.println("company:"+ele.getCompany());
			System.out.println("quantity:"+ele.getQty());
			c++;break;
		}
	}
	if(c==0) {
		System.out.println("Id Not found");
	}
	System.out.println("===========================");
}
void update() {
	System.out.println("========================");
	System.out.println("Enter the id");
	int pid=ip.nextInt();
	for(Product ele:arr) {
		if(ele.getPid()==pid) {
		System.out.println("enter new pname");
		String pn=ip.next();
		ele.setPname(pn);
		System.out.println("enter new price");
		int p=ip.nextInt();
		ele.setPrice(p);
		System.out.println("enter new company");
		String c=ip.next();
		ele.setCompany(c);
		System.out.println("enter new quantity");
		int n=ip.nextInt();
		ele.setQty(n);
		}
	}
}
void Alldetails() {
	System.out.println("pid\tpname\tprice\tcompany\tqty");
	System.out.println("===============================");
	for(Product ele:arr) {
		System.out.println(ele.getPid()+"\t"+ele.getPname()+"\t"+ele.getPrice()+"\t"+ele.getCompany()+"\t"+ele.getQty());
	}
}
}
