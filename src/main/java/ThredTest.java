public class ThredTest {

    public static void main(String[] args) {
        System.out.println("");

        Runnable task = () -> System.out.println("THIS IS FIRST THREAD- HELLO WORLD WAR 3");


        Thread me = new Thread( task);
        me.start();
        me.interrupt();

        Thread me2= new Thread( new NewTask());
        me2.start();
    }
}

class NewTask implements Runnable{


    @Override
    public void run() {
        System.out.println("Optimum way of making thread");
    }
}