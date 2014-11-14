package employee;

public abstract class Employee {

	protected int id;
	protected String name;
	protected double salary_rate;
	
	abstract double salaryCalc (); 
	
	public void employeeSet(int id,String name,double rate){
		this.id = id;
		this.name = name;
		this.salary_rate=rate;
	};
	
	public void salaryPrint (){
		System.out.println("Employee_ID="+id+" "+"Employee NAME:"+name+" "+"SALARY="+this.salaryCalc());
	};
}
