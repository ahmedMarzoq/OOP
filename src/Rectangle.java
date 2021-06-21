public class Rectangle {

    private float height,width;
    public Rectangle(int calculationType){
        System.out.printf("Enter width of rectangle\n");
        setWidth(Drive.input.nextFloat());

        System.out.printf("Enter height of rectangle\n");
        setHeight(Drive.input.nextFloat());

        if(calculationType == 1)
            rectArea(height, width);
        else
            rectCircumference(height, width);
    }

    private void setHeight(float height){
        if( height > 0)
            this.height = height;
        else
            this.height = 1;
    }

    private void setWidth(float width){
        if( width > 0)
            this.width = width;
        else
            this.width = 1;
    }

    public void rectArea(float height, float width){
        float area = height * width;
        System.out.printf("Area of rectangle : %.4d\n", area);
    }

    public void rectCircumference(float height, float width){
        float circumference =  2 * (height + width);
        System.out.printf("Circumference of rectangle : %.4d\n", circumference);
    }

}
