import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vehicleNumber = 101;
        double wasteCollected = 125.5;
        int collectionPoints = 8;
        char vehicleStatus = 'A';

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        sc.close();
    }
}