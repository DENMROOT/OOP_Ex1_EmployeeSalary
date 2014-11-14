package employee;

public class Employee_fixed extends Employee{
	
	public Employee_fixed (int identificator, String employee_name){
		this.id=identificator;
		this.name=employee_name;
	};
	
	@Override
	double salaryCalc (){
		
		return this.salary_rate;
	};
}
