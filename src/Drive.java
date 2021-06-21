import java.util.Scanner;

public class Drive {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int shapeID, calcType;
        System.out.printf("Select the shape\n\t1- Circle\n\t2-Square\n\t3-Triangle\n\t4-Rectangle\nShape: ");
        shapeID = input.nextInt();

        System.out.printf("\n\t1- Area\n\t2-Circumference\nType: ");
        calcType = input.nextInt();

        switch (shapeID) {
            case 1:
                new Circle(calcType);
                break;
            case 2:
                new Square(calcType);
                break;
            case 3:
                new Triangle(calcType);
                break;
            case 4:
                new Rectangle(calcType);
                break;

            default:
                break;
        }
    }
}
