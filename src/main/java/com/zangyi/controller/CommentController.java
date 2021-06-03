package com.zangyi.controller;

import com.zangyi.common.Commentinfo;
import com.zangyi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping("/addCommment")
    @ResponseBody
    public boolean addComment(String content, String userName, String userAvatar, Integer commentArea, String userId){
        boolean flag = commentService.addComment(content, userName, userAvatar,commentArea, userId);
        return flag;
    }

    @RequestMapping("/dataEcho")
    @ResponseBody
    public List<Commentinfo> dataEcho(Integer commentArea){
        List<Commentinfo> dataList = commentService.dataEcho(commentArea);
        return dataList;
    }

    @RequestMapping("/myPush")
    @ResponseBody
    public List<Commentinfo> myPush(String userId, Integer commentArea){
        List<Commentinfo> myPush = commentService.myPush(userId, commentArea);
        return myPush;
    }

    @RequestMapping("commentCount")
    @ResponseBody
    public Integer commentCount(String userId){
        Integer commentCount = commentService.commentCount(userId);
        System.out.println(commentCount);
        return commentCount;
    }
}
