import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import javax.naming.NamingException;

public class RomanNumbers{
  public static String RomanNumerals(int Int) {
	  String res = "";
	  				// check the condition for less then or equal to Zero or Grater then 3000
					  if(Int <=0 || Int>3000)
					  {
						//if given input value equals to Zero then
						  
						  if(Int==0)
							 {
							    res="Zero is not Convert into Roman Numeral value";
						     }
						//if given input value less then Zero then
						  
							 else if(Int<0)
							 {
							     res="Negative value is not Convert into Roman Numeral value";
						     }
						//if given input value Grater then 3000 then
						  
							 else if(Int>3000)
							 {
							      res="Please Enter the below 3000";
						     }
					  }
					  
					  //if given condition is true it convert Arabic Number into Numeral
					  
					  else
					  {
						    LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
						    roman_numerals.put("M", 1000);
						    roman_numerals.put("CM", 900);
						    roman_numerals.put("D", 500);
						    roman_numerals.put("CD", 400);
						    roman_numerals.put("C", 100);
						    roman_numerals.put("XC", 90);
						    roman_numerals.put("L", 50);
						    roman_numerals.put("XL", 40);
						    roman_numerals.put("X", 10);
						    roman_numerals.put("IX", 9);
						    roman_numerals.put("V", 5);
						    roman_numerals.put("IV", 4);
						    roman_numerals.put("I", 1);
						  
						    		for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
								      int matches = Int/entry.getValue();
								      res += repeat(entry.getKey(), matches);
								      Int = Int % entry.getValue();
								    }
					  }
					  	    return res;
	               }
  
  public static String repeat(String s, int n) {
	    if(s == null) {
	        return null;
	    }
	    final StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++) {
	        sb.append(s);
	    }
	    return sb.toString();
  }
  public static void main(String[] args) throws IOException,NamingException{
		  RomanNumbers rn=new RomanNumbers();
		  Scanner keyboard = new Scanner(System.in);
		  System.out.print("Please enter Arabic Number:\n");
		 if (keyboard.hasNextInt()==true){
				  
				  Integer s = Integer.parseInt(keyboard.nextLine());
				  System.out.println("Roman Numeral values is   :  "+rn.RomanNumerals(s));
		 }
		 else{;
			 	  System.out.println("please enter the valid Arabic Number");
		 }
      }
}