package quizweb.domain.repository.entity;

public class QuizTagging {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz_tagging.quiz_id
     *
     * @mbg.generated Sat Oct 16 07:15:00 UTC 2021
     */
    private Long quizId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz_tagging.tag_id
     *
     * @mbg.generated Sat Oct 16 07:15:00 UTC 2021
     */
    private Long tagId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz_tagging.quiz_id
     *
     * @return the value of quiz_tagging.quiz_id
     *
     * @mbg.generated Sat Oct 16 07:15:00 UTC 2021
     */
    public Long getQuizId() {
        return quizId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz_tagging.quiz_id
     *
     * @param quizId the value for quiz_tagging.quiz_id
     *
     * @mbg.generated Sat Oct 16 07:15:00 UTC 2021
     */
    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz_tagging.tag_id
     *
     * @return the value of quiz_tagging.tag_id
     *
     * @mbg.generated Sat Oct 16 07:15:00 UTC 2021
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz_tagging.tag_id
     *
     * @param tagId the value for quiz_tagging.tag_id
     *
     * @mbg.generated Sat Oct 16 07:15:00 UTC 2021
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}