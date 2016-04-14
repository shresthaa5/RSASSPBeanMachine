/**
 * 
 */

/**
 * @author ruchina
 *
 */
// import a scanner
// Aditi
import java.util.Scanner;
public class BeanMachineGame {
	public static void main(String[] args) {
		System.out.println("Hello User!");
		// call the run method
			//Ruchina

				// call the test method
				// Sweksha


				System.out.println("That's all folks!");

		//Create a scanner
		Scanner input = new Scanner(System.in);

		int slot_Number;
		//Call the method

		int ball = Ball_Number();

		//Call the method
		int slot = Slot_Number();
		int [] slots = new int[slot];

		for(int i = 0;i < ball;i++){
			slot_Number = direction(slot);

			for(int n = 0;n < slots.length;n++){
				if(slot_Number == n) {
					slots[n]++;
				} 
			}
		}
		
		displayBalls(ball,slots);
	}

	public static int Ball_Number () {
		//Create a scanner
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter in the amount of ball they want.
		System.out.print("How balls are in the bean machine");

		int balls = input.nextInt();

		//Return the value back to the main method
		return balls;
	}

	public static int Slot_Number () {
		//Create a scanner
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter in the amount of slots that they want.
		System.out.print("How slots are in the bean machine");

		int slots = input.nextInt();

		//Return the value back to the main method.
		return slots;
	}

	public static int direction(int slots){
		int direction;
		int right = 0;

		for(int i = 1; i <= slots; i++) {
			direction = (int)(Math.random() * 2);

			if(direction==0){
				System.out.print("L}
			else{
				System.out.print("Rright++;
			}
		}
		System.out.println();

		return right;
	}

	public static void displayBalls(int balls,int[] right){
		for(int n = 1; n <= balls; n++) { 
			for(int i = 0;i < right.length;i++){
				int check;

				for(check = 0; check < right[i]; check++){
					for(int z = 0; z < right[i];z++) {
						System.out.print("_					}
					System.out.print("0			}
				System.out.println();
			}
		}
	}
}