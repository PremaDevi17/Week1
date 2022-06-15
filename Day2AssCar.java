package week1.day2;

public class Day2AssCar {
	
	public static void main(String[] args) {
		Day2AssCar obj = new Day2AssCar();
		obj.applyBreak();
		obj.applyGear();
		obj.switchOnAC();
		obj.applyAcclerate();
	}

	public void applyBreak() {
		System.out.println("Break applied");
	}
	
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	
	public void switchOnAC() {
		System.out.println("AC is ON");
	}
	
	public void applyAcclerate() {
		System.out.println("Apply Accelearte");
	}
}
