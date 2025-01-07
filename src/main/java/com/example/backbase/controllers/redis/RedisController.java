package com.example.backbase.controllers.redis;

import com.example.backbase.services.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;
    @PostMapping("/save")
    public String saveData(
            @RequestParam String key,
            @RequestParam String value,
            @RequestParam(required = false, defaultValue = "60") long timeout) {
        redisService.save(key, value, timeout);
        return "Data saved with key: " + key;
    }

    @GetMapping("/get")
    public Object getData(@RequestParam String key) {
        Object value = redisService.get(key);
        return value != null ? value : "Key not found!";
    }

    @DeleteMapping("/delete")
    public String deleteData(@RequestParam String key) {
        boolean deleted = redisService.delete(key);
        return deleted ? "Key deleted: " + key : "Key not found!";
    }
}
