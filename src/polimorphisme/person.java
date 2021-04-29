package polimorphisme;

public class person {



    String name;
    double age;
    String address;
    String nationality;


//    public person(){
//
//    }

    public person (String nam,double ag,String add,String nat){
        name=nam;
        age=ag;
        address=add;
        nationality=nat;
    }

    public void setName(String nam) {
        name = nam;
    }

    public void setAge(double ag) {
        age = ag;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setNationality(String nat) {
        nationality = nat;
    }

    public String getName() {
        return name;

    }

    public double getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }
}
