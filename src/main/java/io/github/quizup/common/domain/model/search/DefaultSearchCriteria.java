package io.github.quizup.common.domain.model.search;

import java.util.List;

public record DefaultSearchCriteria(
        List<FilterCriteria> filters,
        List<SortCriteria> sorts,
        PageCriteria page
) implements SearchCriteria {
}
