package com.devrafa.NinjasCadastro.Missoes;

import com.devrafa.NinjasCadastro.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDaMissao;

    private String dificuldade;

    // uma missao pode ter varios ninjas, porem um ninja so pode ter uma missao!
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}
