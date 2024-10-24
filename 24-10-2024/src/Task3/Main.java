package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Students
        ArrayList<String> BobHasPassed = new ArrayList<>();
        BobHasPassed.add("Math");
        BobHasPassed.add("Java1.0");

        ArrayList<String> KevinHasPassed = new ArrayList<>();
        KevinHasPassed.add("Math");

        Student student1 = new Student("Bob", BobHasPassed);
        Student student2 = new Student("Kevin", KevinHasPassed);

        //Teachers
        ArrayList<String> teacher1Teaches = new ArrayList<>();
        teacher1Teaches.add("Java1.0");

        ArrayList<String> teacher2Teaches = new ArrayList<>();
        teacher2Teaches.add("Math");

        Teacher teacher1 = new Teacher("Smith", teacher1Teaches);
        Teacher teacher2 = new Teacher("Kenny", teacher2Teaches);

        ArrayList<Person> school = new ArrayList<>();
        school.add(student1);
        school.add(student2);
        school.add(teacher1);
        school.add(teacher2);

        for (Person p: school){
            if(!p.addCourse("Java1.0") && p instanceof Student){
                System.out.println(p.name + " has passed this course");
            } else if (!p.addCourse("Java1.0") && p instanceof Teacher) {
                System.out.println(p.name + " is not certified");
            }

        }
    }
}
