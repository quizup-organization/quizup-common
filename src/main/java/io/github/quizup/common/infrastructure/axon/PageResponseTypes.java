package io.github.quizup.common.infrastructure.axon;

public interface PageResponseTypes {

    static <R> PageResponseResponseType<R> pageResponseOf(Class<R> type) {
        return new PageResponseResponseType<>(type);
    }

    static <R> PageResultResponseType<R> pageResultOf(Class<R> type) {
        return new PageResultResponseType<>(type);
    }
}
