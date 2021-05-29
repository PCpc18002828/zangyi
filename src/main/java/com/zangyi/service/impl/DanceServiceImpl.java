package com.zangyi.service.impl;

import com.zangyi.common.Dance;
import com.zangyi.common.DanceExample;
import com.zangyi.mapper.DanceMapper;
import com.zangyi.service.DanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DanceServiceImpl implements DanceService {
    @Autowired
    DanceMapper danceMapper;

    @Override
    public Map<String, Object> getDancelist() {
        Map<String,Object> map =new HashMap<String, Object>();
        String [] nameClass = {"芒康锅庄","那曲锅庄","卫藏锅庄"};
        for (int i = 0; i <nameClass.length ; i++) {
            DanceExample danceExample = new DanceExample();
            danceExample.createCriteria().andPlaceidEqualTo(nameClass[i]);
            List<Dance> dances = danceMapper.selectByExample(danceExample);
            map.put(nameClass[i],dances);
        }
        System.out.println(map);
        return map;
    }
}
