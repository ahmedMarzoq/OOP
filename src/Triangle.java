public class Triangle {

    private float sideOne,sideTwo,sideThree;

    public Triangle(int calculationType){
        System.out.printf("Enter side one of triangle\n");
        setSideOne(Drive.input.nextFloat());

        System.out.printf("Enter side two of triangle\n");
        setSideTwo(Drive.input.nextFloat());

        if(calculationType == 1)
            triArea(sideOne, sideTwo,sideThree);
        else
            triCircumference(sideOne, sideTwo,sideThree);
    }

    private void setSideOne(float sideOne){
        if (sideOne > 0)
            this.sideOne = sideOne;
        else
            this.sideOne = 1;
    }

    private void setSideTwo(float sideTwo){
        if (sideTwo > 0)
            this.sideTwo = sideTwo;
        else
            this.sideTwo = 1;
    }

    private void setSideThree(float sideThree){
        if (sideThree > 0)
            this.sideThree = sideThree;
        else
            this.sideThree = 1;
    }

    public void triArea(float sideOne, float sideTwo,float sideThree){
        float area = sideOne * sideTwo * sideThree;//wrong equation
        System.out.printf("Area of rectangle : %.4d\n", area);
    }

    public void triCircumference(float sideOne, float sideTwo,float sideThree){
        float area = sideOne + sideTwo + sideThree;
        System.out.printf("Area of rectangle : %.4d\n", area);
    }

}
