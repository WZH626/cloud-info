package com.wzh.service;

import com.wzh.model.InfoModel;
import com.wzh.model.TreeModel;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient("info-provider")
public interface InfoService {
    @RequestMapping("/hello")
    String hello();
    @RequestMapping("/queryTreeList")
    @ResponseBody
    List<TreeModel> getAllTree();

    @RequestMapping("/queryInfoList")
    @ResponseBody
    List<InfoModel> queryInfoList();
    @RequestMapping("/deleteA")
    @ResponseBody
    void deleteA(@RequestParam("tid") Integer tid);
}
