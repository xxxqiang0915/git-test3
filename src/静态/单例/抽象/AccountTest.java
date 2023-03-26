package 静态.单例.抽象;
//static练习：银行账户信息
public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        Account acct2 = new Account("010915",8888.5);
        Account.setInterestRate(1.25);
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct1.getInterestRate());
        System.out.println(acct1.getMinMoney());
    }
}
class Account{
    private int id;
    private String pwd = "123456";
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1001;//用于自动生成id

    public Account() {
        id = init++;
    }

    public Account(String pwd, double balance) {
        this();
        this.pwd = pwd;
        this.balance = balance;
    }


    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}