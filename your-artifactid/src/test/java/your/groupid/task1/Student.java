package your.groupid.task1;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString
@SuperBuilder
public class Student extends Human{
    private String firstName;
    private String lastName;
    private LocalDate dob;
    @Singular
    private List<Integer> grades;
    @Singular("NIGGERS_PIDARAS")
    private List<String> mice;
    private int height;
}
