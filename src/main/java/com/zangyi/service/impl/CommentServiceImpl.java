package com.zangyi.service.impl;

import com.zangyi.common.Commentinfo;
import com.zangyi.common.CommentinfoExample;
import com.zangyi.mapper.CommentinfoMapper;
import com.zangyi.mapper.CommentreplyinfoMapper;
import com.zangyi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 11379
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentinfoMapper commentinfoMapper;

    @Autowired
    CommentreplyinfoMapper commentreplyinfoMapper;


    @Override
    public boolean addComment(String content, String userName, String userAvatar, Integer commentArea, String userId) {
        Commentinfo commentinfo = new Commentinfo();
        Date createTime = new Date();
        //填充comment对象的其他参数，进行插入
        commentinfo.setCommentArea(commentArea);
        commentinfo.setContent(content);
        commentinfo.setUserName(userName);
        commentinfo.setUserAvatar(userAvatar);
        commentinfo.setUserId(userId);
        //状态：0待审核，1通过，2不通过
        commentinfo.setCommentState(1);
        //点赞数：初始默认为0
        commentinfo.setPraseCount(0);
        commentinfo.setCreatetime(createTime);
        commentinfo.setUpdatetime(createTime);
        commentinfoMapper.insert(commentinfo);
        return true;
    }

    @Override
    public List<Commentinfo> dataEcho(Integer commentArea) {
        CommentinfoExample commentinfoExample = new CommentinfoExample();
        commentinfoExample.setOrderByClause("comment_id DESC");
        commentinfoExample.createCriteria().andCommentAreaEqualTo(commentArea);
        List<Commentinfo> dataEcho = commentinfoMapper.selectByExampleWithBLOBs(commentinfoExample);
        return dataEcho;
    }

    @Override
    public List<Commentinfo> myPush(String userId, Integer commentArea) {
        CommentinfoExample commentinfoExample = new CommentinfoExample();
        commentinfoExample.createCriteria().andUserIdEqualTo(userId).andCommentAreaEqualTo(commentArea);
        List<Commentinfo> myPush = commentinfoMapper.selectByExampleWithBLOBs(commentinfoExample);
        return myPush;
    }

    @Override
    public Integer commentCount(String userId) {
        CommentinfoExample commentinfoExample = new CommentinfoExample();
        commentinfoExample.createCriteria().andUserIdEqualTo(userId);
        Integer commentCount = commentinfoMapper.selectByExampleWithBLOBs(commentinfoExample).size();
        return commentCount;
    }
}
