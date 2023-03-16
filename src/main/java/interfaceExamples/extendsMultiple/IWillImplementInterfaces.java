package interfaceExamples.extendsMultiple;

import interfaceExamples.Car;
import interfaceExamples.EUSpec;

public class IWillImplementInterfaces implements IWillExtendAll, EUSpec {
    @Override
    public void methodInFirst() {

    }

    @Override
    public void methodInIWillExtendAll() {

    }

    @Override
    public void methodInSecond() {

    }

    @Override
    public void methodInThird() {

    }

    @Override
    public void setMaxOfPassenger(int numberOfPassenger) {

    }

    @Override
    public String calculateMaximumAllowWeight() {
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        IWillImplementInterfaces iWillImplementInterfaces = new IWillImplementInterfaces();

        iWillImplementInterfaces.calculateMaximumAllowWeight();
        iWillImplementInterfaces.setMaxOfPassenger(23);
        iWillImplementInterfaces.methodInFirst();
        iWillImplementInterfaces.methodInSecond();
        iWillImplementInterfaces.methodInThird();
        iWillImplementInterfaces.methodInIWillExtendAll();
        iWillImplementInterfaces.methodsCanNowHaveBody("something");
    }
}
