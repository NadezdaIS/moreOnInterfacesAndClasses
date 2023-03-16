package interfaceExamples;

public abstract class ToyotaCar {

    abstract void activateCollisionDetection();

    public String energyLevelLowNotification() {
        return "Out of energy!";
    }

}
