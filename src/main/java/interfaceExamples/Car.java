package interfaceExamples;

public interface Car {
    EnergyType energyType = EnergyType.GAS;
    String carName = "";
    String start();
    String stop();

    float getEnergyLevel();

    String addToEnergySource(EnergyType energyType, float amountOfEnergy);

    String drive(float meter);

    boolean isAirConditionPresent();

}
