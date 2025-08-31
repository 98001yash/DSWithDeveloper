package OOPS;

class Person {
    public String name;
    public String address;
    public int age;
}

class Student1 extends Person{

    Student1(String name, String address, int age, int marks,String grade){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }
    public int marks;
    public String grade;

    public void display(){
        System.out.println("Name is: "+name);
        System.out.println("Address is: "+address);
        System.out.println("Age is: "+age);
        System.out.println("Marks is: "+marks);
        System.out.println("Grade is: "+grade);
    }

}
public class TestApp_Inheritance {
    public static void main(String[] args){


        Student1 st = new Student1("Yash", "Bihar", 21, 100, "A");
        st.display();
    }

}
