package interfaceExamples.extendsMultiple;

public interface IWillExtendAll extends First, Second, Third {

    void methodInIWillExtendAll();

    default void methodsCanNowHaveBody(String a){

        System.out.println("Yay, i can finally have implementation " + a );
    }
}
