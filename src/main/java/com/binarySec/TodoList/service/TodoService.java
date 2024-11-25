package com.binarySec.TodoList.service;

import com.binarySec.TodoList.model.Todo;
import com.binarySec.TodoList.repostory.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo ajouttodo(Todo todo){
        todo.setCreateAt(new Date());
        return todoRepository.save(todo);
    }

    public Todo completerTodo(Long id){
        Todo todo = todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo non trouvé"));
        todo.setCompleted(true);

        return todoRepository.save(todo);
    }


}
