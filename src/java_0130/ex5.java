package java_0130;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
class Country {
	String name;
	int ponum;
	public Country(String name, int ponum) {
		this.name = name;
		this.ponum = ponum;
	}
	public void findCountry(String name) {
		if (name.equals(this.name))
			System.out.println(name + "의 인구는 " + this.ponum);
	}
}
public class ex5 {
	public static void main(String[] arge) {
		List<Country> country = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요");
		for (int i = 0; i < 4; i++) {			System.out.print("나라 이름, 인구 >> ");
			String input = sc.nextLine();
			StringTokenizer info = new StringTokenizer(input);
			String name = info.nextToken();
			int ponum = Integer.valueOf(info.nextToken());
			if (name.equals("그만"))
				break;
			country.add(new Country(name, ponum));			
		}
		while (true) {
			System.out.println("나라 검색 >> ");
			String name = sc.next();
			if (name.equals("그만"))
				break;
			for (int i = 0; i < country.size(); i++) {
				Country c= country.get(i);
				c.findCountry(name);
			}
		}
	}
}
