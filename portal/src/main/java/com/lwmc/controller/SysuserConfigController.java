package com.lwmc.controller;

import com.lwmc.entity.DimSysuser;
import com.lwmc.service.SysuserConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/sysuser")
public class SysuserConfigController {

	@Autowired
	private SysuserConfigService sysuserConfigService;

	@RequestMapping("listAll")
    public List<DimSysuser>  getAllsysuser(){
        return sysuserConfigService.listAll();
    }

	@RequestMapping("listSelective")
    public List<DimSysuser>  getAllsysuser(DimSysuser obj){
        return sysuserConfigService.listBySelective(obj);
    }

	@RequestMapping("get")
    public DimSysuser getsysuserByPK(java.lang.String username){
        return sysuserConfigService.selectByPrimaryKey(username);
    }

	@RequestMapping("save")
    public DimSysuser savesysuser(DimSysuser obj){
		sysuserConfigService.insert(obj);
        return  obj;
    }
	@RequestMapping("delete")
    public int deletesysuser(java.lang.String username){
        return  sysuserConfigService.deleteByPrimaryKey(username);
    }
	@RequestMapping("updateUser")
    public  DimSysuser updatesysuser(DimSysuser obj){
		sysuserConfigService.updateByPrimaryKey(obj);
        return  obj;
    }
}
