package other_project.PracticeYouHiding;

public class Rectangle {

    private double length;
    private double width;




   public Rectangle()
   {
       length=10;
       width=15;
   }


    public void setLength(double l)
    {
        length=l;
    }
     public void modifyObject(Rectangle r) // taking object (r) from Rectangle class
     {
         r.length=67; //  make length of r  = 67
         r.width=98; // make width of r  = 98
     }


     public Rectangle(double l,double w)
     {
         length=l;
         width=w;
     }

    public void setWidth(double w)
    {
        width=w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea()
    {
        return length*width;
    }
}
