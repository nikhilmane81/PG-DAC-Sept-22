/*
Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write suitable
constructors to initialize them. Add functions like “getVolume” and “getArea” that will return volume and surface
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area. 
*/
class box
{
	double height;
    double width;
    double breadth;
    box(){};
    box(double height, double width, double breadth)
    {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    double getArea()
    {
        double area = 2*((this.breadth*this.width)+(this.breadth*this.height)+(this.width*this.height));
        return area;
       // System.out.println("Area of Box is "+ area);
    }
    double getVolume()
    {
        double volume = (this.height*this.width*this.breadth);
        return volume;
        //System.out.println("Volume of Box is "+volume);
    }
}
public class Demo
{
       public static void main(String[] args)
        {
            box b1 = new box(34, 56, 67);
            System.out.println("Area is "+ b1.getArea());
            System.out.println("Volume is "+ b1.getVolume());
            box b2 = new box(56.4545, 45.3423, 45.345);
            System.out.println("Area is "+ b2.getArea());
            System.out.println("Volume is "+ b2.getVolume());
        }
       
}