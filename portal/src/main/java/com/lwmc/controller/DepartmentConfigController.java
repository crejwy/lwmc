package com.lwmc.controller;

import com.lwmc.entity.DimDepartment;
import com.lwmc.service.DepartmentConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/department")
public class DepartmentConfigController {

	@Autowired
	private DepartmentConfigService departmentConfigService;

	@RequestMapping("listAll")
    public List<DimDepartment>  getAlldepartment(){
        return departmentConfigService.listAll();
    }

	@RequestMapping("listSelective")
    public List<DimDepartment>  getAlldepartment(DimDepartment obj){
        return departmentConfigService.listBySelective(obj);
    }

	@RequestMapping("get")
    public DimDepartment getdepartmentByPK(java.lang.String deptno){
        return departmentConfigService.selectByPrimaryKey(deptno);
    }

	@RequestMapping("save")
    public DimDepartment savedepartment(DimDepartment obj){
		departmentConfigService.insert(obj);
        return  obj;
    }
	@RequestMapping("delete")
    public int deletedepartment(java.lang.String deptno){
        return  departmentConfigService.deleteByPrimaryKey(deptno);
    }
	@RequestMapping("updateUser")
    public  DimDepartment updatedepartment(DimDepartment obj){
		departmentConfigService.updateByPrimaryKey(obj);
        return  obj;
    }
}
