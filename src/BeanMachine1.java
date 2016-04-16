
		// TODO Auto-generated method stub
		/**
		 * @author Ruchina
		 *
		 */
		//Aditi import Scanner
		import java.util.Scanner;
		public class BeanMachine1 {
		//Aditi declare variables
			public static int binCount;
			public static int ballCount;
			
			//Ruchina create custom method
			public static void topRun() {
				System.out.println("Hello Gamers!");
				 
				 		
				//Sweksha created array for bins
				int[] binArray = new int[binCount];
				
				binArray = FillBinArray(binCount,ballCount,binArray);
				//for loops
				for (int i = 0; i < binCount; i++){
					System.out.println(" Number of balls in the bin " + (i+1) + "is " + binArray[i] + "." );
				}
			}
			public static int[] FillBinArray (int binCount, int ballCount, int []binArray){
				
				for (int ballNumber = 1 ; ballNumber <= ballCount; ballNumber = ballNumber + 1){
					
					int left = 0;
					int binofInterest = 0;
					
					for (int layerCount = 1 ; layerCount <= ballCount; layerCount = layerCount + 1){
						
							double randomNumber = Math.random();
							if (randomNumber < 0.5){
								left = left + 1;
							}
					}
					binofInterest = binCount - left - 1;
					
					binArray[binofInterest] = binArray[binofInterest] + 1;
							}
				return binArray;
				
					
				}
			// Ruchina write code for test method
			public static void Testinput(){
				System.out.println(" This method will test the user input.");
				System.out.println(" The user selected to have : " + binCount + "bins and " + ballCount + "balls:");
			}
			public static void main(String[] args) {
				//Aditi create scanner for user input
				 		Scanner input = new Scanner(System.in);
							//Aditi greet user
						System.out.println(" Welcome to the game people");
						System.out.println(" You can pick number of bins you have in mind");
						System.out.println(" Then you can drop all the balls and see in which bin it gets to.\n");
						System.out.println(" Thus, enter the number of bins right here(more than 1):");
					     binCount = input.nextInt();
					     
					     System.out.println(" Enter the number of balls");
					     binCount = input.nextInt();
					     
					     //Ruchina call and run the test method
					     //call the test method:
					     Testinput();
					     
					   //call the run method:
					     topRun();
					     
					     System.out.println("Game ended, thank you for playing");
					     
					      	}
				 	}

	


