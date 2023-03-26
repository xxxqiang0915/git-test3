package newtext;

//对象数组练习
public class text12 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane", "simth");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户" + bank.getCustomer(0).getFirstName() + "的余额为" + balance);
        System.out.println("*******************************8");
        System.out.println("银行客户个数为：" + bank.getNumOfCustomers());
    }
}
class Account{
    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }
    public double getBalance(){
        return balance;
    }
    //存钱
    public void deposit(double amt){
        if(amt >0){
            balance += amt;
            System.out.println("存钱成功!");
        }
    }
    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
            System.out.println("存钱成功！");
        }else{
            System.out.println("余额不足!");
        }
    }
}
class Customer{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account account){
        this.account = account;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return getLastName();
    }
}
class Bank{
    private Customer[] customers ;//存放多个客户；
    private int numberOfCustomers;

    public Bank(){
        customers = new Customer[10];
    }
    //添加客户
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f, l);
        customers[numberOfCustomers++] = cust;
    }
    //获取客户个数
    public int getNumOfCustomers(){
        return numberOfCustomers;
    }
    //获取指定位置上的客户
    public Customer getCustomer(int index){
        if(index >= 0 && index < numberOfCustomers){
            return  customers[index];
        }
        return null;
    }
}
