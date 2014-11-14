package employee;

public class Employee_fixed extends Employee{
	
	public Employee_fixed (int identificator, String employee_name){
		this.id=identificator;
		this.name=employee_name;
		this.employee_salary=0;
	};
	
	@Override
	double salaryCalc (){
		this.employee_salary=this.salary_rate;
		return employee_salary;
	};
}
