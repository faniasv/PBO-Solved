public class ElectricCar extends Car {
    private int batteryLevel;

    /*Overloading */
    public ElectricCar(String xmake, String xmodel){
        this.make = xmake;
        this.model = xmodel;
    }

    public ElectricCar(String xmake, String xmodel, int xbatteryLevel){
        this.make = xmake;
        this.model = xmodel;
        this.batteryLevel = xbatteryLevel;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public void charge(int xbatteryLevel) {
        this.batteryLevel += xbatteryLevel;
    }

    /*Override */
    @Override
    public void drive() {
        System.out.println("Whoosh whoosh!");
    }

    @Override
    public String toString() {
        return "{" +
            " make='" + this.make + "'" +
            ", model='" + this.model + "'" +
            ", batteryLevel='" + getBatteryLevel() + "'"+
            "}";
    }
}
