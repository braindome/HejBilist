public class MilitaryTank extends Vehicle {

    public MilitaryTank() {
        this.distance = 2000;
        System.out.println("Tank created. " + this.distance + " miles to go!");
    }

    public void drive() {
        this.distance = this.distance - 5;
        System.out.println("Car drove 10 miles. " + this.distance + " miles to go!");
    }

    public void setDriver(Driver driver) {;
        if (driver.getAge() < 30) {System.out.println("Driver not changed! " + driver.name + " is " + driver.age + " , but must be 30 or older to drive tank");
        } else {
            System.out.println("Driver changed to " + driver.name);
        }
    }
}
