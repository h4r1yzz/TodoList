package com.example.ToDoList.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDoList.models.TodoItem;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}
