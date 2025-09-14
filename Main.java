//Prototype Pattern
interface Prototype {
	Prototype clone();
}
class Person implements Prototype {
	public int id;
	public String name;
	public int age;

	public Person(int id,int age,String name) {
		this.id = id;
		this.name = name;
		this.age=age;
	}
	@Override
	public Prototype clone() {
		return new Person(id,age,name);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
class Main {
	public static void main (String[] args) {
		Person s1 = new Person(17,21,"Anamika");
		//cloned student s1
		Person s2 = (Person)s1.clone();

		System.out.println("Original: " + s1);
		System.out.println("Cloned  : " + s2);
	}
}