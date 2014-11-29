package employee;

import java.awt.Point;
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
	
	public String toString () {
		
		return "Employee name = " + name;
	}
	
	public boolean equals (Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		final Employee other = (Employee) obj; 
		
		System.out.println(name);
		System.out.println(other.name);
		if (name.equals(other.name)) return true;
		else return false;
			
	} 
	
	/* ���������� ������ CompareTo() 
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 	 */
	public int compareTo(Object obj)
	  {
	    Employee tmp = (Employee)obj;
	    if(this.employee_salary > tmp.employee_salary)
	    {
	      /* ������� ������ ����������� */
	      return -1;
	    }   
	    else if(this.employee_salary < tmp.employee_salary)
	    {
	      /* ������� ������ ����������� */
	      return 1;
	    }
	    
	    /*� ������ ��������� �������������� �������� , ������������� ���������� �� ����� � ���������� ������� */
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

	    /* ������� ����� ����������� */
	    return 0;  
	  }
}
