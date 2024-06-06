package monteirodev.com.br.picpay_challenger.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_wallet")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String cpfCnpj;
    private String email;

    private String fullName;
    private String password;
    private BigDecimal balance;


    public Wallet() {}

    public Wallet(String cpf, String email) {
        this.cpfCnpj = cpf;
        this.email = email;
    }

    public String getCpf() {
        return cpfCnpj;
    }

    public void setCpf(String cpf) {
        this.cpfCnpj = cpf;
    }
}
