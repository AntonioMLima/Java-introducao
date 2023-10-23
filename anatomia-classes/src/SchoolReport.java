
public class SchoolReport {
    public static void main( String[] args){
        int avarageGrade = 7;

        if (avarageGrade < 6){
            System.out.println("The student failed.");
        }
        else if (avarageGrade == 6){
            System.out.println("Retake the exam.");
        }
        else {
            System.out.println("Student approved.");
        }
    }
}
