package com.hackcode.locker.service;

import com.hackcode.locker.model.Express;
import com.hackcode.locker.mapper.ExpressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpressService {
    // 通过 @Autowired 注解，Spring 会自动注入 ExpressMapper
    @Autowired
    private ExpressMapper expressMapper;

    /**
     * 获取所有快递
     * @return
     */
    public List<Express> getAllExpresses() {
        return expressMapper.selectAllExpresses();
    }

    /**
     * 根据id查询快递
     * @param id
     * @return
     */
    public Express getExpressById(int id) {
        return expressMapper.selectExpressById(id);
    }

    /**
     * 添加快递
     * @param express
     */
    public void addExpress(Express express) {
        expressMapper.insertExpress(express);
    }

    /**
     * 更新快递
     * @param express
     */
    public void updateExpress(Express express) {
        expressMapper.updateExpress(express);
    }

    /**
     * 删除快递
     * @param id
     */
    public void deleteExpress(int id) {
        expressMapper.deleteExpress(id);
    }

    /**
     * 删除所有快递
     */
    public void deleteAllExpresses() {
        expressMapper.deleteAllExpresses();
    }

    /**
     * 批量删除快递
     * @param ids
     */
    public void deleteExpresses(List<Integer> ids) {
        expressMapper.deleteExpresses(ids);
    }

    /**
     * 批量更新快递状态
     * @param expresses
     */
    public void updateExpresses(List<Express> expresses) {
        expressMapper.updateExpresses(expresses);
    }

    /**
     * 批量插入快递
     * @param expresses
     */
    public void addExpresses(List<Express> expresses) {
        expressMapper.insertExpresses(expresses);
    }

    /**
     * 根据用户id查询快递
     * @param userId
     * @return
     */
    public List<Express> getExpressesByUserId(int userId) {
        return expressMapper.selectExpressesByUserId(userId);
    }

    /**
     * 根据快递柜id查询快递
     * @param lockerId
     * @return
     */
    public List<Express> getExpressesByLockerId(int lockerId) {
        return expressMapper.selectExpressesByLockerId(lockerId);
    }

    /**
     * 根据快递状态查询快递
     * @param status
     * @return
     */
    public List<Express> getExpressesByStatus(String status) {
        return expressMapper.selectExpressesByStatus(status);
    }

    /**
     * 根据用户id和快递状态查询快递
     * @param userId
     * @param status
     * @return
     */
    public List<Express> getExpressesByUserIdAndStatus(int userId, String status) {
        return expressMapper.selectExpressesByUserIdAndStatus(userId, status);
    }

    /**
     * 根据快递柜id和快递状态查询快递
     * @param lockerId
     * @param status
     * @return
     */
    public List<Express> getExpressesByLockerIdAndStatus(int lockerId, String status) {
        return expressMapper.selectExpressesByLockerIdAndStatus(lockerId, status);
    }

    /**
     * 根据用户id和快递柜id查询快递
     * @param userId
     * @param lockerId
     * @return
     */
    public List<Express> getExpressesByUserIdAndLockerId(int userId, int lockerId) {
        return expressMapper.selectExpressesByUserIdAndLockerId(userId, lockerId);
    }

    /**
     * 根据用户id和快递柜id和快递状态查询快递
     * @param userId
     * @param lockerId
     * @param status
     * @return
     */
    public List<Express> getExpressesByUserIdAndLockerIdAndStatus(int userId, int lockerId, String status) {
        return expressMapper.selectExpressesByUserIdAndLockerIdAndStatus(userId, lockerId, status);
    }

    /**
     * 根据用户id和快递柜id和快递状态和时间查询快递
     * @param userId
     * @param lockerId
     * @param status
     * @param startTime
     * @param endTime
     * @return
     */
    public List<Express> getExpressesByUserIdAndLockerIdAndStatusAndTime(int userId, int lockerId, String status, String startTime, String endTime) {
        return expressMapper.selectExpressesByUserIdAndLockerIdAndStatusAndTime(userId, lockerId, status, startTime, endTime);
    }
}
