package com.lwmc.service;

import com.core.base.AbstractService;
import com.lwmc.entity.DimDepartment;
import com.lwmc.mapper.DimDepartmentMapper;
import com.lwmc.service.serviceImpl.DepartmentConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentConfigService extends AbstractService<DimDepartment,java.lang.String> implements DepartmentConfigServiceImpl {

	@Autowired
	private DimDepartmentMapper departmentConfigMapper;

    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(departmentConfigMapper);
    }

}
