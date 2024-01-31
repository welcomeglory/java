package java_0125;
class Person {
	String name; 	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름:"+name+" 나이:"+age;
	}
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		if (name == other.name && age == other.age)
			return true;
		return false;
	}
}
public class equals3 {
	public static void main(String[] args) {
		Person p1 = new Person("Lee", 29);
		Person p2 = new Person("Lee", 29);
		System.out.println(p1);
		if (p1.equals(p2))
			System.out.println("같은 사람");
		else
			System.out.println("다른 사람");
	}
}
