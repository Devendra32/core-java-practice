package collections;

public class Student  {

    private int rollNumber;
    private String studentName;
    private String studentBranch;
    public Student() {
    }

    public Student(int rollNumber, String studentName, String studentBranch) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.studentBranch = studentBranch;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", studentName='" + studentName + '\'' +
                ", studentBranch='" + studentBranch + '\'' +
                '}';
    }

}
