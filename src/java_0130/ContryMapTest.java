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
			System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
			Scanner sc = new Scanner(System.in);
			int population = 0; 	
			String country = " ";
			while (true) {
				System.out.print("���� �̸�, �α� >> ");
				country = sc.next();
				if (country.equals("�׸�")) // �Է� "�׸�" �ϸ� �Է� ����
					break;
				population = sc.nextInt();
				map.put(country, population);
			}
		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			getMap();
		}
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	public void search() {
		try {
			// Ű �Է¹޾Ƽ� �˻��ؼ� ���� ����ϱ� �׸��Ҷ�����
			// ������ �����ϴ� ���
			Scanner sc = new Scanner(System.in);
			String key = " ";
			while (true) {
				System.out.print("�α� �˻� >> ");
				key = sc.next();
				if (key.equals("�׸�")) // �Է� "�׸�" �ϸ� �˻� ����
					break;
				else if (!map.containsKey(key)) { // map�� key�� key�� ���� ������
					System.out.println(key + " ����� �����ϴ�.");
					continue;
				}
				System.out.println(key + " " + map.get(key)); // Ű������ ���� ���
			}
		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
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