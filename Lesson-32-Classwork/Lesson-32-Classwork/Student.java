class Student{

  
  String firstName;
  int gradeLevel;
  double gpa;
  double[] grades;
  String[] courses;

  
  Student(String firstName, int gradeLevel, double gpa, double[] grades, String[] courses){
    
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.gpa        = gpa;
    this.grades     = grades;
    this.courses    = courses;
  }


  // class functions

  double calculateAvg(){
    double sum=0;
    for(int x=0; x<=this.grades.length-1;x++){
      sum+=this.grades[x];
    }
    return sum/this.grades.length;
  }
  boolean checkCourse(String newCourse){
    int taken = 0;
    for(int x = 0; x < courses.length; x++){
      if(newCourse.equals(courses[x]))
        taken = 1;
    }
    if (taken == 1){
        return true;
    }else{
      return false;
    }
  }

  
}