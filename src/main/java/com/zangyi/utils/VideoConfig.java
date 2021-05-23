package com.zangyi.utils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoRequest;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;

public class VideoConfig {
    /*初始化方法*/
    public static DefaultAcsClient initVodClient(String accessKeyId, String accessKeySecret) throws ClientException {
        String regionId = "cn-shanghai";  // 点播服务接入区域
        DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        return client;
    }
    /*获取播放地址*/
    public static String getPlayInfo(String videoId) throws ClientException {
        // 初始化 client 对象
        // accessKeyId accessKeySecret 就是创建用户时保存的内容
        DefaultAcsClient client = initVodClient("LTAI4G5izasyCm3foNCtEcAo", "N2p2ufY5VyjBrOddBId0NRG5Te6q9W");

        // 创建请求对象
        GetPlayInfoRequest request = new GetPlayInfoRequest();
        // 获取 [ 非加密视频的ID ]
        request.setVideoId(videoId);

        // 发送请求得到响应
        GetPlayInfoResponse response =  client.getAcsResponse(request);
        return response.getPlayInfoList().get(0).getPlayURL();
    }


}
