
import java.util.*;

public class ListOfExceptions{
    public void exceptionTest(){
        ArrayList<Object> exceptionList = new ArrayList<Object>();
        exceptionList.add("13");
        exceptionList.add("Hello world!");
        exceptionList.add(48);
        exceptionList.add("Goodbye World");
    
        try {
            for(int i = 0; i < exceptionList.size(); i++){
                Integer castedValue = (Integer) exceptionList.get(i);
            } 
        } catch(ClassCastException e) {
            System.out.println("Caught");
        }
    
   }
}