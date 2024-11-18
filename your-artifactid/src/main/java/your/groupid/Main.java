package your.groupid;

import your.groupid.decorator.CacheDocument;
import your.groupid.decorator.SmartDocument;
import your.groupid.decorator.TimedDocument;

public class Main {
    public static void main(String[] args) {
        SmartDocument sd = new SmartDocument("./StrategyAndDecoratorPatterns (1).png");

        TimedDocument td = new TimedDocument(sd);
        System.out.println(td.parse());

        CacheDocument cd = new CacheDocument(sd);
        cd.parse();
        cd.parse();
    }
}