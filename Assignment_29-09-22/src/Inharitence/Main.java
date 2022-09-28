package Inharitence;
public class Main {
    
    static <elements> void print(elements value){
        System.out.print(value);
    }
    static <elements> void println(elements value){
        System.out.println(value);
    }
    
    public static void main(String[] args) {
        Circle c1 = new Circle();
        println(c1);
        Rectangle r1 = new Rectangle();
        println(r1);
        Square s1 = new Square();
        println(s1);
    }

}
