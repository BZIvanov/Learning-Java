package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<EStudent> students = new ArrayList<>();

        String line = sc.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            if (isStudentExisting(students, firstName, lastName)) {
                EStudent student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            } else {
                EStudent student = new EStudent(firstName, lastName, age, city);
                students.add(student);
            }

            line = sc.nextLine();
        }

        String filterCity = sc.nextLine();

        for (EStudent student : students) {
            if (student.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old\n",
                        student.getFirstName(), student.getLastName(), student.getAge(), student.getCity());
            }
        }
    }

    private static EStudent getStudent(List<EStudent> students, String firstName, String lastName) {
        EStudent existingStudent = null;

        for (EStudent student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }

        return  existingStudent;
    }

    private static boolean isStudentExisting(List<EStudent> students, String firstName, String lastName) {
        for (EStudent student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
