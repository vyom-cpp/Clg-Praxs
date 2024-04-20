class rectangle{
    double height;
    double width;
    double area, perimeter;
    rectangle(){
    width=height=1;
    }
    rectangle(double h,double w){
    height=h;
    width=w;
    }
    double getArea(){
    area= height*width;
    return area;
    }
    double getPerimeter(){
    perimeter= 2*(height+width);
    return perimeter;
    }}
    public class programTwo{
    public static void main(String[] args){
    rectangle ob1=new rectangle(40,4);
    rectangle ob2=new rectangle(35.9,3.5);
    System.out.println("The area of Rectangle 1: " + ob1.getArea() +" square unit");
    System.out.println("The Perimeter of Rectangle 1: " + ob1.getPerimeter() + " unit");
    System.out.println("The area of Rectangle 2: " + ob2.getArea() +" square unit");
    System.out.println("The Perimeter of Rectangle 2: " + ob2.getPerimeter() + " unit");
    }}