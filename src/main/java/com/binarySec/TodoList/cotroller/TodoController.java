package com.binarySec.TodoList.cotroller;

import com.binarySec.TodoList.model.Todo;
import com.binarySec.TodoList.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("ajoutTodo")
    public Todo create(@RequestBody Todo todo){
        return todoService.ajouttodo(todo);
    }

    @PutMapping("completed/{id}")
    public Todo competed(@PathVariable Long id){
        return todoService.completerTodo(id);
    }
}
