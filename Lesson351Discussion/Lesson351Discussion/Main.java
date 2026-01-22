class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();
    double sum = 0;
    int castroCount = 0;
    int courseCount = 0;
    for(int x=0; x < students.length; x++){
      Student student = students[x];
      sum += student.gpa;
      if(student.findTeacher("CASTRO R")){
        castroCount ++;
      }
      if(student.findTeacher("PORCHETTA") && student.findCourseStartingWith("MK")){
        System.out.println(student.id);
      }
      if(student.findCourse("SHF21U2C")){
        courseCount += 1;
      }
    }
    double avg = sum / students.length;
    print("Avg: " + avg);
    print("Castro has " + castroCount + " students.");
    print(courseCount + " students are taking that course.");
    
    
    
    
    
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}