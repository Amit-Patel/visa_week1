
public class ThreadExample {

	public static void main(String[] args) {
		Numbers t1 = new Numbers(1,400);
		Numbers t2 = new Numbers(900,1200);
//		t2.setDaemon(true);
		
		Chars ch = new Chars();
		
//		ch.run();   // normal method call, executes sequentially and then pops out of main() stack
//		Thread t3 = new Thread();		// target is null, it terminates directly
		Thread t3 = new Thread(ch);
		t3.start();
		t1.start();
		t2.start();
		doTask();
	}

	private static void doTask() {
		Thread t= Thread.currentThread();
		System.out.println("Name:"+t.getName());
		System.out.println("Priority:"+t.getPriority());
		System.out.println("Group:"+t.getThreadGroup().getName());
		/*
		 * JRE waits for the status of the last NonDaemon thread
		 * before it terminates
		 */
		System.out.println("Daemon:"+t.isDaemon());
	}

}
