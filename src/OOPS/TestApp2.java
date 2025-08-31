package OOPS;


class Sample {
    public void methodOne(String s){
        System.out.println("String version.....");
    }
    public void methodOne(Object o){
        System.out.println("object version.....");
    }
    public void methodOne(StringBuffer s){
        System.out.println("object version....");
    }
}
public class TestApp2 {
    public static void main(String[] args){

        Sample s = new Sample();
        s.methodOne("Yash");  // string ===> string
        s.methodOne(new Object());  // object ===> object
      //  s.methodOne(null); // null ===> String(reference) , object(reference)

        s.methodOne(new String("sachin")); // string
        s.methodOne(new StringBuffer("sachin"));  //

    }
}
