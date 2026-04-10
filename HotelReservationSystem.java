package ffuuuuu;
import java.util.Scanner;
public class HotelReservationSystem {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   int[][]hotel = new int [7][5];
	   
	   int choice;
	   
	   do {
		   System.out.println("\n=== HOTEL RESERVATION SYSTEM ===");
		   System.out.println("1. View Rooms");
		   System.out.println("2. Check In"); 
		   System.out.println("3. Check Out");
		   System.out.println("4. Exit");
		   System.out.print("Enter choice: ");
		   choice = sc.nextInt();
		   
		   switch (choice) {
		   
		   case 1: 
			   System.out.println("\nRoom Status:");
			   for (int i = 6; i>= 0; i--) {
				   System.out.print("Floor " + (i + 1) + ": ");
				   for (int k = 0; k < 5; k++) {
					   System.out.print("[" + hotel[i][k] + "]");
					   
				   }
				   System.out.println();
			   }
			   break;
		   case 2: 
			   System.out.print("Enter floor (1-7): ");
			   int ifloor = sc.nextInt();
			   
			   System.out.print("Enter room (1-5):");
			   int iroom = sc.nextInt();
			   ifloor--;
			   iroom--;
			   
			   if (hotel[ifloor][iroom] == 0) {
                   hotel[ifloor][iroom] = 1;
                   System.out.println("Check-in successful!");
               } else {
                   System.out.println("Room already occupied!");
               }
               break;
		   case 3: 
			   System.out.print("Enter floor (1-7):");
			   int ofloor = sc.nextInt();
			   
			   System.out.print("Enter room (1-5):");
			   int oroom = sc.nextInt();
			   ofloor--;
			   oroom--;
                
			   if (hotel[ofloor][oroom] == 1) {
                   hotel[ofloor][oroom] = 0;
                   System.out.println("Check-in successful!");
               } else {
                   System.out.println("Room already empty!");
               }
               break;
		   case 4:
			   System.out.println("Thankyou for exploring with us!");
			   break;
			   
			   default:
				   System.out.println("Invalid choice of number. Please try again!");

		   }
		   
	   } while (choice != 4);
	   
	   sc.close();

	}

}
