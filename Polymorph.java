
class Data1 {    
    public void output(){
        System.out.println("Data1");
    }
}
class Data2 extends Data1 {    
    
    public void output(){
        System.out.println("Data2");
    }
}
class Data3 extends Data1 {    
    
    public void output(){
        System.out.println("Data3");
    }
}
public class Polymorph {
    public static void main(String[] args) {
        Data1 obj1 = new Data1();
        Data1 obj2 = new Data2();
        Data1 obj3 = new Data3();

        obj1.output();
        obj2.output();
        obj3.output();
        
        
    }   
}
