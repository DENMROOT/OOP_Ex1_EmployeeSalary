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
		
		workers[0].employeeSet(0,"Igor",10);
		workers[0].salaryPrint();
		
		workers[1].employeeSet(1,"Denis",100);
		workers[1].salaryPrint();
		
		workers[2].employeeSet(2,"Mickhail",8);
		workers[2].salaryPrint();
		
		workers[3].employeeSet(2,"Mickhail",8);
		workers[3].salaryPrint();
		
		// ����� ���������� equals ������� ����������� !!!
		boolean equalWorkers = workers[3].equals(workers[2]);
		System.out.println("������� 3 � 2 ����� ?" + equalWorkers);
				
		Arrays.sort(workers);
		System.out.println("���������� ����������:");
		
		for (int i=0; i<workers.length; i++) {
			workers[i].salaryPrint();
		}
		
		System.out.println("��������������� toString " + workers[1]);
		
		boolean equalWorkersAfter = workers[2].equals(workers[1]);
		System.out.println("������� 3 � 2 ����� ?" + equalWorkersAfter);
		
		/*  
		 * ������ �������� � Array List - ������� 2
		ArrayList array = new ArrayList(); 
		
		array.add(workers[0]);
		array.add(workers[1]);
		
		System.out.println(array);
		 */
	}

}
