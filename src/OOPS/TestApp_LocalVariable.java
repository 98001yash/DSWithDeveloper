package OOPS;

class Calculator{

    public void add(int a, int b){
        int result = a+b;
        System.out.println("The sum is: "+result);
    }
}
public class TestApp_LocalVariable{
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.add(10, 20);

    }
}

/*
=> Local variable
   => Variable which are declared inside the method
   => memory will be given inside the stack area
   => Once the control enters . inside the method, memory will be given
   => Once the control leaves the method, memory will eb taken out
   => No default values will be given to the local variable
 */