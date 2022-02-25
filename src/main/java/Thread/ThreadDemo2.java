package Thread;

/**
 * 创建线程2：采用匿名内部类实现Runnable接口重写run方法
 */
public class ThreadDemo2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i < 10; i++) {
                    System.out.println("子线程" + i);
                }
            }
        });

        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程" + i);
        }



    }

}
