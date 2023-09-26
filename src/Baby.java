import java.util.Random;

public class Baby implements Runnable{
    int time;
    String name;

    public Baby(String name) {
        this.name = name;
        Random r = new Random();
        time = r.nextInt(5000);
    }

    @Override
    public void run() {

        try {
            System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");
            Thread.sleep(time);
            System.out.println("My name is " + name + " I am awake, feed me!!!");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
