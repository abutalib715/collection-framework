package thread;

class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println("This is user defined thread");
    }
}

public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Program Started ...");

        int x = 47 + 55;
        System.out.println(x);
        Thread.currentThread().setName("Master");
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        // calling user defined thread
        UserThread ut = new UserThread();
        ut.start();

        System.out.println("Program Ended ...");
    }
}
