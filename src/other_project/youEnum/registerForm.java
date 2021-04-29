package other_project.youEnum;


enum Gender{male,female}

enum course{database,programming,math,ERP}

enum semester{summer,winter,fall,spring}

public class registerForm {


    String studentName;

    Gender stdGender;
    course crs;
    semester sem;


    public registerForm(){
        studentName="no name";
        stdGender=Gender.female;
        crs=course.programming;
        sem=semester.spring;
    }

}
