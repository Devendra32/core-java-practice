package java8practice;

public class Student {
    private Long stRollNo;
    private String stName;
    private String stClass;

    public Student() {
    }

    public Student(Long stRollNo, String stName, String stClass) {
        this.stRollNo = stRollNo;
        this.stName = stName;
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stRollNo=" + stRollNo +
                ", stName='" + stName + '\'' +
                ", stClass='" + stClass + '\'' +
                '}';
    }

    public Long getStRollNo() {
        return stRollNo;
    }

    public void setStRollNo(Long stRollNo) {
        this.stRollNo = stRollNo;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }
}
