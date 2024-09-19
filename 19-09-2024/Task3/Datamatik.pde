Teacher teacher1;
Student student1;
Student student2;

void setup(){
  teacher1 = new Teacher("Kenny", 42, true);
  student1 = new Student("Nicolai", 21, false, 'b');
  student2 = new Student("Emil", 29, false, 'b');
  
  println(teacher1.name);
  println(student1.name + ":" + student1.datamatikerTeam);
  println(student2.name + ":" + student2.datamatikerTeam);
}
