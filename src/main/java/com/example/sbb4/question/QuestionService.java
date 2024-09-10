package com.example.sbb4.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//서비스 사용 이유 : 엔티티와 직접 연결 시, 엔티티에 담겨있을수도 있는
//유저의 민감한 데이터를 건드릴 수도 있기 때문에!(가장 중요해보임.)
@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }
}
