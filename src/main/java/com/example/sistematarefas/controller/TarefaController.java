package com.example.sistematarefas.controller;

import com.example.sistematarefas.model.Tarefa;
import com.example.sistematarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    /*  @GetMapping
      public Aluno getInfor(){
         Aluno aluno = new Aluno(1L, "Hadenia Rodrigues", "3333-4444", "hadenia@feltex.com.br", Instant.now());
          return aluno;
      }
    */
    @GetMapping
    public List<Tarefa> listar(){
        return tarefaRepository.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Tarefa tarefa){
        tarefaRepository.save(tarefa);
    }

    @PutMapping
    public void alterar(@RequestBody Tarefa tarefa){
        tarefaRepository.save(tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        tarefaRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Tarefa> ler(@PathVariable Long id){
        return tarefaRepository.findById(id);
    }
}
