package Day;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class SmallChangeSysOop {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key;
    String details = "-------零钱通明细------";
    double money = 0;
    double balance = 0;
    String note;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void cd() {
        do {
            System.out.println("========零钱通菜单=======");
            System.out.println("\t1 零钱通明细");
            System.out.println("\t2 收益入账");
            System.out.println("\t3 消费");
            System.out.println("\t4 退出");
            System.out.println("请选择(1-4):");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.mx();
                    break;
                case "2":
                    this.sy();
                    break;
                case "3":
                    this.xf();
                    break;
                case "4":
                    this.tc();
                    break;}
        }while (loop);

    }

    private void tc() {
        String choice;
        while (true) {
            System.out.println("你确定要退出码？y/n");
            choice = scanner.next();
            if (choice.equals("y") || choice.equals("n")) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }

    private void xf() {
        System.out.println(" 消费金额");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("请输入正确的消费金额");
            return;
        }
        System.out.println("请输入消费说明");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    private void sy() {
        System.out.println("2 收益入账金额:");
        money = scanner.nextDouble();
        //数据校验
        if (money <= 0) {
            System.out.println("收益入账金额需要大于 0");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    private void mx() {
        System.out.println(details);
    }
    }
