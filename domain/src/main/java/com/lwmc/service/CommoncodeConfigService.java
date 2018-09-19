package com.lwmc.service;

import com.core.base.AbstractService;
import com.lwmc.entity.DimCommoncode;
import com.lwmc.mapper.DimCommoncodeMapper;
import com.lwmc.service.serviceImpl.CommoncodeConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommoncodeConfigService extends AbstractService<DimCommoncode,java.lang.Short> implements CommoncodeConfigServiceImpl {

	@Autowired
	private DimCommoncodeMapper commoncodeConfigMapper;

    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(commoncodeConfigMapper);
    }

}
