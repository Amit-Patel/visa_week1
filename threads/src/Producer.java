
public class Producer extends Thread{

	private int prcount;
	
	public synchronized void produceItem(boolean consumed) {
		while(!consumed)
			{
			try {
				Thread.sleep(10);
				System.out.println("Producer waiting!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		prcount += 1;
		System.out.println("Produced item:"+prcount);
	}
	
	public int getCurrentItem() {
		return prcount;
	}
	
	@Override
	public void run() {
		while(true) {
			produceItem(true);
		}
	}
	
}

	
