import java.util.Scanner;

public class placeTiles {

    public static int placeTiles(int n, int m) {
    
        //base cases
        if (n == 0) return 1; // fully covered
        
        if (n < 0) return 0; //Overfilled, invalid case

    // vertically
    int vertPlacements = placeTiles(n-m, m);

    //horizontally
    int horPlacements =  placeTiles(n-1, m);

    return vertPlacements + horPlacements;
    //recursion relation : Try placing a vertical and horizontal tile
   }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        //input for floor dimensions 
        System.out.print("Enter floor width (m): ");
        int m = sc.nextInt();
        System.out.print("Enter floor length (n) : ");
        int n = sc.nextInt();
        sc.close();
      
        //output
        System.out.println("Total number of ways the tiles can be placed on the floor: " + placeTiles(n, m));

    }

}