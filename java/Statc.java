class statc {
static int a=10; 		//static variable or class variable
int c=30; 			//instance variable
public static void main (String[]args){
int b=20; 			//local variable
statc obj = new statc();
System.out.println(a);
System.out.println(obj.c);
System.out.println(b);
obj.sum();
obj.sum();
}
void sum(){
int d=8;
System.out.println (d+"  "+a);
++d; ++a;
System.out.println (d+"  "+a);

}
}