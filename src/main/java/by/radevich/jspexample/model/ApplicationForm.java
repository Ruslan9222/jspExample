package by.radevich.jspexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApplicationForm {
    private String firstName;
    private String secondName;
    private String city;
    private int age;

}
