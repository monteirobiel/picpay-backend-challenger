package monteirodev.com.br.picpay_challenger.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_wallet")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cpf_cnpj", nullable = false, unique = true)
    private String cpfCnpj;


    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column (name = "full_name")
    private String fullName;

    @Column (name = "password")
    private String password;

    @Column (name = "balance")
    private BigDecimal balance = BigDecimal.ZERO;

    @ManyToOne
    @JoinColumn(name = "wallet_type_id")
    private WalletType walletType;


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
