package study.java.abstractClass;

public class TestEdible {

	
}


abstract class Animal{
	private double weight;
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public abstract String sound();
	
}

class Tiger extends Animal{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "tiger: ARRRORORORORO";
	}
	
}

abstract class Fruit implements Edible{
	
}

class Apple extends Fruit{

	public String howToEat() {
		// TODO Auto-generated method stub
		return "Apple: Make apple cider";
	}
	
}

class Orange extends Fruit{

	public String howToEat() {
		// TODO Auto-generated method stub
		return "Orange: Make orange juice";
	}
	
}

class Chicken extends Animal implements Edible{
	
	

	public String howToEat() {
		// TODO Auto-generated method stub
		return "Chicken: Fry it";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Chicken: cock-a-doodle-doo";
	}
	
}