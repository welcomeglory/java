class TV2{
	String company;
	int year;
	int inch;
	
	public TV2(String company,int year,int inch) {
		this.company=company;
		this.year=year;
		this.inch=inch;
	}
	public void show(){
		System.out.println(company+"에서 만든"+year +"년형 "+inch +"인치 TV");
	}
}

public class ex18 {
	public static void main(String[] args) {
		TV2 myTV = new TV2("LG",2017,32);
		myTV.show();

	}

}
