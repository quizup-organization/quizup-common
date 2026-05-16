package io.github.quizup.common.infrastructure.in.api.request;

import io.github.quizup.common.domain.model.search.PageCriteria;

import java.io.Serializable;

/**
 * DTO REST pour les critères de pagination.
 * Implémente {@link PageCriteria} pour être directement utilisable dans la couche domaine.
 */
public record PageRequest(
        Integer number,
        Integer size
) implements PageCriteria, Serializable {
}

