package interfaceExamples;

public class Yaris extends ToyotaCar implements Car, EUSpec {

    private String modelSN;
    private IgnitionType ignitionType;

    private final EnergyType gasType = EnergyType.VODKA;

    private float energyLevel;
    public Yaris(String modelSN, IgnitionType ignitionType){
        this.ignitionType = ignitionType;
        this.modelSN = modelSN;
    }

    @Override
    void activateCollisionDetection() {

    }

    @Override
    public String start() {
        return this.modelSN + " Started using " + this.ignitionType;
    }

    @Override
    public String stop() {
        return this.modelSN + " stopped using breaks";
    }

    @Override
    public float getEnergyLevel() {
        return this.energyLevel;
    }

    @Override
    public String addToEnergySource(EnergyType energyType, float amountOfEnergy) {
        if (!energyType.equals(this.gasType)) return "Help!, not compatible "+ energyType;

        this.energyLevel += amountOfEnergy;

        return "Energy level increased. " + this.gasType + " level is: " + this.energyLevel;
    }

    @Override
    public String drive(float meter) {
        if (this.energyLevel <= 0) return "Not enough " + this.gasType;
        if (energyLevel - (meter / maxCO2Emission)  < 0)
            return "Unable to drive " + meter  + " with " + this.energyLevel;

        this.energyLevel -= meter / maxCO2Emission;

        return "driving " + meter + " meters";
    }

    @Override
    public boolean isAirConditionPresent() {
        return false;
    }

    @Override
    public void setMaxOfPassenger(int numberOfPassenger) {

    }

    @Override
    public String calculateMaximumAllowWeight() {
        return "Max allowed weight is: 500kg";
    }
}
