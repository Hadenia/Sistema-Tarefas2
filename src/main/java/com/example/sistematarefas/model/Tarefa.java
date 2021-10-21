package com.example.sistematarefas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Tarefa {

    @Id
    private Long id;
    private String titulo;
    private String descricao;
    private String responsavel;
    private String prioridade;
    private String deadline;
    private String situacao;
}
