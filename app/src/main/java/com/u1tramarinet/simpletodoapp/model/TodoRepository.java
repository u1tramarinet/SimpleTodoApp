package com.u1tramarinet.simpletodoapp.model;

import androidx.annotation.NonNull;

import com.u1tramarinet.simpletodoapp.infrastructure.realm.RealmTodoDataSource;

public class TodoRepository {
    @NonNull
    private static final TodoRepository INSTANCE = new TodoRepository();

    @NonNull
    private final TodoDataSource dataSource;

    private TodoRepository() {
        // Choose infra software
        dataSource = new RealmTodoDataSource();
//        dataSource = new RoomTodoDataSource();
    }

    public static TodoRepository getInstance() {
        return INSTANCE;
    }

    public void create(@NonNull Todo todo) {
        dataSource.create(todo);
    }

    public void get(long id) {
        dataSource.read(id);
    }

    public void update(@NonNull Todo todo) {
        dataSource.update(todo);
    }

    public void delete(long id) {
        dataSource.delete(id);
    }
}
