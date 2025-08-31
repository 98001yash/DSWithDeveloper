package OOPS;


class Student{
    private int rollNo;
    private String name;
    private String address;

    // setter method
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // getter methods
    public int getRollNo(){
       return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}
public class StudentApp {

    public static void main(String[] args){


        // calling the setter methods
        Student st = new Student();
        st.setRollNo(10);
        st.setName("Yash");
        st.setAddress("Bihar");

        // calling the getter methods
        System.out.println("RollNo is: "+st.getRollNo());
        System.out.println("Name is: "+st.getName());
        System.out.println("Address  is: "+st.getAddress());

    }
}
