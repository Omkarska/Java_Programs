import java.util.Scanner;

interface Vehicle {
    void move();
}

class Helicopter implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}

public class VehicleFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of vehicle (helicopter/car/train): ");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle = createVehicle(vehicleType);

        if (vehicle != null) {
            vehicle.move();
        } else {
            System.out.println("Invalid vehicle type. Please try again.");
        }
    }

    public static Vehicle createVehicle(String vehicleType) {
        switch (vehicleType) {
            case "helicopter":
                return new Helicopter();
            case "car":
                return new Car();
            case "train":
                return new Train();
            default:
                return null;
        }
    }
}
