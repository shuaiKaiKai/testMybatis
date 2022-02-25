package Thread;

/**
 * 创建线程方法1：实现继承Thread重写run方法
 */
public class ThreadDemo1 {

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("子线程1");
        thread1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程！" + i);
        }
    }
}
