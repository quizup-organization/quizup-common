package io.github.quizup.common.domain.model.search;

public record DefaultSortCriteria(
        String property,
        SortDirection direction
) implements SortCriteria {
}
