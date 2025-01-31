class methid{
void area(int a){
System.out.println("area of square:"+(a*a));
}
void volume(double l, double h){
System.out.println("area of volume :" +(l*h));
}
}
public class methodoverloading{
public static void main(String args[]){
methid mo=new methid();
mo.area(5);
mo.volume(15,5)