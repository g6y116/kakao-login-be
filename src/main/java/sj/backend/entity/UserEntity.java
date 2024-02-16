package sj.backend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "email")
    private String email;

    @Column(name = "profile")
    private String profile;

    public UserEntity(String identifier, String nickname, String email, String profile) {
        this.identifier = identifier;
        this.nickname = nickname;
        this.email = email;
        this.profile = profile;
    }
}
