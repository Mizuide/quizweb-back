package quizweb.presentation.request;

import com.fasterxml.jackson.annotation.JsonCreator;

import quizweb.object.CreateQuizParam;

public class CreateQuizRequest {
    @JsonCreator
    public CreateQuizRequest(CreateQuizParam createQuizParam) {
        this.createQuizParam = createQuizParam;
    }

    private CreateQuizParam createQuizParam;

    public CreateQuizParam getCreateQuizParam() {
        return createQuizParam;
    }
}
