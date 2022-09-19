package pattern;

public class EngineerHeartPattern {
	/*
	    erEnginee           gineerEng        
    ineerEngineerEngi   rEngineerEngineer    
  gineerEngineerEngineerEngineerEngineerEng  
 gineerEngineerEngineerEngineerEngineerEngin 
gineerEngineerEngineerEngineerEngineerEnginee
ineerEngineerEngineerEngineerEngineerEngineer
neerEngineerEngineerEngineerEngineerEngineerE
eerEngineerEngineerEngineerEngineerEngineerEn
erEngineerEngineerEngineerEngineerEngineerEng
rEngineerEngineerEngineerEngineerEngineerEngi
 ngineerEngineerEngineerEngineerEngineerEngi 
  ineerEngineerEngineerEngineerEngineerEngi  
  neerEngineerEngineerEngineerEngineerEngin  
    rEngineerEngineerEngineerEngineerEngi    
     ngineerEngineerEngineerEngineerEngi     
      ineerEngineerEngineerEngineerEngi      
        erEngineerEngineerEngineerEng        
          ngineerEngineerEngineerEn          
            neerEngineerEngineerE            
               EngineerEnginee               
                  neerEngin                  
                     Eng                     
                      g                                             
	*/
	public static void main(String[] args) {

		String e = "neerEngi";
		char[] ar = e.toCharArray();
		int k = 0;
		char[][] mat = new char[23][49];
		for (int i = 0; i < 23; i++) {
			for (int j = 0; j < 49; j++) {
				if (k > e.length() - 1)
					k = 0;
				mat[i][j] = ar[k];
				k++;
			}
		}
		int a = 10, b = 0;
		for (int i = 0; i < 23; i++) {
			for (int j = 2; j < 47; j++) {
				if (j >= a && j < (49 - a)) {
					if ((i == 0 && j > 18 && j < 30) || (i == 1 && j > 22 && j < 26))
						System.out.print(" ");
					else
						System.out.print(mat[i][j]);
				} else
					System.out.print(" ");

			}
			if (i == 0)
				b -= 4;
			if (i == 1 || i == 12)
				b += 2;
			if (i == 21)
				b -= 2;
			if (i == 2 || i == 4 || i == 9 || i == 15 || i == 18)
				b++;
			if (i == 11 || i == 13 || i == 22)
				b--;

			a += b;

			System.out.println();
		}
	}
}
