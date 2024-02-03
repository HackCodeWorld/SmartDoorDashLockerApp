package com.hackcode.locker.controller;

import com.hackcode.locker.model.Express;
import com.hackcode.locker.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @RestController： 这个注解表明 ExpressController 是一个 RESTful 控制器。它是 @Controller 和 @ResponseBody 注解的组合，意味着这个控制器的所有方法都会自动序列化返回对象为 JSON 或 XML 响应。
 * @RequestMapping("/api/express")： 这个注解用于定义控制器处理的请求的基础路径。在这个例子中，ExpressController 处理的所有请求都会以 /api/express 开头。
 * @Autowired： 这个注解用于自动注入 ExpressService。Spring 会在启动时自动查找匹配的组件并注入它，这样你就可以在控制器中使用服务层的方法。
 * @GetMapping("/")： 这个注解用于将 HTTP GET 请求映射到 getAllExpresses 方法。当有人访问 /api/express/ 路径时，这个方法会被调用。
 * <p>
 * public List<Express> getAllExpresses()：
 * 这个方法调用 ExpressService 来获取所有快递信息，并将结果作为 HTTP 响应返回。由于 @RestController 注解的存在，返回的 List<Express> 会自动转换为 JSON。
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/express")
public class ExpressController {
    // 通过 @Autowired 注解，Spring 会自动注入 ExpressService
    @Autowired
    private ExpressService expressService;

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getAllExpresses 方法
    @GetMapping("/")
    public List<Express> getAllExpresses() {
        return expressService.getAllExpresses();
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressById 方法
    @GetMapping("/{id}")
    public Express getExpressById(@PathVariable int id) {
        return expressService.getExpressById(id);
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressById 方法
//    @GetMapping("/")
//    public Express getExpressByIdParam(@RequestParam("id") int id) {
//        return expressService.getExpressById(id);
//    }


    //  通过 @PostMapping 注解，将 HTTP POST 请求映射到 addExpress 方法
    @PostMapping("/")
    public void addExpress(@RequestBody Express express) {
        expressService.addExpress(express);
    }

    // 通过 @PutMapping 注解，将 HTTP PUT 请求映射到 updateExpress 方法
    @PutMapping("/")
    public void updateExpress(@RequestBody Express express) {
        expressService.updateExpress(express);
    }

    // 通过 @DeleteMapping 注解，将 HTTP DELETE 请求映射到 deleteExpress 方法
    @DeleteMapping("/{id}")
    public void deleteExpress(@PathVariable int id) {
        expressService.deleteExpress(id);
    }

    // 通过 @DeleteMapping 注解，将 HTTP DELETE 请求映射到 deleteAllExpresses 方法
    @DeleteMapping("/")
    public void deleteAllExpresses() {
        expressService.deleteAllExpresses();
    }

    // 通过 @DeleteMapping 注解，将 HTTP DELETE 请求映射到 deleteExpresses 方法
    @DeleteMapping("/batch")
    public void deleteExpresses(@RequestBody List<Integer> ids) {
        expressService.deleteExpresses(ids);
    }

    // 通过 @PutMapping 注解，将 HTTP PUT 请求映射到 updateExpresses 方法
    @PutMapping("/batch")
    public void updateExpresses(@RequestBody List<Express> expresses) {
        expressService.updateExpresses(expresses);
    }

    // 通过 @PostMapping 注解，将 HTTP POST 请求映射到 addExpresses 方法
    @PostMapping("/batch")
    public void addExpresses(@RequestBody List<Express> expresses) {
        expressService.addExpresses(expresses);
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressesByUserId 方法
    @GetMapping("/user/{userId}")
    public List<Express> getExpressesByUserId(@PathVariable int userId) {
        return expressService.getExpressesByUserId(userId);
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressesByLockerId 方法
    @GetMapping("/locker/{lockerId}")
    public List<Express> getExpressesByLockerId(@PathVariable int lockerId) {
        return expressService.getExpressesByLockerId(lockerId);
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressesByStatus 方法
    @GetMapping("/status/{status}")
    public List<Express> getExpressesByStatus(@PathVariable String status) {
        return expressService.getExpressesByStatus(status);
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressesByUserIdAndStatus 方法
    @GetMapping("/user/{userId}/status/{status}")
    public List<Express> getExpressesByUserIdAndStatus(@PathVariable int userId, @PathVariable String status) {
        return expressService.getExpressesByUserIdAndStatus(userId, status);
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressesByLockerIdAndStatus 方法
    @GetMapping("/locker/{lockerId}/status/{status}")
    public List<Express> getExpressesByLockerIdAndStatus(@PathVariable int lockerId, @PathVariable String status) {
        return expressService.getExpressesByLockerIdAndStatus(lockerId, status);
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressesByUserIdAndLockerId 方法
    @GetMapping("/user/{userId}/locker/{lockerId}")
    public List<Express> getExpressesByUserIdAndLockerId(@PathVariable int userId, @PathVariable int lockerId) {
        return expressService.getExpressesByUserIdAndLockerId(userId, lockerId);
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressesByUserIdAndLockerIdAndStatus 方法
    @GetMapping("/user/{userId}/locker/{lockerId}/status/{status}")
    public List<Express> getExpressesByUserIdAndLockerIdAndStatus(@PathVariable int userId, @PathVariable int lockerId, @PathVariable String status) {
        return expressService.getExpressesByUserIdAndLockerIdAndStatus(userId, lockerId, status);
    }

    // 通过 @GetMapping 注解，将 HTTP GET 请求映射到 getExpressesByUserIdAndLockerIdAndStatusAndTime 方法
    @GetMapping("/user/{userId}/locker/{lockerId}/status/{status}/time")
    public List<Express> getExpressesByUserIdAndLockerIdAndStatusAndTime(@PathVariable int userId, @PathVariable int lockerId, @PathVariable String status, @RequestParam String startTime, @RequestParam String endTime) {
        return expressService.getExpressesByUserIdAndLockerIdAndStatusAndTime(userId, lockerId, status, startTime, endTime);
    }

}
