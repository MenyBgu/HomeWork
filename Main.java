/*	MenyBuganim 302490610  BaruchRothkoff 311603252	*/
package assig1_1;

public class Main {
	public static void main(String[] args) {
		Player a = new Player("Baruch", "Guitar");
		Player b = new Player("Barak", "DjBarak");
		Player c = new Player("Meny", "Drumes");
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
