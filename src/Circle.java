import java.util.Scanner;

public class Circle {

    private float radius;

    public Circle(int calculationType){
        System.out.printf("Enter radius of circle\n");
        setRadius(Drive.input.nextFloat());
        if(calculationType == 1)
            circleArea(radius);
        else
            circleCircumference(radius);
    }

    private void setRadius(float radius){
        if (radius > 0)
            this.radius = radius;
        else
            this.radius = 1;
    }

    public void circleArea(float radius){
        float area = (float) (Math.PI*radius*radius);
        System.out.printf("Area of circle : %.4f\n", area);
    }

    public void circleCircumference(float radius){
        float circumference = (float) (2*Math.PI*radius);
        System.out.printf("Circumference of circle : %.4f\n", circumference);
    }
}
