import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import javax.naming.NamingException;

public class TestForTestCase{

  public static String romanNumerals(int inputValue) {
   String result = "";
       // check the condition is equal to Zero
     
        if(inputValue==0)
        {
           result="Zero is not Convert into Roman Numeral value";
           }
      //if given input value less then Zero then
        
        else if(inputValue<=-1)
        {
            result="Negative value is not Convert into Roman Numeral value";
           }
      //if given input value Grater then 10 then
        
        else if(inputValue>10)
        {
             result="Please Enter the value as 10";
           }
       //if given condition is true it convert Arabic Number into Numeral
       else if(inputValue==10){
          LinkedHashMap<String, Integer> roman_numerals=new LinkedHashMap<String,Integer>();
          roman_numerals.put("X", 10);
          for ( Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
              result = "Given Arabic Number Converted into Numeric : "+inputValue+"  "+entry.getKey();//System.out.println("key :"+key);
              
          }
          
             }
        
       return result;
        
  }       

public static void main(String[] args) {
 TestForTestCase test =new TestForTestCase();
 System.out.println("if value is 0 :"+test.romanNumerals(0));
 System.out.println("if value is -1 :"+test.romanNumerals(-1));
 System.out.println("if value is 11 :"+test.romanNumerals(11));
 System.out.println("if value is 10 :"+test.romanNumerals(10));
}

}
