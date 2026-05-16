package io.github.quizup.common.domain.model.search;

public interface PageCriteria {

    Integer size();

    Integer number();

    static PageCriteria unpaged() {
        return new DefaultPageCriteria(0, 0);
    }
}
