package com.javalearners.libraryapp.loginUtils;

import java.util.Scanner;

public class loginControll {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        homeScreen();
        menu();

    }

    //menu with options to choose from
    //first you choose witch menu do you want to turn on
    //then it asks your username and password
    //after that, you will be loged in
    public static void menu(){
        String input = sc.nextLine();
        switch (input){
            case "1":
                if (loginScrnViewLibrarian()){
                    librarianMenu();
                }
                break;
            case "2":
                if (loginScrnViewCustomer()){
                    customerMenu();
                }
                break;
            case "3":
                //didn't add any functionality. Will need to discuss what it should have.
                administratorMenu();
                break;
            case "4":
                helpInformation();
                break;
            case "5":
                exitLib();
                break;
        }

    }

    public static void homeScreen(){
        System.out.println("-----------------------------------------");
        System.out.println("|\t\t\tWelcome to Library\t\t\t|");
        System.out.println("-----------------------------------------");
        System.out.println("|**********Choose your options**********|");
        System.out.println("-----------------------------------------");
        System.out.println("| \tLibrarian menu - press 1.\t\t\t|");
        System.out.println("| \tCustomer menu - press 2.\t\t\t|");
        System.out.println("| \tAdministrator menu - press 3.\t\t|");
        System.out.println("| \tAdditional information - press 4.\t|");
        System.out.println("| \tExit from the Library - press 5.\t|" +
                "\n-----------------------------------------");
    }

    public static void librarianMenu(){

        System.out.println("\t\t\t Welcome, Librarian!\n\t\t\tChoose your options:\n-------------------------------------------------\n" +
                "|\tBook management menu - press 1.\t\t\t\t|\n" +
                "|\tLibrary user's list - press 2.\t\t\t\t|\n" +
                "|\tExit to login - press 3.\t\t\t\t\t|\n-------------------------------------------------");
        String input = sc.nextLine();
        if (input.equals("3")){
            exitToLogin();
        }


    }
    public static void customerMenu(){

        System.out.println("\t\t\t Welcome, Customer!\n\t\t\tChoose your options:\n-------------------------------------------------\n" +
                "|\tSearch for the books - press 1.\t\t\t\t|\n" +
                "|\tCheck your personal account info - press 2.\t|\n" +
                "|\tCheck your book repository info - press 3.\t|\n" +
                "|\tExit to login - press 4.\t\t\t\t\t|\n-------------------------------------------------");

    }
    public static void administratorMenu()
    {
        System.out.println("Welcome, Administrator!");
    }
    public static void helpInformation(){

        System.out.println("Help and additional information.");
    }
    public static void exitLib() {

        System.out.println("Do you really want to exit from the Library?");
        String input = sc.nextLine();
        if (input.equals("n")) {
            System.out.println("Welcome Back!");
            homeScreen();
            menu();

        }
        if (input.equalsIgnoreCase("y")) {
            System.out.println("Exiting program...");
            System.exit(0);
        }
    }
    public static void exitToLogin(){
        homeScreen();
        menu();
    }

    //these passwords and usernames are just for demo. We will use actual credentials when we will have
    //file i/o or db to base on
    private static boolean loginScrnViewCustomer() {
        while (true) {
            System.out.println("You have to enter correct credentials in order to continue. ");
            System.out.println("Enter username");
            String username = sc.nextLine();
            System.out.println("Enter password");
            String password = sc.nextLine();


            if (!username.equals("custom") && password.equals("customer@gmail.com")) {
                System.out.println("Incorrect name. Try again.");


            } else if (username.equals("custom") && !password.equals("customer@gmail.com")) {
                System.out.println("Incorrect password. Try again");


            } else if (!username.equals("custom") && !password.equals("customer@gmail.com")) {
                System.out.println("Incorrect name and password. Try again.");


            } else if (username.equals("custom") && password.equals("customer@gmail.com")) {
                break;

            }

        }
        return true;
    }


    private static boolean loginScrnViewLibrarian(){
        while (true) {
            System.out.println("You have to enter correct credentials in order to continue. ");
            System.out.println("Enter username");
            String username = sc.nextLine();
            System.out.println("Enter password");
            String password = sc.nextLine();

            if (!username.equals("name") && password.equals("pswd")) {
                System.out.println("Incorrect name. Try again.");


            } else if (username.equals("name") && !password.equals("pswd")) {
                System.out.println("Incorrect password. Try again");


            } else if (!username.equals("name") && !password.equals("pswd")) {
                System.out.println("Incorrect name and password. Try again.");



            } else if (username.equals("name") && password.equals("pswd")) {
                break;

            }

        }
        return true;

    }
}
