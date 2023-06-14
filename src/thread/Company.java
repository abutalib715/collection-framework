package thread;

public class Company {
    int n;

    Boolean produceNow = true;

    synchronized public void produceItem(int n) {
        if(!produceNow){
            try { wait(); } catch (Exception ex){}
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        produceNow = false;
        notify();
    }

    synchronized public int consumeItem() {
        if(produceNow){
            try{ wait(); }catch(Exception e){}
        }
        System.out.println("Consumed: " + this.n);
        produceNow = true;
        notify();
        return n;
    }
}
