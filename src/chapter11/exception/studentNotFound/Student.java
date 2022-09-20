package chapter11.exception.studentNotFound;

public class Student{

    public  Student find(String studentId) throws StudentNotFoundException{
        if (studentId.equals("123456")){
            return new Student();
        }
        else {
            throw  new StudentNotFoundException("Could not find student with ID " + studentId);

        }
    }
}
