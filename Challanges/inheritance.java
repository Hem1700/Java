import java.lang.*;
import java.util.*;


class Account {

    public String accountNo;
    public double balance;
    public String name;
    public String address;
    public double phoneNo;
    public String dOB;
    public String email;

    public Account(String acc, String n, String add, String phon, String dob){
        accountNo = acc;
        name = n;
        address = add;
        phoneNo = phon;
        dOB = dob;
        balance = 0;

    }
    public String getAccNo(){
        return accountNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getphoneNo(){
        return phoneNo;
    }
    public String getDOB(){
        return dOB;
    }
    public double getbalance(){
        return balance;
    }
    public void setAddress(String add){
        address = add;
    }
    public void setPhone(String phon){
        this.phoneNo = phon
    }


    
}


class SavingAccount extends Account{

    public void deposit(double amt){
        balance += amt;
    }
    public void withdraw(double amt){
        balance-= amt;
    }
}

class LoanAccount extends Account{

    public void payEMI(double amt){
        balance -= amt;
    }

    public void repay (double amt){
        if(balance == amt){
            balance = 0;
        }
    }
}

public class inheritance{

    public static void main (String args []){
        System.out.print("Hello");
}
}