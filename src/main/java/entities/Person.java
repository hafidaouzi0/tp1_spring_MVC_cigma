package entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity @Table(name = "personne")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Person {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String email;
    private int age;
}
