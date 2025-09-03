package Tivoli01;

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
        int height = 160;
        if (height >= r.getRideHeight()){
            System.out.println("Du er høj nok");
        } else {
            System.out.println("Gå hjem igen");
        }
    }
}
