package com.adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/ 
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);
		/** Using Object Adapter **/
		Employee adapterEmployee = new Employee();
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(adapterEmployee);
		populateEmployeeData(adapterEmployee);
		BusinessCardDesigner objectDesigner = new BusinessCardDesigner();
		String objectCard = designer.designCard(objectAdapter);
		System.out.println(objectCard);
		
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
