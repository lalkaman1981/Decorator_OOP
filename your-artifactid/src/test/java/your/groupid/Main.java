package your.groupid;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Boba", LocaleDate, "Bimba");
        MailInfo mailInfo = new MailInfo(client, LocalDate);
        System.out.println(mailInfo.generate());
    }
}
