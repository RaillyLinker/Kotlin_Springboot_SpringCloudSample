package com.raillylinker.module_ms_spring_cloud_test2.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RestController
class TestController {
    @GetMapping("/current-time")
    fun getCurrentTime(): String {
        val currentTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        System.out.println(currentTime)
        return "Current time: $currentTime"
    }
}