package thread;

// CREATING THREAD USING EXTEND THREAD CLASS
public class MySecondThread extends Thread{

    public void run() {
        for (int i = 10; i > 0; i--){
            System.out.println("Second thread value = " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e){

            }
        }
    }
}
