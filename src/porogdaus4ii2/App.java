package porogdaus4ii2;

public class App {
    public static void main(String[] args) {
        Car car = Car.newBuilder()
                .withType("Sedan")
                .withEngine("petrol")
                .build();
        System.out.println(car.toString());

        Car car2 = Car.newBuilder()
                .withType("hechbek")
                .withEngine("petrol")
                .withSeats(4)
                .withTransmission("Auto")
                .build();
        System.out.println(car2.toString());



    }
}
