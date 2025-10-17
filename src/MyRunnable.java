public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(1000);
            } catch (final InterruptedException e) {
                System.out.println("Thead was inturupted");
            }
            if (i == 10) {
                System.out.println("\nTimes up");
                System.exit(0);
            }
        }

    }

}
