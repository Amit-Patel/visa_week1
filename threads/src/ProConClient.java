
public class ProConClient {

	public static void main(String[] args) {
		
		Producer pr = new Producer();
		Consumer co = new Consumer();
		
		pr.run();
		co.run();
		
		
	}

}
