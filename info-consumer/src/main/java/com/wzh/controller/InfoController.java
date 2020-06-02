package com.wzh.controller;

import com.wzh.model.InfoModel;
import com.wzh.model.TreeModel;
import com.wzh.service.InfoService;
import com.wzh.util.TreeNoteUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class InfoController {
    @Resource
    private InfoService infoService;
    @RequestMapping("/hello")
    public String hello(){
        return  infoService.hello();
    }

    @RequestMapping("/queryTreeList")
    @ResponseBody
    public  List<TreeModel> getAllTree(){

        List<TreeModel> list = infoService.getAllTree();

        if(list == null ){
            return null;
        }
        list = TreeNoteUtil.getFatherNode(list);

        return list;
    }

    @RequestMapping("/queryList")
    public ModelAndView queryList(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("list");
        return mv;
    }


    @RequestMapping("/queryInfoList")
    @ResponseBody
    public List queryInfoList(){
       List<InfoModel>  list =  infoService.queryInfoList();
        return list;
    }

    @RequestMapping("/deleteA")
    @ResponseBody
    public void deleteA(Integer tid){
        infoService.deleteA(tid);
    }
    @RequestMapping("/addList")
    public ModelAndView addList(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("addList");
        return mv;
    }
    @RequestMapping("/selectById")
    public ModelAndView selectById(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("showList");
        return mv;
    }

    @RequestMapping("/selectInfo")
    public ModelAndView selectInfo(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("show");


        return mv;
    }
}
