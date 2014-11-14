package employee;

import java.text.Collator;
import java.util.Locale;

public abstract class Employee implements Comparable {

	protected int id;
	protected String name;
	protected double salary_rate;
	protected double employee_salary;
	
	abstract double salaryCalc (); 
	
	public void employeeSet(int id,String name,double rate){
		this.id = id;
		this.name = name;
		this.salary_rate=rate;
		this.employee_salary=salaryCalc();
	};
	
	public void salaryPrint (){
		System.out.println("Employee_ID="+id+" "+"Employee NAME:"+name+" "+"SALARY="+this.employee_salary);
	};
	
	/* Перегрузка метода CompareTo() 
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 	 */
	public int compareTo(Object obj)
	  {
	    Employee tmp = (Employee)obj;
	    if(this.employee_salary > tmp.employee_salary)
	    {
	      /* текущее больше полученного */
	      return -1;
	    }   
	    else if(this.employee_salary < tmp.employee_salary)
	    {
	      /* текущее меньше полученного */
	      return 1;
	    }
	    
	    /*В случае равенства среднемесячной зарплаты , упорядочиваем работников по Имени в алфавитном порядке */
	    else if(this.employee_salary == tmp.employee_salary)
	    {
	    	Collator collator = Collator.getInstance(new Locale("en", "US"));
	    	int comparison = collator.compare(this.name, tmp.name);
	    	if (comparison < 0) {
	    	  return -1;
	    	} else {
	    	  return 1;
	    	}	
	    }

	    /* текущее равно полученному */
	    return 0;  
	  }
}
