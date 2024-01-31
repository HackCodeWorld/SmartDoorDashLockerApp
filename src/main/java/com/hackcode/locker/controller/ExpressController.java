package com.hackcode.locker.controller;

import com.hackcode.locker.model.Express;
import com.hackcode.locker.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/express")
public class ExpressController {
    @Autowired
    private ExpressService expressService;

    @GetMapping("/")
    public List<Express> getAllExpresses() {
        return expressService.getAllExpresses();
    }

    // 其他请求处理方法...
}
