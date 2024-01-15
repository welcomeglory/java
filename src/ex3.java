
public class ex3 {

	public static void main(String[] args) {
		/*int num = 9;
		if((num % 2) == 1)
			System.out.println("홀수입니다.");
		else if((num % 2) == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("0입니다.");*/
		
		/*num 변수 선언 후 해당 수가 3의 배수 이자 2의 배수이면 
		 6의 배수 입니다.
		int num = 6;
		if((num % 3) == 0 && (num % 2) == 0)
			System.out.println("6의 배수입니다.");
		else
			System.out.println("6의 배수가 아닙니다.");
			*/
		/*국어 영어 수학 변수 선언 후에 총점과 평균을 구한후 
		 90이상이면 수입니다.
		 80이상이면 우입니다.*/
		int kor = 75, eng = 60, math = 80;
	    double avg;
		
		avg = (kor + eng + math) / 3.0;
		
		if(avg >= 90)
			System.out.println("평균 90이상이면 수입니다.");
		else if(avg >=80)
			System.out.println("평균 80이상이면 우입니다.");
		else if(avg >=70)
			System.out.println("평균70이상이면 미입니다.");
		else if(avg >=60)
			System.out.println("평균 60이상이면 양입니다.");
		else 
			System.out.println("나머지는 가입니다.");		
	}
	
       
       
		

	

}
