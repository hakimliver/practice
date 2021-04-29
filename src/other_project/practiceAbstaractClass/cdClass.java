package other_project.practiceAbstaractClass;

public class cdClass implements RetailItem,displayable{



    double price;
    String title;
    String artist;

    public cdClass(double price,String title,String artist) {
        this.price = price;
        this.title=title;
        this.artist=artist;
    }

    public cdClass() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("title"+title);
    }

    @Override  // we are implementing the method that is in the interface  (using it)
    public double GetItemPrice() {
        return price;




    }
}
