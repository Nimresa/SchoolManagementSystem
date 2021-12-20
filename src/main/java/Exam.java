import  java.util.Random;

public class Exam {
    String nameOfCourse;

    public Exam(String courseTitle) {
        this.nameOfCourse = courseTitle;
    }



    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public void setGrade(Random grade) {
        this.grade = grade;
    }

    public Random getGrade() {
        return grade;
    }

    Random grade = new Random();
}
