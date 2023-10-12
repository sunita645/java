//Write a program that takes length and bredth as input from user and return the area and volume after calculation.
import java.util.*;
public class ReturnExample2 {
double calcArea (double l, double b){
double area = l*b;
System.out.println("the area of rectangle is :"+area);
return area;
}

void calcVolume (double area, double height){
double volume = height * area;
System.out.println("the volume of rectangle is :"+volume);
//return volume;
}


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("please enter the length,breadth and height of rectangle");
double l = sc.nextDouble();
double b = sc.nextDouble();
double h = sc.nextDouble();
ReturnExample2 obj = new ReturnExample2();
obj.calcVolume(obj.calcArea(l,b),h);
		}
}