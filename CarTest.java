public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setDoors(2);
        car.setConvertable(true);
        car.setMake("maclaren");
        car.setModel("G129");

        System.out.println(car.getDoors());
    }
}
