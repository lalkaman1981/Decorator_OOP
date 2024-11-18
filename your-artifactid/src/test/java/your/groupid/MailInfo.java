package your.groupid;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailInfo implements MailCode{
    private Client client;
    private int mailCode;


    @Override
    public String generate(Client client) {
        return mailCode.generate(client);
    }
}
