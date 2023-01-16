package latest;

public class Employee {

	enum Address {
		MUMBAI, DELHI, AMARAVATI, NAGPUR, AMRITSAR

	}

	private String id;
	private String name;
	private Address address;
	private int salary;
	private int age;

	public Employee(String id, String name, Address address, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", age=" + age
				+ "]";
	}

}
