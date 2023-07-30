import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
* Author: Tonmoy M
* URL: https://github.com/qinetique
* */
class Student implements Comparable<Student>{
    String name = new String();
    double cgpa;
    int id;
    public Student(String name, double cgpa, int id){
        this.name= name;
        this.cgpa = cgpa;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public double getCgpa(){
        return cgpa;
    }
    public int compareTo(Student student){
        if (cgpa == student.cgpa){
            if (name.compareTo(student.name) == 0){
                if(id == student.id){
                    return 0;
                }
                else if (id > student.id){
                    return 1;
                }
                else {
                    return -1;
                }
            }
            else {
                return name.compareTo(student.name);
            }
        }
        else if (cgpa > student.cgpa){
            return -1;
        }
        else {
            return 1;
        }
    }
}
class Priorities{
    public ArrayList<Student> getStudents(List<String> events){
        int n = events.size();
        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>();
        for (String i: events){
            String[] strings = new String[4];
            strings = i.split("\\s");
            if (strings.length > 1){
                priorityQueue.add(new Student(strings[1], Double.valueOf(strings[2]),Integer.valueOf(strings[3])));
            }
            else {
                priorityQueue.poll();
            }
        }
        while (priorityQueue.size() > 1){
            System.out.println(priorityQueue.poll().name);
        }
        return new ArrayList<Student>(priorityQueue);
    }
}
public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] argh){
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();
        while (totalEvents-- != 0){
            String event = scan.nextLine();
            events.add(event);
        }
        List<Student> students = priorities.getStudents(events);
        if(students.isEmpty()){
            System.out.println("EMPTY");
        }
        else {
            for (Student student: students){
                System.out.println(student.getName());
            }
        }
    }
}