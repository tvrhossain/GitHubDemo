public class ThredTest {

    public static void main(String[] args) {
        System.out.println("");

        Runnable task = () -> {
            System.out.println("THIS IS FIRST THREAD");
        };

        Thread me = new Thread( task);
        me.start();
        me.interrupt();
    }
}
