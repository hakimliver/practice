package other_project.youEnum;

public class main {
    public static void main(String[] args) {
        course c1=course.programming;
        System.out.println(c1.toString());// programming
        System.out.println(c1.ordinal());// 1

        course c2=course.programming;
        System.out.println(c1.compareTo(c2));// 0 because programming=programming

        course c3=course.database;
        System.out.println(c3.compareTo(c2));// -1 because c3<c2
        System.out.println(c2.compareTo(c3)); // 1 because c2 >c3

        System.out.println(c2.equals(c3));// false because programming is not equals to database

    }


}
