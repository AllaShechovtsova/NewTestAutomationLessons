package lesson_3.part2;

public class Task14_2_constructors {
	private String name;
	private String surname;
	private int age;
	private String education;
	private String country;

	public Task14_2_constructors(String name, String surname) {
		this.name=name;
		this.surname=surname;
	}

	public Task14_2_constructors(String name, String surname, int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
	}
	

	public Task14_2_constructors(String name, String surname, int age, String education) {
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.education=education;
	}

	public Task14_2_constructors() {
		country="Ukraine";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static void main(String[] args) {
		Task14_2_constructors myInstance= new Task14_2_constructors("Alla","Shechovtsova");
		Task14_2_constructors myInstance1= new Task14_2_constructors("Serg","Maksiyta",35);
		Task14_2_constructors myInstance2= new Task14_2_constructors("Serg","Petroff",25,"master");
		Task14_2_constructors myInstance3= new Task14_2_constructors();
		Task14_2_constructors myInstance4= new Task14_2_constructors();
		Task14_2_constructors myInstance5= new Task14_2_constructors();

		System.out.println(myInstance2.getName());
		System.out.println(myInstance3.getCountry());
	}

}
