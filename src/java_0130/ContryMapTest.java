package java_0130;
import java.util.HashMap;
import java.util.Scanner;
class CountryMap {
	private HashMap<String, Integer> map;
	public CountryMap() {
		map = new HashMap<>();
	}
	public HashMap<String, Integer> getMap() {
		try {
			System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
			Scanner sc = new Scanner(System.in);
			int population = 0; 	
			String country = " ";
			while (true) {
				System.out.print("나라 이름, 인구 >> ");
				country = sc.next();
				if (country.equals("그만")) // 입력 "그만" 하면 입력 종료
					break;
				population = sc.nextInt();
				map.put(country, population);
			}
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			getMap();
		}
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	public void search() {
		try {
			// 키 입력받아서 검색해서 정보 출력하기 그만할때까지
			// 없으면 없습니다 출력
			Scanner sc = new Scanner(System.in);
			String key = " ";
			while (true) {
				System.out.print("인구 검색 >> ");
				key = sc.next();
				if (key.equals("그만")) // 입력 "그만" 하면 검색 종료
					break;
				else if (!map.containsKey(key)) { // map의 key에 key가 있지 않으면
					System.out.println(key + " 나라는 없습니다.");
					continue;
				}
				System.out.println(key + " " + map.get(key)); // 키값으로 내용 출력
			}
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			getMap();
		}
	}
}
public class ContryMapTest {
	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();
		countryMap.getMap();
		System.out.println();
		countryMap.search();
	}
}