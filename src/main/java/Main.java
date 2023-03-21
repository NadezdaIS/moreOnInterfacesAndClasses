import innerClassExaples.User.Supervisor;
import interfaceExamples.EnergyType;
import interfaceExamples.IgnitionType;
import interfaceExamples.ToyotaCar;
import interfaceExamples.Yaris;

public class Main {
    public static void main(String[] args) {
        Yaris model2004 = new Yaris("YARIS2004-01382", IgnitionType.VOICE);
        Yaris model2005 = new Yaris("YARIS2005-33382", IgnitionType.BUTTON);
        Yaris model2006 = new Yaris("YARIS2006-44382", IgnitionType.REMOTE);
        Yaris model2007 = new Yaris("YARIS2007-22382", IgnitionType.KEY);

        System.out.println(model2004.start());
        System.out.println(model2004.drive(223));
        System.out.println(model2004.stop());

        System.out.println(model2005.start());
        System.out.println(model2005.addToEnergySource(EnergyType.COAL, 234));
        System.out.println(model2005.addToEnergySource(EnergyType.VODKA, 123));
        System.out.println(model2005.drive(12));
        System.out.println(model2005.drive(4567));
        System.out.println(model2005.drive(453343467));

        System.out.println(model2005.calculateMaximumAllowWeight());
        System.out.println("has air condition: " + model2005.isAirConditionPresent());
        System.out.println(model2005.isAirConditionPresent());
        System.out.println(model2005.energyLevelLowNotification());
        System.out.println(model2005.addToEnergySource(EnergyType.VODKA, 444666));
        System.out.println(model2005.drive(3435));
        System.out.println(model2005.stop());


        /*static innner class can be imported seprately in thiis way*/
        Supervisor supervisor = new Supervisor();

        //Anonymous class
        /*ToyotaCar camry = new ToyotaCar() {
            @Override
            public String energyLevelLowNotification() {
                return super.energyLevelLowNotification();
            }

            @Override
            void activateCollisionDetection() {

            }
        }*/
    }
}

