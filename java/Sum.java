import java.util.Scanner;
public class Sum{

void calculate(){
int x,y,sum;
Scanner sc= new Scanner(System.in);
System.out.println("enter first number");
x=sc.nextInt();
System.out.println("enter second number");
y=sc.nextInt();
sum=x+y;
System.out.println("the sum of two number x and y is:" +sum);
}
public static void main (String args[]) {
Sum calc = new Sum();
calc.calculate();

}
}
