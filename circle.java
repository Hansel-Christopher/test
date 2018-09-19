import java.util.Scanner;

public class circle{
    double area, r, d, circum;
    static final double pi = 3.1456;
    public circle(double radius){
        r = radius; 
    }

public void getArea(){
    area=pi*r*r;
    System.out.println("The Area is: "+ area);

}

public void getDiameter(){
    d = 2*r;
    System.out.println("The diameter is: "+ d);
}

public void getCircumference(){
    circum = 2 * pi	 * r;
    System.out.println("The Circumference is: "+ circum);

    }

}