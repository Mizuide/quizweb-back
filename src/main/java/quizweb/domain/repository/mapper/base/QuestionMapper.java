package quizweb.domain.repository.mapper.base;

import org.apache.ibatis.annotations.Mapper;
import quizweb.domain.repository.entity.Question;

@Mapper
public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jan 25 12:51:21 UTC 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jan 25 12:51:21 UTC 2022
     */
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jan 25 12:51:21 UTC 2022
     */
    int insertSelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jan 25 12:51:21 UTC 2022
     */
    Question selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jan 25 12:51:21 UTC 2022
     */
    int updateByPrimaryKeySelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jan 25 12:51:21 UTC 2022
     */
    int updateByPrimaryKeyWithBLOBs(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Jan 25 12:51:21 UTC 2022
     */
    int updateByPrimaryKey(Question record);
}