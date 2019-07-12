
public class Consumer extends Thread{
	private int conscount;
	
	public synchronized void consumeItem(int conscount, boolean produced) {
		while(!produced)
		{
		try {
			Thread.sleep(10);
			System.out.println("Consumer is waiting!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}	
		this.conscount = conscount;
		System.out.println("consumed item:"+conscount);
	}
	
	public int getCurrentItem() {
		return conscount;
	}
	
	@Override
	public void run() {
		while(true) {
			consumeItem(0, true);
		}
	}
	
}

	
