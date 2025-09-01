package OOPS;


class Student3{

    // instance variable
    String name;
    int age;


    // constructor
    Student3(String name, int age){
        this.name = name;
        this.age = age;
    }

    // instance method
    public void display(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}
public class TestApp_InstanceVariable {
    public static void main(String[] args){

        Student3 std1 = new Student3("sachin", 41);
        std1.display();
        Student3 std2 = new Student3("Yash", 21);
        std2.display();
    }
}


/*
 => instance variable
   => variable which are declared  inside the class but outside the method
   => memory in heap area
   => default value depending on data types
   => Memory initialized at thr time of object creation
   => memory will eb deactivated at the time of the control leaving thr method call

 */


/*
  Based on the type of value hold by the variable , we classify the variable into 2 types
  a. primitive variables:
  int a = 12
  b. Reference variable
  Student st = new Student(); // reference  variable
 */
