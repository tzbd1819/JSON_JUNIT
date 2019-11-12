package com.qf.fastjson;

import com.alibaba.fastjson.JSON;
import entity.Score;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FastJsonTest {
    @Test
    public void Test(){
        Score score = new Score(12,34);
        String str = JSON.toJSONString(score);
        //System.out.println(str);

        List<Score> list = new ArrayList<>();
        Score score1 = new Score(12,34);
        Score score2 = new Score(56,78);
        list.add(score1);
        list.add(score2);

        System.out.println("list："+list);
        String str_list = JSON.toJSONString(list);
        System.out.println(str_list);
    }
}
