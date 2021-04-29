package other_project.homeWorks;

public class car {

    String type, model, color;
    int seats;



    // constructor without parameters
    public car() {

        System.out.println("hello customer! ");
    }

    // constructor with parameters
    public car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        System.out.println("the type is " + type +
                " ,the model is " + model + " ,and the color is " + color);

    }

    // return method with parameters
    public static int nbreOfSesats(int num) {
        int seats = num;
        System.out.println("the number of seats is " + seats);
        return seats;
    }

    public  static void getPrice(double price) {
        double p= price;
        System.out.println("the price is " + p);
    }

    public static void main(String[] args) {
        car wel = new car();

        car ss = new car("toyota", "corrola", "black");

        car.nbreOfSesats(4);

        car.getPrice(5000);

    }
}