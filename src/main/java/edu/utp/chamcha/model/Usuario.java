package edu.utp.chamcha.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
/*
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder*/
@Entity
@Table(name = "t_user")
public class Usuario {
    @Id
    @Column(name = "user_id")/*para qe salgan iguales */
    private String userID;
    private String password;

}
