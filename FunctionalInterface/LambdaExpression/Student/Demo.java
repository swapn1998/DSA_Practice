package FunctionalInterface.LambdaExpression.Student;

public class Demo {


    public static void main(String[] args) {

    functionalMethod f1 = (s)->{

        System.out.println("Marks: "+ s.getMarks());

        System.out.println("Name: "+ s.getRoll());

        System.out.println("rollNo: "+ s.getName());

    };

    f1.fetchStudentDetails(new Student(100,"swapnil",12));


    }


}
