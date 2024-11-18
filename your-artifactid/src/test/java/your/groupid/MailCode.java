package your.groupid;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public interface MailCode {
    String generate(Client client);
}
