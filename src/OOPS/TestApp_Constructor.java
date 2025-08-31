package OOPS;


class Employee {

    // instance variable
    public String name;
    public int age;


    // zero argument constructor -> it is used to initialize the value
    Employee(){
        System.out.println("Employee constructor called.....");
    }

    // instance method
    public void display(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}


public class TestApp_Constructor {
    public static void main(String[] args){
        Employee emp  =new Employee();
        emp.display();

    }
}
