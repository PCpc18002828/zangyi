package com.zangyi.service.impl;

import com.zangyi.common.ClothesPic;
import com.zangyi.common.ClothesPicExample;
import com.zangyi.mapper.ClothesPicMapper;
import com.zangyi.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClothesServiceImpl implements ClothesService {
    @Autowired
    ClothesPicMapper clothesPicMapper;
    @Override
    public Map<String, Object> picContent() {
        Map<String,Object> map = new HashMap<String,Object>();
        String [] clzzs ={"拉萨藏装","那区藏装","林芝藏装","日喀则藏装"};
        for (int i = 0; i <clzzs.length ; i++) {
            ClothesPicExample clothesPicExample =new ClothesPicExample();
            clothesPicExample.createCriteria().andClothesIdEqualTo(clzzs[i]);
            List<ClothesPic> clothesPics = clothesPicMapper.selectByExample(clothesPicExample);
           map.put(clzzs[i],clothesPics);
        }
        return map;
    }
}
