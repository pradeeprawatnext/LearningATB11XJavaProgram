package ex_04_Operators;

public class Lab_043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String FirstName="Pradeep";
        String LastName="Rawat";
        int a=10;
        int b=10;

        System.out.println(FirstName+LastName+a+b);//string without math operation
        System.out.println(a+b+FirstName+LastName);//mathematic operation with string
        System.out.println(FirstName+a+b+LastName);//string without math operation
        System.out.println(FirstName+(a+b)+LastName);//strig with math operation
        //BODMAS

    }
}
