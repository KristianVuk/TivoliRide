package Tivoli01;
import java.util.Scanner;
public class TivoliRideTest {
    public static void main(String[] args) {
        CreateRide();
    }
    public static void CreateRide() {
       //Opret Ride
        TivoliRideMain r1 = new TivoliRideMain("Demon", 150);
        TestHeight(r1);
    }
    public static void TestHeight(TivoliRideMain r) {
        int height;
        //int height = 160;
        while (1 != 0) {
            Scanner in = new Scanner(System.in);
            System.out.print("Skriv din højde i cm: ");
            height = in.nextInt();
            if (height >= r.getRideHeight()){
                System.out.println("Du er høj nok");
            } else {
                System.out.println("Gå hjem igen");
            }
        }

    }
}
