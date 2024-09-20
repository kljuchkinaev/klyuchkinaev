class DivisibleByTenRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);  // Пауза 1 секунда
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        DivisibleByTenRunnable runnable = new DivisibleByTenRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}