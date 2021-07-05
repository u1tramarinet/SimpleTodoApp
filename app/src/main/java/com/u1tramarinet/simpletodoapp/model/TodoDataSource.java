package com.u1tramarinet.simpletodoapp.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Date;

public interface TodoDataSource {
    void create(@NonNull Todo todo);

    @NonNull
    Result<?> read(long id);

    @NonNull
    Result<?> update(@NonNull Todo todo);

    @NonNull
    Result<?> delete(long id);

    abstract class Result<T> {
        public final boolean succeeded;

        private Result(boolean succeeded) {
            this.succeeded = succeeded;
        }

        public static <Data> Result<Data> success(@NonNull Data data) {
            return new Success<>(data);
        }

        public static Result<Exception> failure(@NonNull Exception e) {
            return new Failure(e);
        }

        public static class Success<Data> extends Result<Data> {
            public final Data data;
            private Success(@NonNull Data data) {
                super(true);
                this.data = data;
            }
        }

        public static class Failure extends Result<Exception> {
            @NonNull
            public final Exception error;
            private Failure(@NonNull Exception e) {
                super(false);
                this.error = e;
            }
        }
    }
}
