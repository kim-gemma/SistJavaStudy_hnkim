package data.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import data.dao.MycarCommentDao;
import data.dao.MycarCommentDaoInter;
import data.dto.MycarCommentDto;
import data.dto.MycarDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MycarCommentController {

    private final MycarCommentDaoInter commentRepository;

    @PostMapping("/addcomment")
    public void addcomment(@RequestParam("num") Long num,
                           @RequestParam("comment") String comment) {

        MycarDto car = MycarDto.builder().num(num).build();

        MycarCommentDto dto = MycarCommentDto.builder()
                .comment(comment)
                .mycar(car)
                .build();

        commentRepository.save(dto);
    }

    @GetMapping("/commentlist")
    public List<MycarCommentDto> commentlist(@RequestParam("num") Long num){
        return commentRepository.getMycarCommentList(num);
    }
}