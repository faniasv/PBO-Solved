public class Car {
    String make;
    String model;

    public void drive() {
        System.out.println("We go vroom vroom vroom!");
    }
    
    @Override
    public String toString() {
        return "{" +
            " make='" + this.make + "'" +
            ", model='" + this.model + "'" +
            "}";
    }
}
