
public class ex4 {

	public static void main(String[] args) {
	    //-80,33,55 ÃÖ´ëƒ„ Ãú·Â
		int a = 0, b = 3, c = 55;
		int max = a;
		
		//max = (a > b)?a :b ;
		//max = c > max? c: max;
			
			
		//max = (a > b) ? ((a>c)?a:c) : ((b>c)?b:c);
		
		//System.out.println(max);
	    if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		 /*if(a > b ) {
			max = a;		
			if(a > c )
				max = a;
			else 
				max = c;
		}
		else {
			if(b > c)
				max = b;
			else
				max = c;
		}*/
		System.out.println(max);
			
		
		

	}

}
