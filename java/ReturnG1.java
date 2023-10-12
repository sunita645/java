import java.util.Scanner;
class ReturnG1{
int CompNum(){
Scanner sc = new Scanner (System.in);
System.out.println("Enter first number");
int x = sc.nextInt();
System.out.println("Enter second number");
int y = sc.nextInt();

if (x>y)
return x;
else 
return y;
}

public static void main(String args[]){
ReturnG1 myobj = new ReturnG1();
int result = myobj.CompNum();
System.out.println("The greatest number among X and Y is:" +result);
}
}