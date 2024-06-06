package monteirodev.com.br.picpay_challenger.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {

    @Id
    @Column(nullable = false, unique = true)
    private String cpf;
    private String email;
    private String password;


    public user () {}

    public user(String cpf, String email) {
        this.cpf = cpf;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
