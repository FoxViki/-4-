

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(studentController.addUser("qwe", "asd", "zxc"));
        studentsList.add(studentController.addUser("zxc", "asd", "qwe"));

        StudentView printStudents = new StudentView();
        printStudents.sendOnConsole(studentsList);
        System.out.println();

        TeacherController teacherController = new TeacherController();
        teacherController.addUser("Иванов", "Иван", "Иванович");
        teacherController.addUser("Петров", "Петр", "Петрович");

        TeacherView printTeachers = new TeacherView();
        printTeachers.sendOnConsole(teacherController.getTeachersList());
        System.out.println();

        teacherController.searchTeacherById(2, "Петров", "Петр", "Петрович");
        printTeachers.sendOnConsole(teacherController.getTeachersList());
    }
}