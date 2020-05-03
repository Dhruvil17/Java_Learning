import java.io.*;

class Student implements Serializable
{
    private static final long serialVersionUID = 1L;
    int roll_no;
    String name;
    double percentage;
    Student(int roll_no,String name,double percentage)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.percentage = percentage;
    }

    public String toString()
    {
        return "Student :: Roll No.: "+this.roll_no+" Name : "+this.name+" Percentage : "+this.percentage+"\n";
    }
}


public class Program5 {
    static Student std1 = new Student(1, "Jay", 85.6);
    static Student std2 = new Student(2, "Krinal", 81.2);

    static Student stdR[] = new Student[2];

    public static void WriteData()
    {
        try {
            FileOutputStream fout = new FileOutputStream("Test2.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);

            oout.writeObject(std1.toString());
            oout.writeObject(std2.toString());

            fout.close();
            oout.close();

            System.out.println("Done writing..");
        } catch (IOException e) {
            System.out.println("Error while writing data to file..");
        }
    }

    public static void ReadData()
    {
        try {
            FileInputStream fin = new FileInputStream("Test2.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);

            for(int i=0;i<2;i++)
                stdR[i] = (Student) oin.readObject();

            fin.close();
            oin.close();

            System.out.println("----- Output Data -----");
            System.out.println("Student 1 Data : Roll no.: "+stdR[0].roll_no+" Name : "+stdR[0].name+" Percentage : "+stdR[0].percentage);
            System.out.println("Student 2 Data : Roll no.: "+stdR[1].roll_no+" Name : "+stdR[1].name+" Percentage : "+stdR[1].percentage);

        } catch (IOException e) {
            System.out.println("Error while Reading data from file..");
        }
        catch(ClassNotFoundException ec)
        {
            System.out.println("Class not found..");
        }
    }

    public static void main(String[] args) {
        WriteData();
        ReadData();        
    }
}