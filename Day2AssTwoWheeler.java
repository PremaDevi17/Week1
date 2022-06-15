package week1.day2;

public class Day2AssTwoWheeler {
        int noOfWheels = 2;
        short noOfMirrors = 1;
        long chassisNumber = 345434565757L;
        boolean isPunctured = false;
        String bikeName = "Activa";
        double runningKM = 2345.978675675;
	
        
        public static void main(String[] args) {
			Day2AssTwoWheeler obj = new Day2AssTwoWheeler();
			int noOfWheels2 = obj.noOfWheels;
			System.out.println("No of Wheel : " + noOfWheels2);
			short noOfMirrors2 = obj.noOfMirrors;			
			System.out.println("No of Mirrors : " + noOfMirrors2);
			long chassisNumber2 = obj.chassisNumber;
			System.out.println("ChassisNumber : "+ chassisNumber2);
			boolean isPunctured2 = obj.isPunctured;
			System.out.println("Bike is Punctured : "+ isPunctured2);
			String bikeName2 = obj.bikeName;
			System.out.println("Bike Name is : "+ bikeName2);
			double runningKM2 = obj.runningKM;
			System.out.println("Number of KMs : "+ runningKM2);
		}
}
