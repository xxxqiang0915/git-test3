package Thread;
/**
* 使用 同步方法 解决继承 Thread类线程安全问题
* */

public class TicketTest4 {
    public static void main(String[] args) {
        Ticket4 ticket1 = new Ticket4();
        Ticket4 ticket2 = new Ticket4();
        Ticket4 ticket3 = new Ticket4();

        ticket1.setName("窗口1");
        ticket2.setName("窗口2");
        ticket3.setName("窗口3");

        ticket1.start();
        ticket2.start();
        ticket3.start();
    }
}

class Ticket4 extends Thread {
    private static int tick = 100;
    private static boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag) {
            show();
        }
    }

    private static synchronized void show() {
        //给方法加static关键字，确保不会创建多个对象
        if (tick > 0) {
            System.out.println(Thread.currentThread().getName()
                    + "号窗口买票，票号为" + tick);
            tick--;
        } else {
            isFlag = false;
        }
    }
}