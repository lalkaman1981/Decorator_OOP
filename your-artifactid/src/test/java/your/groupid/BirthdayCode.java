package your.groupid;

public class BirthdayCode implements MailCode{
    @Override
    public String generate(Client client) {
        return String.format("Dear Pidor %s", client.getName());
    }
}
