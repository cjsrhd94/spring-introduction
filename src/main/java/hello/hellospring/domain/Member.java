package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)     //DB에서 자동으로 아이디를 부여하는 전략.
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
