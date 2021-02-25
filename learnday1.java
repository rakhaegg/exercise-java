
import java.io.BufferedWriter;
import mypack.MyPackageClass;

public class learnday1 extends resourcelearnday1{

    public static void main(String[] args) {
        
        System.out.println(modifierbooleanValue());
        modify();

    }

     
    public void modify(){
        System.out.println("test ");
    }

    public static Boolean modifierParseBoolean() {
        String name = "Hello World";
        Boolean whatIs = true;

        Boolean answer = whatIs.parseBoolean(name);

        return answer;
    }
    public static boolean modifierbooleanValue(){
        Boolean answer = true;
        
        return answer.booleanValue();
    }


}