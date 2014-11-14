package employee;

public class Employee_hour extends Employee{
	
	public Employee_hour (int identificator, String employee_name){
		this.id=identificator;
		this.name=employee_name;
		this.employee_salary=0;
	};
	
	@Override
	double salaryCalc (){
		this.employee_salary=20.8*8*this.salary_rate;
		return employee_salary;
	};
}
