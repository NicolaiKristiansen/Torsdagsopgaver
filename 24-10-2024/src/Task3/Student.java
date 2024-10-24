package Task3;

import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> currentCourses = new ArrayList<>();
    ArrayList<String> passedCourses = new ArrayList<>();

    Student(String name, ArrayList<String> passedCourses){
        super(name);
        this.passedCourses = passedCourses;
    }
    @Override
    public ArrayList<String> getCurrentCourses(){
        return this.currentCourses;
    }

    ArrayList<String> getPassedCourses(){
        return this.passedCourses;
    }

    @Override
    public boolean addCourse(String course){
        if (passedCourses.contains(course)) {
            return false;
        }
        else{
            currentCourses.add(course);
            return true;
        }
    }

}


