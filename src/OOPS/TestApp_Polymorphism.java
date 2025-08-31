package OOPS;


import com.sun.security.jgss.GSSUtil;

class ICalculator {


    // 1st part
    public void add(int a, int b) {
        System.out.println("int-int argument");
    }

    public void add(float a, float b) {
        System.out.println("float-float argument");
    }

    public void add(double a, double b) {
        System.out.println("double-double arguments");
    }

    // 2nd part

    public void Iadd(int a) {
        System.out.println("int argument");
    }

    public void Iadd(float a) {
        System.out.println("float-argument");
    }

    public void Iadd(double a) {
        System.out.println("double argument");
    }

    // 3rd part
    public void iAdd(int a, float b) {
        System.out.println("int-float argument");
    }
    public void IAdd(float a, int b){
        System.out.println("float-int argument");
    }
}
public class TestApp_Polymorphism {
    public static void main(String[] args){
    ICalculator ic = new ICalculator();
    ic.add(10,20);
    ic.add(10.5f, 20.5f);
    ic.add(10.0, 20.0);


    // this is example of  the implicit type casting...
         // the compiler will bind the call
    ic.Iadd('a');  // char  => char, int   (implicit type casting)
    ic.Iadd(19L);  // long ---> long. float, double
    ic.Iadd(10.5); //  double ===>  double

        ic.IAdd(10,20);
    }
}


/*
Method overloading
  => function having same name but different argument type called as
    Method overloading

    it is the false polymorphism
    1  person  ====> multiple jobs

    compiler is binding so the polymorphism
    q. Early binding
    b. static binding
    c. Eager binding

    in case of the overloading. compiler will bind the call of the method to the
    body of the method.
    Jvm should just execute the method body, so we say MethodOverloading as false polymorphism

 */