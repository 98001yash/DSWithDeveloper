package OOPS;


class LoanApp {
    static float rateOfInterest = 0.5f;
}
public class TestApp_StaticVariable {
    public static void main(String[] args){
        System.out.println(LoanApp.rateOfInterest);

    }
}




/*
  => Static variables
    => Memory will be given inside the Method-Area
    => memory will given at the time of the loading .class
    -> Default value will be given if user wont specify any value
    memory will be taken out the time of the unloading of the .class file

    Static variable can be access in two ways
    a. using className
    b. using reference of the object
 */