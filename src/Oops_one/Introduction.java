package Oops_one;

public class Introduction {


    public static void main(String[] args) {
        Student1 it= new Student1();//
        Student1 st1=it;
        System.out.println(st1+" "+it);//Oops_one.Student1@6acbcfc0 ,Oops_one.Student1@6acbcfc0
        System.out.println(it.roll_no);//0
        System.out.println(it.marks);//0.0
        System.out.println(it.name);//null

    }
}
class Student1
{
    int roll_no;
    float marks;
    String name;

    Student1(Student1 other)
    {
        this.roll_no= other.roll_no;
        this.name= other.name;
        this.marks= other.marks;
    }
    Student1()
    {
     //calling another constructor from a constructor
        //internally it is like :new Student(13,"vinnie",12.34f)
        this(13,"vinnie",12.34f);
    }
    Student1(int roll_no,String name,float marks)
    {
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;
    }
}
