package com.wzh.serviceImpl;

import com.wzh.InfoMapper;
import com.wzh.model.InfoModel;
import com.wzh.model.TreeModel;
import com.wzh.service.InfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class InfoServiceImpl implements InfoService {
    @Resource
    private InfoMapper InfoMapper;
    @Override
    public String hello() {
        return "调用成功";
    }

    @Override
    @RequestMapping("/queryTreeList")
    @ResponseBody
    public List<TreeModel> getAllTree() {
        List<TreeModel> list= InfoMapper.getAllTree();
        return list;
    }

    @Override
    @RequestMapping("/queryInfoList")
    @ResponseBody
    public List<InfoModel> queryInfoList() {
        return InfoMapper.queryInfoList();
    }

    @Override
    @RequestMapping("/deleteA")
    @ResponseBody
    public void deleteA(Integer tid) {

        InfoMapper.deleteA(tid);
    }
}
