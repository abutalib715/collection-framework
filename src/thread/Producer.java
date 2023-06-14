package thread;

public class Producer extends Thread {

    Company company;

    Producer(Company com) {
        this.company = com;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            this.company.produceItem(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            i++;
        }
    }
}
