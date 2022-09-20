package chapter11.exception.studentNotFound;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        try{
            student.find("12356");
        } catch (StudentNotFoundException e) {
            System.err.print(e);
        }
    }

}