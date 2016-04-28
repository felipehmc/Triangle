package formas;

public class Formas {
    
    public static void main(String[] args) {
        Triangle T1 = new Triangle("T1");
        T1.putDimensions(3,9);
        float a = T1.calculateArea();
        System.out.printf("%f", a);
    }
    
}
