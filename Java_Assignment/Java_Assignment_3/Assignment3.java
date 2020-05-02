/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Assignment.Java_Assignment_3;
import java.util.Scanner;
/**
 *
 * @author jay.bict18
 */

class Course
{
    int courseCode;
    String courseName;
    double marks;
    
    Course(int courseCode,String courseName,double marks)
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.marks = marks;
    }
    public void Course_info()
    {
        System.out.println("");
        System.out.println("Course code : "+courseCode);
        System.out.println("       name : "+courseName);
        System.out.println("       mark : "+marks);
    }
}

class Student
{
    Scanner scan = new Scanner(System.in);
    static int [] max = new int[6];
    
    int roll_no;
    String s_name;
    Course course[] = new Course[3];
    double total_marks;
    
    Student(int roll_no,String s_name,double total_marks)
    {
        int c_code;
        String c_name;
        double c_mark;
        for(int i=1;i<=3;i++)
        {
            System.out.print("Enter Course code for course"+i+" : ");
            c_code = scan.nextInt();
            System.out.print("Enter Course Name for course"+i+" : ");
            c_name = scan.next();
            System.out.print("Enter Course Marks for course"+i+" : ");
            c_mark = scan.nextDouble();
            course[i-1] = new Course(c_code, c_name, c_mark);
        }

        this.roll_no = roll_no;
        this.s_name = s_name;
        this.total_marks = (course[0].marks + course[1].marks + course[2].marks);
    }
    void Student_info()
    {
        System.out.println("");
        System.out.println("Roll No.     : "+roll_no);
        System.out.println("Student Name : "+s_name);
        course[0].Course_info();
        course[1].Course_info();
        course[2].Course_info();
        System.out.println("Total Marks  : "+total_marks);
    }

    public static int[] Highest_marks(Student obj[],int i)
    {
        for(int j=0;j<i;j++)
        {
            max[0] = (int)obj[0].course[0].marks;
            if(obj[j].course[0].marks >= max[0])
            {
                max[0] = (int)obj[j].course[0].marks;
                max[3] = j;
            }
            max[1] = (int)obj[0].course[1].marks;
            if(obj[j].course[1].marks >= max[1])
            {
                max[1] = (int)obj[j].course[1].marks;
                max[4] = j;
            }
            max[2] = (int)obj[0].course[2].marks;
            if(obj[j].course[2].marks >= max[2])
            {
                max[2] = (int)obj[j].course[2].marks;
                max[5] = j;
            }
        }
        return max;
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student obj[] = new Student[20];
        int ch = 1,i=0,r_no;
        String s_name;
        while(ch == 1)
        {
            System.out.println("1 . New Student Entry\n2 . Student_Info\n3 . Highest Marks");
            System.out.print("Enter your choise : ");
            int cs = scan.nextInt();
            switch(cs)
            {
                case 1:
                    System.out.print("Enter Roll no. : ");
                    r_no = scan.nextInt();
                    System.out.print("Enter Student Name : ");
                    s_name = scan.next();
                    obj[i] = new Student(r_no,s_name,0);
                    i++;
                    if(i>20)
                        break;
                    break;
                case 2:
                    System.out.print("Enter your roll no :");
                    int num = scan.nextInt();
                    int j = 0;
                    for(j=0;j<i;j++)
                    {
                        if(obj[j].roll_no == num)
                            break;
                    }
                    obj[j].Student_info();
                    break;
                case 3:
                    int [] max = Student.Highest_marks(obj, i);
                    System.out.println("");
                    System.out.println("Student having Highest marks in Course 1 is : "+obj[max[3]].s_name+" with : "+max[0]+" marks.");
                    System.out.println("                                Course 2 is : "+obj[max[4]].s_name+" with : "+max[1]+" marks.");
                    System.out.println("                                Course 3 is : "+obj[max[5]].s_name+" with : "+max[2]+" marks.");
                    break;
                default:
                    System.out.println("Wrong choise..");
                    break;
            }
            System.out.println("");
            System.out.print("Do u want to continue [Y : 1 / N : 0] : ");
            ch = scan.nextInt();
        }
        scan.close();
    }
}