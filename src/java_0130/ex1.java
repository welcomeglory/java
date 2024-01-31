package java_0130;
import java.util.HashSet;
class Person{
	String name; int age;	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;		
	}
	@Override
	public int hashCode() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name.equals(((Person)obj).name)&&this.age == ((Person)obj).age )
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return name + "("+age+"技)";
	}
}
public class ex1 {
	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE",10));
		hSet.add(new Person("LEE",15));
		hSet.add(new Person("PARK",35));
		hSet.add(new Person("PARK",35));

		System.out.println("历厘等 单捞磐 荐: "+hSet.size());
		System.out.println(hSet);
		/*
		 * 历厘等 单捞磐 荐: 2
		 * [LEE(10技), PARK(35技)]
		 */
	}
}
