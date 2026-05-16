package io.github.quizup.common.domain.exception;

import java.util.Map;

public abstract class SearchableProblem extends BaseProblem {

    protected SearchableProblem(
            String type,
            String title,
            String detail,
            Map<String, Object> context) {
        super(type, ProblemCategory.TECHNICAL, title, detail, context);
    }
}
