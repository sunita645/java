
public class Class1{
String name;
String add;
int roll;

void disInfo(){
System.out.println("Name: "+this.name);
System.out.println("Address: "+this.add);
System.out.println("Roll: "+this.roll);
}

//constructor initialize
Class1 (String nam, String ad, int rol){
this.name=nam;
this.add=ad;
this.roll=rol;
System.out.println("Constructor is called");
}

public static void main (String[] args){
Class1 c1 = new Class1("Sunita", "Nepal", 123);
c1.disInfo();
}
}