class InstanceVariable{
public String instance;
public InstanceVariable() //Declared Instance Variable
{ //default Constructor
 this.instance= "Instance variable";
}
//Main Method
public static void main(String[] args)
{
// Object Creation
InstanceVariable name= new InstanceVariable();
// Displaying O/P
System.out.println("Instance name is:"+name.instance);
}
}