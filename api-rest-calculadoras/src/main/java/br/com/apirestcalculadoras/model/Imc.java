package br.com.apirestcalculadoras.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_IMC")
public class Imc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMC")
    private Integer id;
    @Column(name = "CODIGO_FUNCIONARIO")
    private Integer codFunicionario;
    @Column(name = "NOME_FUNCIONARIO")
    private String nomeFuncionario;
    @Column(name = "IDADE_FUNCIONARIO")
    private Integer idade;

    @Column(name = "SEXO_FUNCIONARIO")
    private String sexo;
    @Column(name = "PESE_FUNCIONARIO")
    private BigDecimal peso;
    @Column(name = "ALTURA_FUNCIONARIO")
    private BigDecimal altura;
    @Column(name = "RESULTADO_IMC")
    private BigDecimal resultadoImc;
    @Column(name = "DESCRICAO_RESULTDADO_IMC")
    private BigDecimal descricaoResultadoImc;
    @Column(name = "DATA_RESULTADO_IMC")
    private LocalDate dataResltadoImc = LocalDate.now();
    @Column(name = "ID_OPERADOR")
    private Integer idOperador;
    @Column(name = "DT_ALTERACAO")
    private Date dtAlteracao;
    @Column(name = "DT_EXCLUSAO")
    private Date dtExclusao;

}