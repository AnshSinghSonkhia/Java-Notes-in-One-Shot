//package com.apncollege;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Methods or Functions in JAVA
    //                Lets build our own method to print java.

    public static void printJava(){                // void because, the function is returning us NOTHING.      Otherwise, it could be int, long , etc.....
        System.out.println("Hello Java");
    }

    public static void printName(String NameA){
        System.out.println(NameA);
    }

    public static void printSum(int a, int b) {
        int Sum = a + b;
        System.out.println(Sum);
    }

    public static void main(String[] args) {          //input type in the main function is String of arguments.

        /**
        System.out.println("Hello world!");
        System.out.println("Myself ANSH SINGH SONKHIA");

        // Variables
        String name = "Ansh";
        int age = 30;
        String neighbour = "AKKU";

        System.out.println(age);
        String friend = neighbour;    // memory location of friend stores neighbour, so if you will print it, neighbour will print AKKU

         **/

        // Java Types (Data Types)
        /*
                                   Data Types are of 2 Types:
                                  1) Primitive: Stores Simple Values

                                  2) Non primitive / Reference: Stores Complex Values. No fix size, can store till your memory gets full.
         */

            /**


        // -----Primitive Types-----
        byte age2 = 30;
        int phone = 1234567890;          // int can't store more than 10 digits
        long phone2 = 12345678900L;      // long can store but, you need to write 'L' after it to tell java that it is a long.
        float pi = 3.14F;                // we have to write 'F' after it to tall Java that it's a float.
        char letter = '@';     // char can store any letter.
        boolean isAdult = true;  // you can put either true or false.
        boolean isRetired = false;

        // -----Non-Primitive Types-----
        String name2 = "Aansh";    // In Non-Primitive types, we can perform some more fuctions. For Example: could print its length
        System.out.println(name2.length());

             **/

        // STRINGS (in Detail)

            /**

        // -----Concatenate (Adding 2 Strings)-----
        String name1 = "Dharmendra";
        String name22 = "Ansh";
        String name3 = "Charu";
        String name4 = name1 + " And " + name22 + " And " + name3;
        System.out.println(name4);

             **/

        // -----charAt----- 24:20
        /*
              In Java Positions of characters starts from 0 and not 1.

              chatAt tells us which character of string is present at the asked position.
         */

            /**

        System.out.println(name1.charAt(0));      // this will print D
        System.out.println(name1.charAt(5));      // this will print e

             **/

        // Length Function

            /**

        System.out.println(name1.length());       // this will print 10

             **/

        // Replace Function

        /*
        with Replace function we can replace a character of any string with another character.
        ---- This function does not change the original string. It makes a new string out of the old one.----

        ------STRINGS IN JAVA ARE IMMUTABLE, WHICH MEANS YOU CAN'T CHANGE A STRING ONCE CREATED.-----
         */

            /**
        String name6 = "Amaan";
        String name7 = name6.replace('a', 'b');
        System.out.println(name7);
             **/

        // Substring

            /**
        String name8 = "Aman Ansh Akku";
        System.out.println(name8.substring(0, 4));   // indexing in java starts from 0. Here, 4 means 4-1=3, because it does not take till the last position. So, will print Aman
        System.out.println(name8.substring(3, 12));   // this will print from 0th Position to 11th Position.
             **/

        /*
             Strings in java are immutable, so by using substring function, we are not changing the original string.
         */

        // ARRAYS ------ 29:30     Non-Primitive Type
        /*
             In Java, Arrays are like a list of elements of the same type.
             FOR EXAMPLE: A list of integers for storing marks of diffrent subjects of a student.
             FOR EXAMPLE2: A list of booleans, etc....
         */

        // Arrays Type 1:

            /**
        int[] marks = new int[3];      // first write the data type then, [] Square brackets means arrays.
        // Now, this means we need 3 positions in the array.
        marks[0] = 100;
        marks[1] = 98;  // If we comment out this line, it will print 0 due to initialisation.
        marks[2] = 99;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
             **/

        /*
        INITIALISATION = In Java, if you create a variable and don't give it a value, it puts null value automatically, Or if it's a boolean, it will give false. Unlike other languages like C++
         */

            /**

        System.out.println(marks.length);    // In Arrays, while using length function, we don't put ().
             **/

        // Sort Function

            /**
        System.out.println(marks[0]);
        Arrays.sort(marks);  // We imported Arrays package above to use sort function.
        System.out.println(marks[0]);  // this indicates that the array is sorted.
             **/

        //Arrays Type 2:

        /*
        2D ARRAYS ----- For Example: To Store Marks of 2 Students without confusion.
         */

            /**
        int[] marks2 = {100, 98, 99};
        int[][] finalMarks = {{100, 98, 99}, {92, 99, 91}};
        System.out.println(finalMarks[0][0]);    // To Print Marks of 1st student in 1st subject
        System.out.println(finalMarks[1][2]);    // To Print Marks of 2nd student in 3rd subject
             **/


        // CASTING in Java ------ To  convert from one type to another type.
        /*
                 Casting is of 2 types:
                 1) Implicit Casting
                 2) Explicit Casting
         */

        // IMPLICIT CASTING
        // use of double data type to store price.

            /**
        double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);
             **/

        // EXPLICIT CASTING

            /**
        int p = 100;
        int fP = p + (int) 18.18;
        System.out.println(fP);
            **/

        /*  In Explicit casting, the new data type will not be able to hold the value if the previous data type is bigger. So, it will Overflow and some values will be missed.
            In Java, This happens automatically, but the reverse will be allowed, i.e., smaller to bigger.
            If you won't use (int) while explicit casting, it will show error.
        */


        // CONSTANTS in Java  --- To Ensure that nobody could ever change a constant value in the code later.

        /**
        final float PI = 3.14F;     //---- Java CODERS Write Constant Values in CAPITAL LETTERS.
         **/

        //PI = 11.1F;    // Due to the use of -final- , value of PI Can not be changed and will show an error.

        // OPERATORS
        /*
                       There are 4 types of operators:
                       1) Arithmetic (+ , - , *, divide , modulo %)
                       2) Assignment ,i.e., to assign values (Example, =)
                       3) Logical
                       4) Comparison  ( == , )
         */
        // Arithmetic Operators

            /**
        int a = 1;
        int b = 2;
        int diff = a - b;
        System.out.println(diff);

        int aa = 1;
        int bb = 2;
        int div = a / b;
        System.out.println(div);    // this gives answer as 0. because int does not support decimals

        double aaa = 1;
        double bbb = 2;
        double div2 = aaa / bbb;
        System.out.println(div2);   // this will correctly print 0.5

        // modulo % gives the remainder
        int a4 = 111;
        int b4 = 27;
        int modu1 = a4 % b4;
        System.out.println(modu1);

        // Unary Operators in Java (++ , -- [Decrement Operator] , + [Unary Plus Operator - Indicates Positive Value] , - [Unary Minus Operator - negates an expression] ,
        // ++ (Increment Operator) Increments value by 1
        int nukbe = 1;
        nukbe++;
        System.out.println("Nukbe is ?");
        System.out.println(nukbe);

        int nukka = 1;
        System.out.println("Nukka is ?");
        System.out.println(nukka++); // By using ++ here AFTER variable, it first prints the original value and then afterwards increase it by 1.
        System.out.println(nukka);

        int nukkabe = 1;
        System.out.println("Nukkabe is ?");
        System.out.println(++nukkabe); // By using ++ here BEFORE variable, it first increase it by 1 and then print it.
        System.out.println(nukkabe);

        System.out.println("Nukkabe is minus?");
        System.out.println(nukkabe--);  // Similarly
        System.out.println(nukkabe);


        // Math Class in JAVA
        System.out.println("Using .max and .min functions of Math Class");

        System.out.println(Math.max(5, 8));    // it only takes 2 values to sort from
        System.out.println(Math.min(5, 8));

        // .random() function of Math Class returns us any random value from between 0.0 to 1.0

        System.out.println(Math.random());   // by default, this prints in the form of long data type
        System.out.println((int) Math.random());   // this will always give 0 value, because always values are smaller than 1
        System.out.println((int) (Math.random() * 100));

            **/


        // HOW TO TAKE INPUT FROM THE USER?
        // Input in JAVA     ------ for this we use scanner class

            /**
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age:");
        int age22 = sc.nextInt();     // .nextInt is a function of scanner class, which helps us to take an integer input from the user.
        System.out.println("I Know Your Age, you are ");
        System.out.println(age22);

             **/

        // Similarly we have
        /*
                 .nextFloat to take float value
                 .nextByte
                 .nextLong
                 , etc.....
         */

            /**

        System.out.println("Input your Name : ");
        String nameis22 = sc.next();     // This .next function only takes 1 token, which means 1 word only. so, If you input a line, it will take only its 1st word.
        System.out.println(nameis22);

        System.out.println("Input your 1 best line : ");
        String lineis22 = sc.nextLine();     // .nextLine function helps us to input a whole line.
        System.out.println(lineis22);

             **/


        // Comparison Operators in JAVA   ----- these will return true or false
        //a == b
        //a != b
        //a < b
        //a > b
        //a <= b
        //a >= b

        // Conditional Statements in JAVA ----------- ( If-Else Statements)

            /**

        boolean isSunUp = true;

        if (isSunUp == true)
            System.out.println("day");
        else
            System.out.println("night");


        int ageforvote = 3;
        if (ageforvote > 18)
            System.out.println("you can vote");
        else
            System.out.println("HAHAHA, you can't vote.");

             **/

        // 1:08:45

        //System.out.println("Logical Operators");
        // Logical Operators
        // &&    ----- Both Conditions have to be true, else it will say false.
        // Logical OR (||)    -------- Atleast one of them must be true to get true.

            /**
        int aba = 60;
        int baa = 40;
        if (aba < 50 && baa < 50)
            System.out.println("both less than 50");

        // Logical OR
        if (aba < 50 || baa < 50)
            System.out.println("Atleast one less than 50");


        //    (  ! MEANS Negative   )
        boolean isbhajji = false;
        if (isbhajji)
            System.out.println("is Bhajji");
        else
            System.out.println("Not Bhajji");

        if (!isbhajji)    // This will take it as negative of what it is.
            System.out.println("is Bhajji");
        else
            System.out.println("Not Bhajji");

            // 1:14:32
            //pen = 10 ; notebook = 40

        Scanner scc = new Scanner(System.in);
        System.out.println("How much cash do you have?");
        int cash = scc.nextInt();
        if (cash < 10){
            System.out.println("cannot buy anything");
            System.out.println("get more cash, Please");
        }

        else if (cash > 10 && cash < 50){
            System.out.println("can get 1 thing");
        }


        else{
            System.out.println("can get both");

        }
             **/

        // SWITCH STATEMENTS in Java  -------- 1:17:50

            /**

        int day = 1;      // where 1 = monday , 2 = tuesday, 3 = wed, ...... so on.

        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;                              // use of break statement to get out of the loop
            case 2 :
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("wed - sun");
        }
            **/


        // Loops in JAVA            ------  For example, to print numbers from 1 to 100, to print a name 1000 times, etc...

        /*
                            There are 3 types of loops in JAVA:
                            1) for loops
                            2) do-while loops
                            3) while loops
         */

        // FOR LOOP      ---- for(initialisation statement ; condition ; update statement)

            /**
        // To Print from 1 to 100
        for(int i = 1; i <= 100; i = i+1) {       // Variables declared inside for loop are only for this loop, it won't work outside this loop. Hence, i = 1 is only for this for loop.
            System.out.println(i);
        }

        // To Print from 100 to 1
        for(int i2 = 100; i2 >= 1; i2 = i2 -1) {
            System.out.println(i2);
        }
             **/

        // 1:26:00
        // While Loops in JAVA

            /**
        int i = 100;
        while(i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
             **/

        // Do While Loops in JAVA

            /**
        int i = 100;
        do {
            System.out.println(i);
            i = i - 1;
        } while(i >= 1);
             **/

        // DO While Loop --- Mini Project
        /*
                User will input some positive numbers, and if he gives negative number, the loop will stop there itself.
         */

            /**
        Scanner scc = new Scanner(System.in);
        int number = 0;        // just for INITIALISING number variable, because while in do while loop needs the variable number outside the loop.
        do {
            System.out.println("Input a Number");
            number = scc.nextInt();
            System.out.print("here is your number: ");
            System.out.println(number);
        } while(number >= 0);

        System.out.println("                    THE END"                        );

             **/

        // BREAK & CONTINUE         --- Keywords in JAVA

            /**
        System.out.println("Testing BREAK Keyword");
        int alpha = 0;
        while(true) {                   // to run any while loop infinite times, we have to use TRUE inside it's Brackets.
            System.out.println(alpha);
            alpha = alpha + 1;
            if(alpha > 5) {
                break;                   // use of break, to break the loop and exit from it.
            }
        }

        System.out.println("Testing CONTINUE Keyword");
        // Now we want to not print 3 in between it.

        int beta = 0;
        while(true) {

            if(beta == 3){
                beta = beta + 1;
                continue;
            }

            System.out.println(beta);
            beta = beta + 1;

            if(beta>5){
                break;
            }
        }
             **/

        // Exception Handling in JAVA       ----- Exceptions are the mistakes in the code by us or by mistake. The java compiler throws exceptions in the code.
                                                 // Exceptions are like errors but NOT exactly ERRORS.
                                                 // Exceptions could be caught, they do not stop the program, but could be resolved after caught.
        // 1:41:18
                    /**
        // TRY & CATCH in Exception Handling
        int[] marks1 = {97, 98, 95};
        System.out.println(marks1[5]);             // This will give ArrayIndexOutOfBoundsException, because the capacity of it's index was 3, and you are asking 5th index
        System.out.println("The name is ANsh");          // this won't get print, because of the exception.
                    **/
        // Now, how to Handle the Exception?
        // By Using a try block      ----- it asks java to just try the code in this block, if it is working, it will run, else not.
        // Then we will use catch block     ---- which will hold the exception with the help of exception class.
                    /**
        int[] marks2 = {97, 98, 95};
        try {
            System.out.println(marks2[5]);
        } catch(Exception exception) {
            // write here the comments to do something after catching
        }
        System.out.println("The Nmae is ANsh");          // this will be printed. Means Exception is handled.
                    **/

        // Calling our own Function
                        /**
        printJava();
        printJava();
        printJava();

        printName("AAAAAnshs");
        printName("Alpha bEta GammA");

        printSum(45, 77);
                         **/

        // Let's Build A MINI PROJECT in Java

        // This is how, we can use multiple classes in intelliJ

        GuessTheRandomNumber guessObject = new GuessTheRandomNumber();
        guessObject.MiniProject();


    }

}