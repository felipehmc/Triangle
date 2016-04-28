package formas;

public class Triangle extends Shape {
    private float base;
    private float height;
    Triangle(String aName){
        super(aName);
    }
    public void putDimensions(float b,float h){
        base = b;
        height = h;
    }
    public float calculateArea(){
        float area;
        area = base*height/2;
        return area;
    }
}

