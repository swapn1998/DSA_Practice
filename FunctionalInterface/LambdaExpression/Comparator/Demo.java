package FunctionalInterface.LambdaExpression.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {


        List<Student> std = new ArrayList<>();

        std.add(new Student(1,"Swapnil",100));

        std.add(new Student(2,"Pawan",150));

        std.add(new Student(173,"Raj",200));

        std.add(new Student(69,"Kunal",300));

        Collections.sort(std,(s1,s2)->s1.getRoll()>s2.getRoll()? 1 : -1);

        System.out.println(std);

    }


}
