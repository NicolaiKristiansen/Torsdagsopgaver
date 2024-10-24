package Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public  class Person {
    ArrayList<String> something = new ArrayList<>();
    String name;

 Person(String name){
     this.name = name;
 }

 public String getName(){
     return this.name;
 }

 public void setName(String name){
     this.name = name;
 }

    public boolean addCourse(String course){
     return true; //for now
 }

    public boolean isTeacher(){
     return true;
    }

    public boolean isStudent(){
        return true;
    }

    public ArrayList<String> getCurrentCourses(){
     return something;
    }
    public ArrayList<String> getPassedCourses;
    public ArrayList<String> getCanTeach;
}
