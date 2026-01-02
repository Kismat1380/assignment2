import person.Employee;
import person.Person;
import person.Student;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File fileOfEmployee = new File("/Users/mikvi/IdeaProjects/assignment2/src/employee");
        File fileOfStudent = new File("/Users/mikvi/IdeaProjects/assignment2/src/students");
        Scanner scEmployee = new Scanner(fileOfEmployee);
        Scanner scStudent = new Scanner(fileOfStudent);
        ArrayList<Person> people = new ArrayList<>();
        boolean isStudent = true;
        add(scEmployee, people, !isStudent);
        add(scStudent, people, isStudent);
        printData(people);

        Collections.sort(people);
        System.out.println("Sorted");
        printData(people);
    }
    public static void printData(Iterable<Person> people){
        for(Person person : people){
            System.out.println(person);
        }
    }
    public static void add(Scanner sc, List<Person> p, boolean isStudent){
        while(sc.hasNext()) {
            if(isStudent){ p.add(new Student(sc.next(), sc.next(), sc.nextDouble())); }
            else { p.add(new Employee(sc.next(), sc.next(), sc.next(), sc.nextDouble())); }
        }
    }
}