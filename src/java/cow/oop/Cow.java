package cow.oop;
/**
 * 牛
 * @author 10598
 *
 */

public class Cow {

	public Cow(int age) {
		this.age = age;
	}
	
	//生小牛
	public Cow produceCow() {
		if(this.age < 5 || !this.isalive() ) {
			return null;
		}
		return new Cow(0);
	}
	
	public void addAge() {
		this.age += 1;
		if(this.age>15) {
			this.alive = false;
		}
	}
	
	
	public boolean isalive() {
		return alive;
	}
	
	private boolean alive = true;
	
	private int age;
	
}
