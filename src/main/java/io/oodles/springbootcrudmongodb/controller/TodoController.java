package io.oodles.springbootcrudmongodb.controller;

import io.oodles.springbootcrudmongodb.model.TodoDTO;
import io.oodles.springbootcrudmongodb.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepo todoRepo;

    @GetMapping("/todos")
    public ResponseEntity<?> getAll(){
        List<TodoDTO> todoDTOList = todoRepo.findAll();
        if (todoDTOList.size()>0)
            return new ResponseEntity<List<TodoDTO>>(todoDTOList, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
