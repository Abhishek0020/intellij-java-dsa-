public class account {
    int acc_no;
    String name;
    float amount;
    //Method to initialize object
    void insert(int a,String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    //deposit method
    void deposit(float amt){
        amount=amount-amt;
        System.out.println(amt+" deposited");
    }
    //withdraw method
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient Balance");
        }
        else
        {
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }
    }
    //method to check the balance of the account
    void checkBalance(){System.out.println("Balance is: "+amount);}
    //method to display the values of an object
    void display(){System.out.println(acc_no+" "+name+" "+amount);}
}
//Creating a test class to deposit and withdraw amount
class TestAccount{
    public static void main(String[] args){
        account a1=new account();
        a1.insert(832345,"Ankit",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
        account a2=new account();
        a2.insert(23333,"abhi",1000);
        a2.display();
        a2.checkBalance();
        a2.deposit(45000);
        a2.checkBalance();
        a2.withdraw(15000);
        a2.checkBalance();
    }
}

