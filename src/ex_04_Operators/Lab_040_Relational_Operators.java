package ex_04_Operators;

import java.sql.SQLOutput;

public class Lab_040_Relational_Operators {
    public static void main(String[] args) {
        //< Less than
        //> Greater than
        //<= Less than equal to
        //>= greater than equal to
        //== equal to (but checking)
        // != not equal
        // All of them always rsult a boolean
        int a=10;
        int b=12;
        Boolean c= a>b;
        System.out.println(c);

        int age_student1=36;
        int age_student2=34;
        boolean result= age_student1>=age_student2;
        System.out.println(result);

    }
}
