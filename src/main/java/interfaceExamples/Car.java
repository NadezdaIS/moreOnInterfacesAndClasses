package interfaceExamples;

public interface Car {
    // public, static, and final are all fields and methods, variables are not usually included in interfaces
    EnergyType energyType = EnergyType.GAS;
    String carName = "";
    String start();
    String stop();

    float getEnergyLevel();

    String addToEnergySource(EnergyType energyType, float amountOfEnergy);

    String drive(float meter);

    boolean isAirConditionPresent();

}
