package quizweb.domain.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

import quizweb.domain.repository.entity.QuizDetail;

@Mapper
public interface QuizDetailMapper {
 
    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table quiz
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    QuizDetail getQuizDetail(Long id);


}