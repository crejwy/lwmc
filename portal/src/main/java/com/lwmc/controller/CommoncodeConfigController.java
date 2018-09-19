package com.lwmc.controller;

import com.lwmc.entity.DimCommoncode;
import com.lwmc.service.CommoncodeConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/commoncode")
public class CommoncodeConfigController {

	@Autowired
	private CommoncodeConfigService commoncodeConfigService;

	@RequestMapping("listAll")
    public List<DimCommoncode>  getAllcommoncode(){
        return commoncodeConfigService.listAll();
    }

	@RequestMapping("listSelective")
    public List<DimCommoncode>  getAllcommoncode(DimCommoncode obj){
        return commoncodeConfigService.listBySelective(obj);
    }

	@RequestMapping("get")
    public DimCommoncode getcommoncodeByPK(java.lang.Short itemno){
        return commoncodeConfigService.selectByPrimaryKey(itemno);
    }

	@RequestMapping("save")
    public DimCommoncode savecommoncode(DimCommoncode obj){
		commoncodeConfigService.insert(obj);
        return  obj;
    }
	@RequestMapping("delete")
    public int deletecommoncode(java.lang.Short itemno){
        return  commoncodeConfigService.deleteByPrimaryKey(itemno);
    }
	@RequestMapping("updateUser")
    public  DimCommoncode updatecommoncode(DimCommoncode obj){
		commoncodeConfigService.updateByPrimaryKey(obj);
        return  obj;
    }
}
