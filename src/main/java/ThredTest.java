public class ThredTest {

    public static void main(String[] args) {
        System.out.println("");

        Runnable task = () -> {
            System.out.println("THIS IS FIRST THREAD- HELLO WORLD WAR 3");
        };


        Thread me = new Thread( task);
        me.start();
        me.interrupt();
    }
}

class NewTask implements Runnable{


    @Override
    public void run() {

    }
}