/**
 * Class: CIST 2371 Java Programming I
 * Term: Fall 2021
 * Instructor: Chris Bishop
 * Description: Solution to Lab #13
 * Author: (Justin Morales)
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 */
import java.util.Scanner;
public class Triangle extends GeometricObject{
    @Override
    public double getArea() {
        return 0;
    }
    @Override
    public double getArea(double a,double b,double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public double getPerimeter() {
        return 0;
    }
    @Override
    public double getPerimeter(double s1,double s2, double s3) {
        return s1+s2+s3;
    }


    public static void main(String[]args){
//        double side1,side2,side3;
//        String color;
//        boolean filled;
//        Scanner input= new Scanner(System.in);
//        Triangle T1 = new Triangle();
//    System.out.println("Please enter 3 sides: ");
//    side1=input.nextDouble();
//    side2=input.nextDouble();
//    side3=input.nextDouble();
//    System.out.println("Please enter a color: ");
////    T1.setColor(input.nextLine());
//        color=input.next();
//        T1.setColor(color);
//    System.out.println("Is it filled,true or false?: ");
//    //T1.setFilled(input.nextBoolean());
//        filled=input.nextBoolean();
//        T1.setFilled(filled);
//        Output(side1,side2,side3, T1);
        try{
            method();
            System.out.println("After method");
        }
        catch (NumberFormatException ex){
            System.out.println("numerformat");
        }
        catch (RuntimeException ex){
            System.out.println("run");
        }

    }
     static void method(){
        String s = "5.6";
        Integer.parseInt(s);
        int i=0;
        int y= 2/i;
        System.out.println("welcome");
     }

//    public static void Output(double s1, double s2, double s3, Triangle t1){
//        System.out.println("The area is: "+t1.getArea(s1,s2,s3));
//        System.out.println("The  perimeter is: "+ new Triangle().getPerimeter(s1,s2,s3));
//        System.out.println("Side 1 is: "+ s1+" ,Side 2 is "+ s2+ " ,And side 3 is "+s3);
//        System.out.println("The Color is : "+ t1.getColor());
//        System.out.println("Is it filled: "+t1.isFilled());
//
//    }
}
