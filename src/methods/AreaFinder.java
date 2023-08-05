package methods;

import java.util.Scanner;

public class AreaFinder {
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
    /* ask user to select: 1. Square, 2.Rectangle, 3. Circle, 4. Triangle
    Then print the area of a selected shape
     */
        Scanner input = new Scanner(System.in);
        int selection = getSelection(input);

        AreaFinder af = new AreaFinder();

        af.startOperations(input, selection, af);
    }

    public void startOperations(Scanner input, int selection, AreaFinder af){
        if (selection == 1) {
            af.squareAreaHelper(input, af);
        }else if(selection==2){
            af.rectangleAreaHelper(input, af);
        }else if(selection==3){
            af.circleAreaHelper(input, af);
        }else if(selection==4){
            af.triangleSquareHelper(input, af);
        }else if(selection==5){
            System.out.println("You selected to exit...");
        }else{
            System.out.println("Wrong number, please select 1-5");
        }
    }
    // name:squareArea,
    // logic: handle square related operations
    // return: nothing (void)
    // parameters: Scanner input, AreaFinder object

    public void squareAreaHelper(Scanner input, AreaFinder af){
        System.out.println("Type the length of a square: ");
        int len = input.nextInt();
        int area = len * len;
        System.out.println("The area of a square with the given length is " + af.calcSquareArea(len));
    }
    public void rectangleAreaHelper(Scanner input, AreaFinder af){
        System.out.println("Type the length and width of a rectangle: ");
        int len = input.nextInt();
        int wid = input.nextInt();
        System.out.println("The area of a rectangle with the given parameters is "+af.calcRectangleSquare(len,wid));
    }
    public void circleAreaHelper(Scanner input, AreaFinder af){
        System.out.println("Type the radius of circle; ");
        int radius = input.nextInt();
        System.out.println("The area of circle with a given radius is "+af.calcCircleArea(radius));
    }
    public void triangleSquareHelper(Scanner input, AreaFinder af){
        System.out.println("Type base length and hight : ");
        double baseLen = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("The area of circle with a given radius is "+af.calcTriangleArea(baseLen, height));
    }


    private static int getSelection(Scanner input) {
        System.out.println("Select the option: ");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println("5. Exit");
        int selection = input.nextInt();
        System.out.println("The selection is " + selection);
        return selection;
    }

    public int calcSquareArea (int length){
            int res = length*length;
            return res;
        }
        public int calcRectangleSquare (int l, int w){
        return l*w;
        }
        public double calcCircleArea (int rad){
        return rad*rad*3.14;
        }
        public double calcTriangleArea (double baseLen, double hig){
        return baseLen*hig/2;
        }

    }
