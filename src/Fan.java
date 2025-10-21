public class Fan extends Appliance {

    Fan(final String name) {
        super(name);
    }

    @Override
    public String start() {
        return "Fan is running";
    }

}
