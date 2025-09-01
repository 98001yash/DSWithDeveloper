package OOPS;




class Parent {
    public void property(){
        System.out.println("Land+case_gold");
    }
    public void marry(){
        System.out.println("Relative girl");
    }
}

class Child extends Parent {
    public void marry(){
        // re - implementation
        System.out.println("Some other girl...");
    }
}
public class TestApp_MethodOverriding {

    public static void main(String[] args) {

        // Parent object
        Parent p1 = new Parent();
        p1.property();
        p1.marry();

        System.out.println();

        //child object
        Child c1 = new Child();
        c1.property();
        c1.marry();

        System.out.println();
        Parent p2 = new Child();
        p2.property();
        p2.marry();
    }
}


/*
  During  the inheritance , the parent class method implementation would not match the need of the child class so
  child class take the method name but it will change the implementation as oer the need of the
  child class.. this mechanism is called as "method Overriding"
 */