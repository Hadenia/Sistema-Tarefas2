package com.example.sistematarefas.beans;

import com.example.sistematarefas.repository.TarefaRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

import com.example.sistematarefas.model.Tarefa;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping
    public void concluir(@RequestBody Tarefa tarefa){
        tarefa.setSituacao("Concluida");
        tarefaRepository.save(tarefa);
    }

/*
    @DeleteMapping
    public void deletar(@PathVariable Long id){
        tarefaRepository.deleteById(id);
    }
*/

    @DeleteMapping
    public void deletar(@RequestBody Tarefa tarefa){
        tarefaRepository.delete(tarefa);
    }


    @PostMapping
    public void incluir(@RequestBody Tarefa tarefa){
        tarefa.setId(1L);
        tarefaRepository.save(tarefa);
        tarefa = new Tarefa();
        tarefas = tarefaRepository.findAll();
    }

    @PostMapping
    public void alterar(@RequestBody Tarefa tarefa){
            tarefaRepository.save(tarefa);
            tarefa = new Tarefa();
    }

    public void novo() {
        tarefa = new Tarefa();
    }


}


