package polimorphisme;

public class student extends person
{

    int StudyLevel;
    String Specialization;


//
//    public student(){
//
//    }

    public student(String nam,double ag,String add,String nat,int lvl,String spec){
        // we will call the constructor of the based class
        super(nam,ag,add,nat);

        StudyLevel=lvl;
        Specialization=spec;



    }
// we will
    public void setStudyLevel(int studyLevel) {
        StudyLevel = studyLevel;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }



    public int getStudyLevel() {
        return StudyLevel;
    }

    public String getSpecialization() {
        return Specialization;
    }


}
