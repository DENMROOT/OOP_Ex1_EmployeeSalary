/*
 * —оздать 3 класса, базовый и два его потомка, которые описывают работников. ѕервый тип работников - почасова€ оплата, второй тип работников
 * фиксированна€ помес€чна€ оплата.
 * ќписать в базовом классе абстрактный метод дл€ расчета среднемес€чной заработной платы. ƒл€ почасовой оплаты формула следующа€ 
 * "среднемес€чна€ зарплата = 20.8*8*ставка" , дл€ мес€чной зарплаты формула така€ "среднемес€чна€ зарплата = фиксированна€ мес€чна€ ставка" 
 *  - упор€дочить работников по уменьшению среднемес€чной зарплаты. ¬ывести ID работника, его »ћя, среднемес€чную зарплату.
 *  - вывести первые п€ть имен работников из полученного выше списка.
 *  - вывести последние 3 идентификатора работников из предыдущего списка.
 *  - организовать чтение/запись коллекци из/в файл.
 *  - организовать обработку некорректного формата входного файла.
 */ 


import java.util.*;

import employee.*;

public class Main {

	public static void main(String[] args) {
		
		Employee[] workers = new Employee[4];

		workers[0] = new Employee_hour(0, "");
		workers[1] = new Employee_fixed(0, "");
		workers[2] = new Employee_hour(0, "");
		workers[3] = new Employee_hour(0, "");
		
		workers[0].employeeSet(2,"Igor",10);
		workers[0].salaryPrint();
		
		workers[1].employeeSet(0,"Denis",100);
		workers[1].salaryPrint();
		
		workers[2].employeeSet(1,"Mickhail",8);
		workers[2].salaryPrint();
		
		workers[3].employeeSet(3,"Mickhail",8);
		workers[3].salaryPrint();
		
		boolean equalWorkers = workers[3].equals(workers[2]);
		System.out.println("ќбъекты 3 и 2 равны ?" + equalWorkers);
		
		Arrays.sort(workers);
		System.out.println("–езультаты сортировки:");
		
		for (int i=0; i<workers.length; i++) {
			workers[i].salaryPrint();
		}
		
		System.out.println("ѕереопределение toString " + workers[1]);
		
		System.out.println( workers[3].equals(workers[2]) ? "–аботники одинаковы ": "–аботники Ќ≈ одинаковы ");
		
		/*  
		 * «апись объектов в Array List - вариант 2
		ArrayList array = new ArrayList(); 
		
		array.add(workers[0]);
		array.add(workers[1]);
		
		System.out.println(array);
		 */
	}

}
