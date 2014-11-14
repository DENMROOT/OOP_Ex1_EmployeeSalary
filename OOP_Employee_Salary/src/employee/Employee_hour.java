package employee;

public class Employee_hour extends Employee{
	
	public Employee_hour (int identificator, String employee_name){
		this.id=identificator;
		this.name=employee_name;
	};
	
	@Override
	double salaryCalc (){
		
		return 20.8*8*this.salary_rate;
	};
}
