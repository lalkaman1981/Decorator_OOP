package your.groupid;


import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Client {
    private int counter;
    private int id = counter++;
    private String name;
    private LocalDate dob;
    private String sex;
    
    public Client(String name, LocalDate dob, String sex) {
        this.name = name;
        this.dob = dob;
        this.sex = sex;
    }
}
