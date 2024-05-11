package Arrayproject;



public class Arraytype {

	public static void main(String[] args) {
	Employee e1=new Employee(101,"ankit", 54000, 4);
	Employee e2=new Employee(102,"sumit", 94000, 5);
	Employee e3=new Employee(104,"Amit", 67870, 3);
	Employee e4=new Employee(103,"lalit", 97870, 5);
	Employee e5=new Employee(105,"pualit", 9000, 2);
	
	Employee[]arr= {e1,e2,e3,e4,e5};
	for(Employee emp:arr) {
		System.out.println(emp.id+"\t"+emp.name+"\t"+emp.sal+"\t"+emp.exp);
		
	}
	

	}

}
