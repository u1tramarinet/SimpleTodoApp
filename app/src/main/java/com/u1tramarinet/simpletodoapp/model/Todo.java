package com.u1tramarinet.simpletodoapp.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Date;

public class Todo {
    public final long id;
    @NonNull
    public final String title;
    @Nullable
    public final String description;
    @NonNull
    public final Date createdDate;
    @NonNull
    public final Date updatedDate;
    @Nullable
    public final Date completedDate;
    public final boolean completed;

    public Todo(long id, @NonNull String title, @Nullable String description,
                @NonNull Date createdDate, @NonNull Date updatedDate,
                @Nullable Date completedDate, boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.completedDate = completedDate;
        this.completed = completed;
    }
}
