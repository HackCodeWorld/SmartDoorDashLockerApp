package com.hackcode.locker.mapper;

import com.hackcode.locker.model.Express;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * ExpressMapper 是一个 MyBatis Mapper 接口。它定义了对 Express 表进行增删改查的方法。
 * @Mapper 注解是 MyBatis 提供的一个注解，它会自动为这个接口创建一个代理对象，这样你就可以在服务层中直接使用这个接口。
 * ExpressMapper 接口中的方法名和参数名需要和 ExpressMapper.xml 中的 SQL 语句的 id 和参数名一一对应。
 * ExpressMapper 接口中的方法返回值需要和 ExpressMapper.xml 中的 SQL 语句的 resultType 一致。
 * ExpressMapper 接口中的方法参数可以是基本类型，也可以是实体类。
 * ExpressMapper 接口中的方法返回值可以是基本类型，也可以是实体类，还可以是 List。
 * ExpressMapper 接口中的方法参数可以是多个，也可以是 Map。
 * ExpressMapper 接口中的方法参数可以是注解，也可以是注解的组合。
 */
@Mapper
public interface ExpressMapper {
    Express selectExpressById(int id);
    List<Express> selectAllExpresses();
    int insertExpress(Express express);
    int updateExpress(Express express);
    int deleteExpress(int id);

    void deleteAllExpresses();

    void deleteExpresses(List<Integer> ids);

    void updateExpresses(List<Express> expresses);

    void insertExpresses(List<Express> expresses);

    List<Express> selectExpressesByUserId(int userId);

    List<Express> selectExpressesByLockerId(int lockerId);

    List<Express> selectExpressesByStatus(String status);

    List<Express> selectExpressesByUserIdAndStatus(int userId, String status);

    List<Express> selectExpressesByLockerIdAndStatus(int lockerId, String status);

    List<Express> selectExpressesByUserIdAndLockerId(int userId, int lockerId);

    List<Express> selectExpressesByUserIdAndLockerIdAndStatus(int userId, int lockerId, String status);

    List<Express> selectExpressesByUserIdAndLockerIdAndStatusAndTime(int userId, int lockerId, String status, String startTime, String endTime);
}
