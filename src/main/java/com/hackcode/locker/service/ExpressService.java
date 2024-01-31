package com.hackcode.locker.service;

import com.hackcode.locker.model.Express;
import com.hackcode.locker.mapper.ExpressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpressService {
    @Autowired
    private ExpressMapper expressMapper;

    public List<Express> getAllExpresses() {
        return expressMapper.selectAllExpresses();
    }

    // 其他业务方法...
}
