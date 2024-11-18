package your.groupid.decorator;

public class TimedDocument implements AbstractDecorator {
    SmartDocument wrap = null;

    public TimedDocument(SmartDocument wrap) {
        this.wrap = wrap;
    }

    @Override
    public String parse() {
        long start = System.nanoTime();
        String ret_value = wrap.parse();
        long end_time = System.nanoTime();

        return ret_value + "\nExecution time is: " + ((double) (end_time - start)) / 1000000000d;
    }
}
