import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import javax.naming.NamingException;

public class TestForTestCase{

  public static String RomanNumerals(int Int) {
   String res = "";
       // check the condition is equal to Zero
     
        if(Int==0)
        {
           res="Zero is not Convert into Roman Numeral value";
           }
      //if given input value less then Zero then
        
        else if(Int<=-1)
        {
            res="Negative value is not Convert into Roman Numeral value";
           }
      //if given input value Grater then 10 then
        
        else if(Int>10)
        {
             res="Please Enter the value as 10";
           }
       //if given condition is true it convert Arabic Number into Numeral
       else if(Int==10){
          LinkedHashMap<String, Integer> roman_numerals=new LinkedHashMap<String,Integer>();
          roman_numerals.put("X", 10);
          for ( Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
              res = "Given Arabic Number Converted into Numeric : "+Int+"  "+entry.getKey();//System.out.println("key :"+key);
              
          }
          
             }
        
       return res;
        
  }       

public static void main(String[] args) {
 TestForTestCase t=new TestForTestCase();
 System.out.println("if value is 0 :"+t.RomanNumerals(0));
 System.out.println("if value is -1 :"+t.RomanNumerals(-1));
 System.out.println("if value is 11 :"+t.RomanNumerals(11));
 System.out.println("if value is 10 :"+t.RomanNumerals(10));
}

}