package quizweb.domain.repository.mapper.base;

import org.apache.ibatis.annotations.Mapper;
import quizweb.domain.repository.entity.Choice;

@Mapper
public interface ChoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Mon Apr 17 16:14:48 UTC 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Mon Apr 17 16:14:48 UTC 2023
     */
    int insert(Choice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Mon Apr 17 16:14:48 UTC 2023
     */
    int insertSelective(Choice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Mon Apr 17 16:14:48 UTC 2023
     */
    Choice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Mon Apr 17 16:14:48 UTC 2023
     */
    int updateByPrimaryKeySelective(Choice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Mon Apr 17 16:14:48 UTC 2023
     */
    int updateByPrimaryKeyWithBLOBs(Choice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Mon Apr 17 16:14:48 UTC 2023
     */
    int updateByPrimaryKey(Choice record);
}