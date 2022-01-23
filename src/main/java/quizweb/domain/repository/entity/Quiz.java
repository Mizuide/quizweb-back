package quizweb.domain.repository.entity;

public class Quiz {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz.id
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz.create_userid
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    private Long createUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz.title
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz.description
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz.thumbnail
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    private String thumbnail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz.answerer_num
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    private Integer answererNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz.avarage_correct
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    private Float avarageCorrect;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz.category
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quiz.publish
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    private Boolean publish;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz.id
     *
     * @return the value of quiz.id
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz.id
     *
     * @param id the value for quiz.id
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz.create_userid
     *
     * @return the value of quiz.create_userid
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public Long getCreateUserid() {
        return createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz.create_userid
     *
     * @param createUserid the value for quiz.create_userid
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public void setCreateUserid(Long createUserid) {
        this.createUserid = createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz.title
     *
     * @return the value of quiz.title
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz.title
     *
     * @param title the value for quiz.title
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz.description
     *
     * @return the value of quiz.description
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz.description
     *
     * @param description the value for quiz.description
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz.thumbnail
     *
     * @return the value of quiz.thumbnail
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz.thumbnail
     *
     * @param thumbnail the value for quiz.thumbnail
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz.answerer_num
     *
     * @return the value of quiz.answerer_num
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public Integer getAnswererNum() {
        return answererNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz.answerer_num
     *
     * @param answererNum the value for quiz.answerer_num
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public void setAnswererNum(Integer answererNum) {
        this.answererNum = answererNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz.avarage_correct
     *
     * @return the value of quiz.avarage_correct
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public Float getAvarageCorrect() {
        return avarageCorrect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz.avarage_correct
     *
     * @param avarageCorrect the value for quiz.avarage_correct
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public void setAvarageCorrect(Float avarageCorrect) {
        this.avarageCorrect = avarageCorrect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz.category
     *
     * @return the value of quiz.category
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz.category
     *
     * @param category the value for quiz.category
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quiz.publish
     *
     * @return the value of quiz.publish
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public Boolean getPublish() {
        return publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quiz.publish
     *
     * @param publish the value for quiz.publish
     *
     * @mbg.generated Sun Jan 23 04:48:38 UTC 2022
     */
    public void setPublish(Boolean publish) {
        this.publish = publish;
    }
}