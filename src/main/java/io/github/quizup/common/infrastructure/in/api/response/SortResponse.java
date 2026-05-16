package io.github.quizup.common.infrastructure.in.api.response;

import io.github.quizup.common.domain.model.search.SortDirection;

import java.io.Serializable;

public record SortResponse(
        String property,
        SortDirection direction
) implements Serializable {
}
