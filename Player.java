/*	MenyBuganim 302490610  BaruchRothkoff 311603252	*/
package assig1_1;

public class Player implements Runnable {
	private String name;
	private String musTool;

	Player(String name, String musTool) {
		this.name = name;
		this.musTool = musTool;
	}

	public void play()throws InterruptedException {
		while (true) {
			System.out.println(name + " is playing " + musTool);
			Thread.sleep(50);
		}
	}

	public void run() {
		try {
			play()	;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
