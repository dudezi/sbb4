package com.example.sbb4.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionController {

    @GetMapping("/question/list")
    @ResponseBody
    public Question questionList() {
        Question q = new Question();
        return q;
    }

}
