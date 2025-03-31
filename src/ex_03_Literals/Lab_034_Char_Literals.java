package ex_03_Literals;

import java.sql.SQLOutput;

public class Lab_034_Char_Literals {
    public static void main(String[] args) {
        char c1='a';/// A to Z; a to z; specialcharacters !@#$%^&*()_+
        char c2='B';
        char c3='@';
        char c4='_';
        char c5='9';
        char c6='(';
        char c7=' '; // blank space is also a character
        //Escape Char
        char    new_line= '\n';
        char    tab_line= '\t';
        char    back_space= '\b';
        char    carriage_return= '\r';
        System.out.println("PradeepRawat");
        System.out.println("Pradeep"+new_line+"Rawat");
        System.out.println("Pradeep"+tab_line+"Rawat");
        System.out.println("Pradeep"+back_space+"Rawat");
        System.out.println("Pradeep"+carriage_return+"Rawat");
        System.out.println("thisisline1\n thisisnlin2 \n thisisline3");
        char c10= 'A';
        char rupee='₹';//now can store UNICODE char into char as well
        System.out.println(rupee);
        char smiley='\u1f60';
        System.out.println(smiley);
    }
}
