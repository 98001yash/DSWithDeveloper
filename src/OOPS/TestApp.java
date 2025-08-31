package OOPS;


class Account {

    // Data-security
    private double balance;

    // method: public
    public double getBalance(double balance){
        // withdrawing thr money
        return 0.0f;

    }
    // method:public
    public void setBalance(double balance){
        // preform authentication
      boolean result =   validate("sachin", "sachin123");

        // depositing the money
        if(result == true){
            // deposit the money
            this.balance = this.balance + balance;
            System.out.println("credited to the account..");
        }else {
            // throw a meaningful message to the yser
            System.out.println("Invalid userName or password.. Try Again..!!");
        }
    }

    private boolean validate(String userName, String password){
        // logic for the authentication
         return userName.equalsIgnoreCase("sachin")
                 && password.equals("sachin123");
    }
}
public class TestApp {
    public static void main(String[] args){

        Account acc = new Account();
       acc.setBalance(1000.0);
    }
}
