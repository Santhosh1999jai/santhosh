package Constructor;

public class employee {
	int empid;
	double salary;
	char grade;
	employee(int empid,double salary,char grade)
	{
		this.empid=empid;
		this.salary=salary;
		this.grade=grade;
	}
	void display()
	{
		System.out.println("*****************");
		System.out.println("employee id:"+empid);
		System.out.println("salary:"+salary);
		System.out.println("grade:"+grade);
		System.out.println("*******************");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e1=new employee(123,1000.0,'a');
employee e2=new employee(567,6000.0,'b');
e1.display();
e2.display();
	}

}
