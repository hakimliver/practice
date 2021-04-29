package other_project.homeWorks;

public class mobile {

    String type,color;
    int numberOfUsers;


   public  mobile(){
       System.out.println(" welcome to our store !, ");

   }

   public  mobile(String type,String color){
       this.type=type;
       this.color=color;
       System.out.println("the type is "+ type+" ,the color is "+color);

    }

    public static void getThePrice(double price){
       double p=price;
        System.out.println("the price is "+ p);
    }

    public static int users(int num1 ){
      int  numberOfUsers=num1;
        System.out.println("it's been used from "+num1+ " users");
       return num1;
    }


    public static void main(String[] args) {

       mobile mbl =new mobile();

       mobile prc =new mobile("samsung","black");

       mobile.getThePrice(500);

       mobile.users(3);


    }










}
