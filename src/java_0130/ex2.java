package java_0130;
import java.util.HashSet;
class Num{
	int num;
	public Num(int num) {
		this.num = num;
	}
	@Override
	public int hashCode() {
		//�Է� ������� ���
		return num%2;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.num == (((Num)obj).num))
			return true;
		else
			return false;			
	}
	@Override
	public String toString() {
		return String.valueOf(num);//�� ���
	}
}
public class ex2 {
	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));
		System.out.println("�ν��Ͻ� ��: "+set.size());
		
		for(Num n : set)
			System.out.print(n.toString()+'\t');
		System.out.println();
		/*
		 ====���
		 �ν��Ͻ� ��: 2
		 7799 9955
		 */
	}
}
