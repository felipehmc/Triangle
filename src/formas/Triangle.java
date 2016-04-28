package formas;

public class Triangle extends Shape {
    private float base;
    private float height;
    Triangle(String aName){
        super(aName);
        base=3;
        height=3;
    }
    public float calculateArea(){
        float area;
        area = base*height/2;
        return area;
    }
}
