import java.util.*;
/*
* Author: Tonmoy M
* URI: https://github.com/qinetique*/

class Student{
    private int id;
    private String firstName;
    private double cgpa;
    public Student(int id, String firstName, double cgpa){
        super();
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }
    public int getId(){
        return id;
    }
    public  String getFirstName(){
        return firstName;
    }
    public double getCgpa(){
        return cgpa;
    }
}
class MyComparator implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2){
        if (student1.getCgpa() > student2.getCgpa()){
            return -1;
        }
        if (student1.getCgpa()<student2.getCgpa()){
            return 1;
        }
        if (!Objects.equals(student1.getFirstName(),student2.getFirstName())){
            return student1.getFirstName().compareTo(student2.getFirstName());
        }
        return student1.getId() - student2.getId();
    }
}

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt(); //Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<Student>();

        while (cases > 0){
            int id = scanner.nextInt();
            String firstName = scanner.next();
            double cgpa = scanner.nextDouble();

            Student student = new Student(id, firstName, cgpa);
            studentList.add(student);
            cases --;
        }
        Collections.sort(studentList, new MyComparator());
        for (Student student: studentList){
            System.out.println(student.getFirstName());
        }
    }
}