/*
 * ������� 3 ������, ������� � ��� ��� �������, ������� ��������� ����������. ������ ��� ���������� - ��������� ������, ������ ��� ����������
 * ������������� ���������� ������.
 * ������� � ������� ������ ����������� ����� ��� ������� �������������� ���������� �����. ��� ��������� ������ ������� ��������� 
 * "�������������� �������� = 20.8*8*������" , ��� �������� �������� ������� ����� "�������������� �������� = ������������� �������� ������" 
 *  - ����������� ���������� �� ���������� �������������� ��������. ������� ID ���������, ��� ���, �������������� ��������.
 *  - ������� ������ ���� ���� ���������� �� ����������� ���� ������.
 *  - ������� ��������� 3 �������������� ���������� �� ����������� ������.
 *  - ������������ ������/������ �������� ��/� ����.
 *  - ������������ ��������� ������������� ������� �������� �����.
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
		
		workers[2].employeeSet(1,"Andrey",8);
		workers[2].salaryPrint();
		
		workers[3].employeeSet(3,"Mickhail",8);
		workers[3].salaryPrint();
		
		Arrays.sort(workers);
		System.out.println("���������� ����������:");
		
		for (int i=0; i<workers.length; i++) {
			workers[i].salaryPrint();
		}
		
		/*  
		 * ������ �������� � Array List - ������� 2
		ArrayList array = new ArrayList(); 
		
		array.add(workers[0]);
		array.add(workers[1]);
		
		System.out.println(array);
		 */
	}

}
