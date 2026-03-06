package com.buse.smarterrortracker.controller;
import com.buse.smarterrortracker.model.ErrorLog;
import com.buse.smarterrortracker.repository.ErrorLogRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

import javax.print.attribute.standard.Severity;

@RestController
@RequestMapping("/errors")
public class ErrorLogController {
    private final ErrorLogRepository errorLogRepository;
    private final View error;

    public ErrorLogController(ErrorLogRepository errorLogRepository, View error) {
        this.errorLogRepository=errorLogRepository;
        this.error = error;
    }
    @PostMapping
    public ErrorLog creqteError(@RequestBody ErrorLog errorLog){
        return errorLogRepository.save(errorLog);
    }
    @GetMapping
    public List<ErrorLog> getAllErrors(){
        return errorLogRepository.findAll();
    }
    @GetMapping("/{id}")
    public ErrorLog getErrorById(@PathVariable Long id){
        return errorLogRepository.findById(id).orElse(null);
    }
    @DeleteMapping("/{id}")
    public void deleteError(@PathVariable Long id){
        errorLogRepository.deleteById(id);
    }
    @GetMapping("/filter")
    public List<ErrorLog> getErrorsBySeverity(@RequestParam String  severity){
        return errorLogRepository.findBySeverity(severity);
    }
}