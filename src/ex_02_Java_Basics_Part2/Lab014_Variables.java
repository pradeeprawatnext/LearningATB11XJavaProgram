package ex_02_Java_Basics_Part2;

public class Lab014_Variables {
    public static void main(String[] args) {
        // data_type variable_name = variable_calue
        byte b  =  10;
        b   =   20;
        b   =   40;
        // byte--- data type which can store only integer value
        //   min max range : -128 to 127
        // b -- variale name -- identifier
        //= : assignment -- assign the value to b
        // 10 --literal -- integer value
        // execution in JVM
        // when the statment byte b = 10 is executed in java
        // the JVM creates a variable name b of the type byte and assign it the value 10
        // the value 10 is represented in binary format as 00001010
        // JVM allocates a specific memory location for the variable b.

        System.out.println(b);
    }
}
