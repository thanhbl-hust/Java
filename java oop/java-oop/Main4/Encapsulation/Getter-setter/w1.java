class Person{
	private int id;
	private String name;
	private int age;
	private String address;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

public class Entry {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(1001);
		p.setName("Quynh");
		p.setAge(24);
		p.setAddress("Ha Noi");
		System.out.println("Id: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Address: " + p.getAddress());
	}
}