package latest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import latest.Employee.Address;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("121", "Rahul", Address.MUMBAI,10000,21));
		empList.add(new Employee("112", "Vijay", Address.MUMBAI,50000,26));
		empList.add(new Employee("012", "Shaharukh", Address.DELHI,15000,32));
		empList.add(new Employee("321", "Gauri", Address.MUMBAI,30000,15));
		empList.add(new Employee("122", "RahulAlone", Address.MUMBAI,27000,24));

		// empList.stream().filter(e->e.getAddress()!=Address.MUMBAI).map(e->e.getName().toUpperCase()).forEach(System.out::println);
		// empList.stream().filter(e->Integer.parseInt(e.getId())> 100 &&
		// Integer.parseInt(e.getId())
		// <300).map(e->e.getName().toUpperCase()).forEach(System.out::println);
		List<Employee> emp = empList.stream().filter(e -> e.getAddress() == Address.MUMBAI)
				.collect(Collectors.toList());
		emp.forEach(x -> System.out.println(x));

		empList.stream().filter(e -> e.getAddress() == Address.MUMBAI).forEach(System.out::println);

		long count = empList.stream().count();
		int newCount = (int) (count * 15);

		System.out.println("New Count :->" + String.valueOf(newCount));
		String name = String.valueOf(newCount);

		if (!name.isEmpty()) {
			System.out.println("Yes String is there" + name);

			Map<String, Employee> empMap = new HashMap<>();

//			empMap.put("First", new Employee("121", "Rahul", Address.MUMBAI));
//			empMap.put("Second", new Employee("112", "Vijay", Address.MUMBAI));
//			empMap.put("Third", new Employee("012", "Shaharukh", Address.DELHI));
//			empMap.put("Fourth", new Employee("321", "Gauri", Address.MUMBAI));
//			empMap.put("First", new Employee("122", "RahulAlone", Address.MUMBAI));

			Map<String, Employee> empMap1 = new HashMap<>();
			//count=0;
//			if(empMap.containsKey("First")) {
//				empMap1.put(empMap.get("First"), emp.indexOf("First")+1);
//				
//			}else {
//				empMap1.put(empMap.get("First"), count+1);
//			}
//
//			if(empMap.containsKey("First") || empMap.get("Fifth").getAddress()==Address.MUMBAI) {
//				
//				System.out.println("Employee details 1."+empMap.get("First"));
//				System.out.println("Employee details 2."+empMap.get("Fifth"));
//				
//			}else {
//				System.out.println("No Employee Found");	
//			}
			
			
//			List<Integer> updatedSalary = empList.stream().filter(e->e.getAge()>25).map(e->e.getSalary()* 2).collect(Collectors.toList());
//			System.out.println("Updated Salary"+updatedSalary);
		
			empList.stream().filter(e->e.getAge()>25).map(e->e.getSalary() * 2 ).peek(e->{
				
			});
		
		
		}
		
		
		
	}

}
