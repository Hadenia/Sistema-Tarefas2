package com.example.sistematarefas.beans;

import com.example.sistematarefas.repository.TarefaRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.sistematarefas.model.Tarefa;

import javax.annotation.PostConstruct;

@ManagedBean
@Named(value = "tarefaMB")
@ViewScoped
public class TarefaMB {


    @Getter
    @Setter
    private List<Tarefa> tarefas = new ArrayList<>();

    @Getter
    @Setter
    private Tarefa tarefa;

    @Autowired
    private TarefaRepository tarefaRepository;

    @PostConstruct
    public List<Tarefa> listarTodas() {
        tarefas = tarefaRepository.findAll();
        return tarefas;
    }


    public Integer getTamanhoDaLista() {
        return tarefas.size();
    }

}


