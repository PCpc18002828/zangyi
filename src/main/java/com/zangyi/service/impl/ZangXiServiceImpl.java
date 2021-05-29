package com.zangyi.service.impl;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.ZangXiPic;
import com.zangyi.common.ZangXiVideo;
import com.zangyi.mapper.ZangXiPicMapper;
import com.zangyi.mapper.ZangXiVideoMapper;
import com.zangyi.service.ZangXiService;
import com.zangyi.utils.VideoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZangXiServiceImpl  implements ZangXiService {
    @Autowired
    ZangXiPicMapper zangXiPicMapper;
    @Autowired
    ZangXiVideoMapper zangXiVideoMapper;

    @Override
    public List<ZangXiVideo> videoList() throws ClientException {
        List<ZangXiVideo> zangXiVideos = zangXiVideoMapper.selectByExample(null);
        for (int i = 0; i <zangXiVideos.size() ; i++) {
            zangXiVideos.get(i).setVoideUrl(VideoConfig.getPlayInfo(zangXiVideos.get(i).getVoideUrl()));
        }
        return zangXiVideos;
    }

    @Override
    public List<ZangXiPic> picContent() {
        return zangXiPicMapper.selectByExample(null);
    }
}
