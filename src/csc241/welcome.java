        package csc241;

import javax.swing.*;
import java.util.Scanner;

public class welcome {

    public static void main (String[] args) {
        //establish scanner
        Scanner scanner = new Scanner(System.in);

        // Get input information
        String stringParameter = welcome("First and Last name");

        //Establish strings
System.out.println(welcome("welcome"));
System.out.println(wishes());


    }

    public static String wishes() {
        return "Have a great semester in CSC 241! ";
    }

    public static String welcome(String welcome ) {
        welcome = JOptionPane.showInputDialog( "Name?");
        return "Welcome to GitHub, " +welcome+ "!";
    }

}
