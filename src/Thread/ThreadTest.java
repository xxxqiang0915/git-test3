package Thread;
/**
* 多线程的创建  方式一：继承于Thread类
*
* 1.创建一个继承于Thread类的子类
* 2.重写Thread类的run()方法 --> 将此线程执行的操作声明在run()中
* 3.创建Thread类的子类的对象
* 4.通过此对象调用 start():1.启动当前线程 2.调用当前线程的run()
*
* 例子：遍历100以内的所有的偶数
*
* 注意事项：
*   1.我们启动一个线程，必须调用start()，不能调用run()的方式启动线程。
*     如果再启动一个线程，必须重新创建一个Thread子类的对象，调用此对象的start().（注意后面的点）
*   2.如果自己手动调用run()方法，那么就只是普通方法，没有启动多线程模式
*   3.想要启动多线程，必须调用 start方法。
*   4.一个线程对象只能调用一次 start()方法启动，如果重复调用了，
*     则将抛出异常“illegalThreadStateException”.
*
* */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "**main()**");
            }
        }

        //创建Thread类的匿名子类方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }.start();
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


