package com.lwmc.service;

import com.core.base.AbstractService;
import com.lwmc.entity.DimSysuser;
import com.lwmc.mapper.DimSysuserMapper;
import com.lwmc.service.serviceImpl.SysuserConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysuserConfigService extends AbstractService<DimSysuser,java.lang.String> implements SysuserConfigServiceImpl {

	@Autowired
	private DimSysuserMapper sysuserConfigMapper;

    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(sysuserConfigMapper);
    }

}
