class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudents

    Course(String courseName){ // constructor
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity; // why did we not use this.maxCapacity??
    }

    void enrollStudents(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudents(String studentName){
        System.out.println("Student is removed!!");
        enrollments--;
    }
}
