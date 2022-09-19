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

		String e = "Engineer";
		char[] ar = e.toCharArray();
		int k = 4;
		char[][] base = new char[23][49];
		for (int i = 0; i < 23; i++) {
			for (int j = 0; j < 49; j++) {
				if (k > e.length() - 1)
					k = 0;
				base[i][j] = ar[k];
				k++;
			}
		}
		int space = 10, variation = 0;
		for (int i = 0; i < 23; i++) {
			for (int j = 2; j < 47; j++) {
				if (j >= space && j < (49 - space)) { // Providing space at the beginning and end of each line
					if ((i == 0 && j > 18 && j < 30) || (i == 1 && j > 22 && j < 26)) // Providing space at the middle
																						// in the first two lines
						System.out.print(" ");
					else
						System.out.print(base[i][j]);
				} else
					System.out.print(" ");

			}
			if (i == 0)
				variation -= 4;
			if (i == 1 || i == 12)
				variation += 2;
			if (i == 21)
				variation -= 2;
			if (i == 2 || i == 4 || i == 9 || i == 15 || i == 18)
				variation++;
			if (i == 11 || i == 13 || i == 22)
				variation--;

			space += variation;

			System.out.println();
		}
	}
}
