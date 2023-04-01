package entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Person {

    @Id @GeneratorType(strategy= GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String email;
    private int age;
}
