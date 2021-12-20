import javax.swing.*;
import java.util.ArrayList;

import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<String> teachers = new ArrayList<>();
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<Exam> grades = new ArrayList<>();
        try {
            courses.add("English");
            courses.add("Math");
            courses.add("Biology");

            teachers.add("Inta Bērziņa");
            teachers.add("Matīss Bergs");
            teachers.add("Samanta Leo");

            students.add("Irina Saulīte");
            students.add("Imants Sproģe");
            students.add("Reinis Bergmanis");

        } catch (Exception e) {
            System.out.println(e);
        }

        int firstChoice=firstOption();
        if(firstChoice==1){
            int interaction = interaction();
                if(interaction==1){
                    printArray(courses);
                    int answer = addOrRemoveOption(courses);
                    if(answer==1){addCourse(courses);}
                }
                if(interaction==2){
                    printArray(teachers);
                    int answer = addOrRemoveOption(teachers);
                    if(answer==1){addTeacher(teachers);}
                }
                if(interaction==3){
                    printArray(students);
                    int answer = addOrRemoveOption(students);
                    if(answer==1){addStudent(students);}
                }
        }
        if(firstChoice == 2){

        }

        if(firstChoice == 3){

        }

        addStudent(students);

        addTeacher(teachers);

        addCourse(courses);

    }

    static int firstOption(){
        String[] responses = {"School management","Teacher","Student"};
        int answer = JOptionPane.showOptionDialog(null,
                "Are you School Management, Teacher or Student?", "interaction",
                YES_NO_CANCEL_OPTION, YES_NO_CANCEL_OPTION,
                null, responses, 0);
        return answer;
    }

    static int interaction(){
        String[] responses = {"Courses","Teachers","Students"};
        int answer = JOptionPane.showOptionDialog(null,
                "Interact with: ", "interaction",
                YES_NO_CANCEL_OPTION, YES_NO_CANCEL_OPTION,
                null, responses, 0);
        return answer;
    }

    static public int addOrRemoveOption(ArrayList arr){
        String[] responses = {"Add","Remove"};
        int answer = JOptionPane.showOptionDialog(null,
                "Choose an option", "options",
                YES_NO_CANCEL_OPTION, YES_NO_CANCEL_OPTION,
                null, responses, 0);
        return answer;
    }

    static public String addStudent(ArrayList arr){
        String studentName = JOptionPane.showInputDialog ("Enter student`s name");
        Student student = new Student();
        arr.add(studentName);
        System.out.println(studentName);
        return "Student added successfully";
    }
    static public String addTeacher(ArrayList arr){
        String teacherName = JOptionPane.showInputDialog ("Enter teacher`s name");
        Teacher teacher = new Teacher(teacherName);
        arr.add(teacherName);
        System.out.println(teacherName);
        return "Teacher added successfully";
    }

    static public String addCourse(ArrayList arr){
        String courseTitle = JOptionPane.showInputDialog ("Enter title of the course");
        Courses courses = new Courses();
        arr.add(courseTitle);
        System.out.println(courseTitle);
        return "Course added successfully";
    }

    static public void printArray(ArrayList arr){
        for(int i=0; i<=arr.size(); i++){
            System.out.println(arr.get(i) + ", ");
        }
    }
}
