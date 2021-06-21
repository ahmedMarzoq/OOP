public class Square {

    private float length;

    public Square(int calculationType){
        System.out.printf("Enter length of square\n");
        setLength(Drive.input.nextFloat());
        if(calculationType == 1)
            squareArea(length);
        else
            squareCircumference(length);
    }

    private void setLength(float length){
        if( length > 0)
            this.length = length;
        else
            this.length = 1;
    }

    public void squareArea(float length){
        float area = length * length;
        System.out.printf("Area of square : %.4f\n", area);
    }

    public void squareCircumference(float length){
        float circumference =  4 * length;
        System.out.printf("Circumference of square : %.4f\n", circumference);
    }

}
