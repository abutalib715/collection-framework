package thread;

public class Consumer extends Thread {
    Company company;

    Consumer(Company com) {
        this.company = com;
    }

    @Override
    public void run() {
        while (true) {
            this.company.consumeItem();
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}
