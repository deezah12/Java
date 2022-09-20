package chapter7;

public class GradeBook {
    String Subject;
    int[][] grades;

    public GradeBook(String subject, int[][] grades) {
        Subject = subject;
        this.grades = grades;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public int getMaximum(){
        int highestGrade = grades[0][0];
        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
               if (grade < highestGrade){
                 highestGrade = grade;
               }
            }
        }
        return  highestGrade;
    }

    public  int getMinimum(){
        int lowestGrade = grades[0][0];
        for (int[] studentGrades : grades){ 
            for (int grade : studentGrades){
                if (grade < lowestGrade){
                    lowestGrade = grade;
                }
            }
        }
        return lowestGrade;
    }

    public  double getAverage(int[] setOfGrades){
      int total = 0;

      for (int grades : setOfGrades){
          total += grades;
      }
      return (double) total/ setOfGrades.length;

    }

    public  void outputBarChart(){
        System.out.println(" overall distribution");

        int[] frequency = new int [11];
        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                ++frequency[grade / 10];
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 0){
                System.out.println("%5d: " + 100 );
            }
           // else
               // System.out.println("%02d: " + );
        }
    }
}
