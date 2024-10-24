package Task3;

import java.util.ArrayList;

public class Teacher extends Person{

    ArrayList<String> currentCourses = new ArrayList<>();
    ArrayList<String> canTeach = new ArrayList<>();

    Teacher(String name, ArrayList<String> canTeach){
        super(name);
        this.canTeach = canTeach;
    }
    @Override
    public ArrayList<String> getCurrentCourses(){
        return this.currentCourses;
    }

    ArrayList<String> getCanTeach(){
        return this.canTeach;
    }
    @Override
    public boolean addCourse(String course){
        if (canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }
        else{
            return false;}
    }
}
