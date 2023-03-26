package Thread;
/**
* 使用 同步方法 解决实现 Runnable接口线程安全问题
*
* 1.同步方法仍然涉及到同步监视器，只是不需要我们显示声明。
* 2.非静态的同步方法，同步监视器是：this
*   静态的同步方法，同步监视器是:当前类本身
* */

public class TicketTest3 {
    public static void main(String[] args) {
        Ticket3 ticket = new Ticket3();

        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        Thread thread3 = new Thread(ticket);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class Ticket3 implements Runnable {
    private int tick = 100;
    private boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            show();

        }
    }

    public synchronized void show() {//同步show方法
        if (tick > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + "号窗口买票，票号为：" + tick--);
        } else {
            isFlag = false;
        }
    }
}
