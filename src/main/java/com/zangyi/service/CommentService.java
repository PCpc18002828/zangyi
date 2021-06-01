package com.zangyi.service;

import com.zangyi.common.Commentinfo;

import java.util.List;

public interface CommentService {

    boolean addComment(String content, String userName, String userAvatar, Integer commentArea);

    List<Commentinfo> dataEcho(Integer commentArea);

    List<Commentinfo> myPush(String userName);
}
