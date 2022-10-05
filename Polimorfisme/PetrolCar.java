public class PetrolCar extends Car {
    private int fluelLevel;

    /*Overloading */
    public PetrolCar(String xmake, String xmodel){
        this.make = xmake;
        this.model = xmodel;
    }

    public PetrolCar(String xmake, String xmodel, int xfluelLevel){
        this.make = xmake;
        this.model = xmodel;
        this.fluelLevel = xfluelLevel;
    }

    public int getFluelLevel() {
        return this.fluelLevel;
    }

    public void fillUp(int xfluelLevel) {
        this.fluelLevel += xfluelLevel;
    }

    /*Override */
    @Override
    public void drive() {
        System.out.println("Broom, broom!");
    }

    @Override
    public String toString() {
        return "{" +
            " make='" + this.make + "'" +
            ", model='" + this.model + "'" +
            ", fluelLevel='" + getFluelLevel() + "'"+
            "}";
    }

}
