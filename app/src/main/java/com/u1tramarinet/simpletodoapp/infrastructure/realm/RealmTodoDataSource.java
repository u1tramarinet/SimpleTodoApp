package com.u1tramarinet.simpletodoapp.infrastructure.realm;

import androidx.annotation.NonNull;

import com.u1tramarinet.simpletodoapp.model.Todo;
import com.u1tramarinet.simpletodoapp.model.TodoDataSource;

public class RealmTodoDataSource implements TodoDataSource {
    @Override
    public void create(@NonNull Todo todo) {

    }

    @NonNull
    @Override
    public Result<?> read(long id) {
        return null;
    }

    @NonNull
    @Override
    public Result<?> update(@NonNull Todo todo) {
        return null;
    }

    @NonNull
    @Override
    public Result<?> delete(long id) {
        return null;
    }
}
