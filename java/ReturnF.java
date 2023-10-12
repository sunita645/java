class ReturnF{
double calculateArea(){
double l = 5.5;
double b = 6.5;
double area = l*b;
return area ;
		}

void printArea(){
double area = calculateArea();
System.out.println("The area of rectangle is: "+ area);
			}

void printVolume(){
double volum = calculateVolume(5.5);
System.out.println("The volume of rectangle is: "+volum);
			}

double calculateVolume(double vlm){
double area = calculateArea();
double volume = area*vlm;
return volume;
			}

public static void main(String[] args) {
ReturnF re = new ReturnF();
re.calculateArea();
re.printArea();
re.printVolume();
			}
}
