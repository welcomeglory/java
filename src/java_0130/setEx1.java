package java_0130;
import java.util.HashSet;
import java.util.Set;
class INum{
	private int num;
	public INum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}
//중복x, 순서x
public class setEx1 {
	public static void main(String[] args) {
		Set<INum> nums = new HashSet<>();
		 INum num1 = new INum(1);
		 INum num2 = new INum(1);
		 INum num3 = new INum(1);
		 
		 nums.add(num1);
		 nums.add(num2);
		 nums.add(num3);
		 
		 System.out.println(nums);
	}
}




