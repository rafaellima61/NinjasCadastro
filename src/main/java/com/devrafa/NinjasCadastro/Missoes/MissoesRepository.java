package com.devrafa.NinjasCadastro.Missoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
    // Aqui podemos criar metodos personalizados para buscar as missoes
    // Exemplo: List<MissoesModel> findByNomeDaMissao(String nomeDaMissao);

}
