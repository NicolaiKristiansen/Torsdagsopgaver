//Teacher teacher1;
Student student1;
Student student2;

void setup(){
  //teacher1 = new Teacher("Kenny", 42, true);
  student1 = new Student("Nicolai", 21, false, 'b');
  student2 = new Student("Emil", 29, false, 'b');
  
  //println(teacher1.name);
  println(student1.name + ":" + student1.datamatikerTeam);
  println(student2.name + ":" + student2.datamatikerTeam);
  
  if(isClassmate(student1, student2) == true){
    println("They are in the same class");
  }
  else{
    println("They are not in the same class");
  }
}

boolean isClassmate(Student a, Student b){
  if(a.datamatikerTeam == b.datamatikerTeam){
    return true;
  }
  else{
    return false;
  }
}
