package br.com.estudos._009_.strings;

public class TrimTest{
	   public static void main(String args[]){
		   
	      String blank  = " ";  // one space
	      String line = blank + "hello" + blank + blank;
	      line.concat("world");
	      String newLine  =  line.trim();
	      System.out.println((int)(line.length() + newLine.length()));
	   }
	}

	//Resultado: 13
	// Note that line.concat("world") does not change line itself. It creates a new String object containing " hello  world" but it is lost because there is no reference to it.
	//Similarly, calling trim() does not change the object itself.
	//So the answer is 8 + 5 = 13 !
