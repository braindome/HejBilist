public class Car extends Vehicle {

    public Car() {
        this.distance = 100;
        System.out.println("Car created. " + this.distance + " miles to go!");
    }

    public void drive() {
        this.distance = this.distance - 10;
        System.out.println("Car drove 10 miles. " + this.distance + " miles to go!");

    }

    public void setDriver(Driver driver) {
        if (driver.getAge() < 18) {
            System.out.println("Driver not changed! " + driver.name + " is " + driver.age + " , but must be 18 or older to drive tank");
        } else {
            System.out.println("Driver changed to " + driver.name);
        }
    }
}
