package Thread;
/**
* 继承 Thread类形式 同步代码块
* */

public class TicketTest2 {
    public static void main(String[] args) {
        Ticket2 ticket1 = new Ticket2();
        Ticket2 ticket2 = new Ticket2();
        Ticket2 ticket3 = new Ticket2();

        ticket1.setName("窗口1");
        ticket2.setName("窗口2");
        ticket3.setName("窗口3");

        ticket1.start();
        ticket2.start();
        ticket3.start();
    }
}

class Ticket2 extends Thread {
    private static int tick = 100;
    private static Object obj = new Object();

    public Ticket2() {
    }

    @Override
    public void run() {

        while (true) {
            synchronized (obj) {
                //synchronized (Ticket2.class) {//通过反射调用当前类
                //synchronized (this) { //错误方式，代表了3个对象
                if (tick > 0) {
                    System.out.println(Thread.currentThread().getName()
                            + "号窗口买票，票号为" + tick);
                    tick--;
                } else {
                    break;
                }
            }

        }
    }
}
