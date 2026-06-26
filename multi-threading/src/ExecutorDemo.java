import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoRunnable implements Runnable{
	private final long countUntil;

	public GoRunnable(long countUntil) {
		this.countUntil = countUntil;
	}

	public void run() {
		long sum=0;
		for(long i=1;i<countUntil;i++) {
			sum +=i;
		}
		System.out.println(sum);
	}
}

public class ExecutorDemo {
	private static final int NTHREDS=10;

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		//creating thread pool of 10 threads
		ExecutorService executor=Executors.newFixedThreadPool(NTHREDS);

		for(int i=0;i<500;i++) { //500 threads to be executed
			Runnable worker =new GoRunnable(100000000L+i);
			executor.execute(worker); //Assignment task to pooled thread
		}

		//This will make the executor accept no new threads
		//and finish all existing threads in a queue
		executor.shutdown();

		//wait until all threads are finished
		//executor.awaitTermination();

		while(!executor.isTerminated()) {

		}

		long end=System.currentTimeMillis();
		System.out.println("Finished all threads " + (end-start));
	}
}