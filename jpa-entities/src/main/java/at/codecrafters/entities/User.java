package at.codecrafters.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
