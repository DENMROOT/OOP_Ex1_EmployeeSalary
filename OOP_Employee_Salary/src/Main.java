import java.util.*;

import employee.*;

public class Main {

	public static void main(String[] args) {
		
		Employee[] workers = new Employee[3];

		workers[0] = new Employee_hour(0, "");
		workers[1] = new Employee_fixed(0, "");
		
		workers[0].employeeSet(0,"Igor",10);
		workers[0].salaryPrint();
		
		workers[1].employeeSet(1,"Denis",100);
		workers[1].salaryPrint();
		
		
		/*  
		 * Запись объектов в Array List - вариант 2
		ArrayList array = new ArrayList(); 
		
		array.add(workers[0]);
		array.add(workers[1]);
		
		System.out.println(array);
		 */
	}

}
