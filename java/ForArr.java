import java.util.*;
class ForArr{
public static void main(String[]args){
String [] arr1 = new String[10];
arr1[0]="s";
arr1[1]="u";
arr1[2]="n";
arr1[3]="i";
arr1[4]="t";
arr1[5]="a";
Scanner sc = new Scanner(System.in);
System.out.println("Enter any character");
String a = sc.nextLine();
for(int i=0; i<7; i++){

if(arr1[i] == a) {
System.out.println("Sunday");
			}

else {
System.out.println("Saturday");
break;
	}
    }
  }
}