package other_project.homeWorks;

public class camputer{

    String name;
    int RAM;
    // non return method without parameters
    public static void user() {

        System.out.println(" hi there !");

    }

    public static void type(String color){

        String color1=color;
        System.out.println( "the color is "+color1);

    }

    public camputer(String name,int RAM){
       this.name=name;
       this.RAM=RAM;
        System.out.println("the name is "+name+" the ram is "+RAM );
    }


    public static void main(String[] args) {

        camputer.user();

        camputer.type("white");

        camputer gg=new camputer("acer",4);

    }











}
