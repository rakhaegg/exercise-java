


class Master{
    String name = "Rakha";
    public void printName(String x){
        System.out.println(x);
    }
}

public class Inheritance extends Master {
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        String x = obj.name;
        obj.printName(x);
    }

}
