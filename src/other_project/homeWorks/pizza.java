package other_project.homeWorks;

public class pizza {
    String name;
    String address;

    //return method without parameters
    public static String  topping(){
        String topp="CHEESE";
        System.out.println(topp);
        return topp;
    }

    // return method with parameters
public static String topping1(String topp1,String topp2){

       String top1=topp1;
    String top2=topp2;
    System.out.println(top1+top2);
    return top1+top2;
}
// parameter constructor
public pizza(String name,String address){
  this.name= name;
  this.address=address;
    System.out.println("my name is  "+name+" my address is :"+address );

}
// non parameter constructor
public pizza(double price){

        double p=price;
    System.out.println("the price is "+ p + "$");


}






    public static void main(String[] args) {
        pizza.topping();

        pizza.topping1("peperoni "," broccoli");

        pizza prc=new pizza(20);

        pizza ss=new pizza("hakim","philadelphia,PA");
    }
}
