public class WashingMachine extends Appliance {

    WashingMachine(final String name) {
        super(name);
    }

    @Override
    public String start() {
        return "Washing Machine is operating";
    }

}
