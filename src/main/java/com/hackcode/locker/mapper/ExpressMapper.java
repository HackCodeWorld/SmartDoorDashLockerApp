package com.hackcode.locker.mapper;

import com.hackcode.locker.model.Express;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ExpressMapper {
    Express selectExpressById(Long id);
    List<Express> selectAllExpresses();
    int insertExpress(Express express);
    int updateExpress(Express express);
    int deleteExpress(Long id);
}
