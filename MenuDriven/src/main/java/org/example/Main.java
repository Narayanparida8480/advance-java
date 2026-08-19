package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while(true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch(ch) {

                case 1:

                    Student s = new Student();

                    System.out.print("Name: ");
                    sc.nextLine();
                    s.setName(sc.nextLine());

                    System.out.print("Age: ");
                    s.setAge(sc.nextInt());

                    System.out.print("Course: ");
                    sc.nextLine();
                    s.setCourse(sc.nextLine());

                    dao.insert(s);

                    break;

                case 2:

                    dao.display();

                    break;

                case 3:

                    Student u = new Student();

                    System.out.print("ID: ");
                    u.setId(sc.nextInt());

                    System.out.print("Name: ");
                    sc.nextLine();
                    u.setName(sc.nextLine());

                    System.out.print("Age: ");
                    u.setAge(sc.nextInt());

                    System.out.print("Course: ");
                    sc.nextLine();
                    u.setCourse(sc.nextLine());

                    dao.update(u);

                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    dao.delete(id);

                    break;

                case 5:

                    System.out.println("Thank You");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}