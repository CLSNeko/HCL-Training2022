public class WashingMachine {
	
	boolean poweredOn;
	int numOfClothes;
	boolean hasDetergent;

	public WashingMachine(){
		poweredOn = false;
		numOfClothes = 0;
		hasDetergent = false;
	}
	public void switchOn(){
		poweredOn = true;
		System.out.println("Washing Machine is On!");
	}
	public void switchOff(){
		poweredOn = false;
		System.out.println("Washing Machine is Off!");
	}
	public void acceptDetergent(){
		if (hasDetergent){
			System.out.println("Washing Machine Already Has Detergent!");
		} else{
			hasDetergent = true;
			System.out.println("Detergent has been Accepted!");
		}
	}
	public int acceptClothes(int numOfClothes){
		this.numOfClothes += numOfClothes;
		System.out.println("Washing Machine has Accepted " + numOfClothes + " New Clothes!");
		return this.numOfClothes;
	}
	public static void main(String[] args){
		WashingMachine testMachine = new WashingMachine();
		System.out.println("Testing switching on...");
		System.out.println();
		testMachine.switchOn();
		System.out.println("Testing adding detergent...");
		System.out.println();
		testMachine.acceptDetergent();
		System.out.println("Testing adding more detergent...");
		System.out.println();
		testMachine.acceptDetergent();
		System.out.println("Testing Adding Clothes...");
		System.out.println();
		System.out.println("The Machine Now Has " + testMachine.acceptClothes(14) + " Total Clothes.");
		System.out.println("Testing switching off...");
		System.out.println();
		testMachine.switchOff();
	}
}
