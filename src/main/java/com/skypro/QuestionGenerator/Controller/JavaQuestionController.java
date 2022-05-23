package com.skypro.QuestionGenerator.Controller;

import com.skypro.QuestionGenerator.Model.Question;
import com.skypro.QuestionGenerator.Service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaQuestionController {

    private final QuestionService javaQuestionService;

    public JavaQuestionController(QuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping("/add")
    public void add(@RequestParam String question, @RequestParam String answer) {
        javaQuestionService.add(question, answer);
    }
    @GetMapping("/remove")
    public void remove(@RequestParam String question, @RequestParam String answer) {
        javaQuestionService.remove(question, answer);
    }
    @GetMapping
    public Collection<Question> getAll(){
        return javaQuestionService.getAll();
    }
}
