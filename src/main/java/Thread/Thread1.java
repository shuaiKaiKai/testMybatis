package Thread;

public class Thread1 extends  Thread{

    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在执行！" + i);
        }
    }
}
