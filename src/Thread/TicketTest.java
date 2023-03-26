package Thread;
/** 实现 Runnable接口形式同步代码块
*
* 方式一：同步代码块
*   synchronized(同步监视器){
*       //需要被同步的代码
*   }
*
* 说明：1.操作共享数据的代码，即为需要被同步的代码
*      2.共享数据：多个线程共同操作的变量。比如：ticket就是共享数据。
*      3.同步监视器：锁。任何一个类的对象，都可以充当锁。
*             要求：多个线程必须要共用一把锁。
*
* 方式二：同步方法
*   如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明同步的。
*
* 好处：解决了线程安全的问题
* 局限性：操作同步代码时，只能有一个线程参与，其他线程等待。
*       相当于是一个单线程的过程。
* */

public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
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

//继承Runnable接口形式同步代码块

class Ticket implements Runnable {
    private int ticket = 100;

//    Object obj = new Object();
    //要求：多个线程必须要共用一把锁。

    @Override
    public void run() {
        while (true) {
            synchronized (this){  //方式二：(obj) {
                //此时的this：唯一的Ticket的对象
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName()
                            + "买票，票号：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
