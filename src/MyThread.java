// CREATING THREAD USING RUNNABLE INTERFACE
public class MyThread implements Runnable{
    public void run(){
        // CODE TO BE RUN BY THREAD
        for (int i=0; i < 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();

        Thread th = new Thread(mt);
        th.start();
    }
}
