import java.util.concurrent.locks.ReentrantLock;

class DiningPhilosophers {

    // 5 locks representing the 5 forks
    private final ReentrantLock[] forks = new ReentrantLock[5];
    // A global lock to prevent circular wait deadlock when acquiring forks
    private final ReentrantLock tableLock = new ReentrantLock();

    public DiningPhilosophers() {
        for (int i = 0; i < 5; i++) {
            forks[i] = new ReentrantLock();
        }
    }

    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {

        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % 5;

        // Synchronize fork selection to prevent deadlock
        tableLock.lock();
        try {
            forks[leftFork].lock();
            forks[rightFork].lock();
        } finally {
            tableLock.unlock();
        }

        // Pick up left fork and right fork
        pickLeftFork.run();
        pickRightFork.run();

        // Eat
        eat.run();

        // Put down forks
        putLeftFork.run();
        putRightFork.run();

        // Release the locks
        forks[leftFork].unlock();
        forks[rightFork].unlock();
    }
}
