package com.devrafa.NinjasCadastro.Ninjas;

import com.devrafa.NinjasCadastro.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "idade")
    private int idade;

    // @ManyToOne, um ninja tem uma unica missao.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foring key ou chave estrangeira
    private MissoesModel missoes;
}
