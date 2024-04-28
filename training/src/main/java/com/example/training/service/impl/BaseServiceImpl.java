package com.example.training.service.impl;

import com.example.training.domain.Base;
import com.example.training.global.GlobalEnum;
import com.example.training.mapper.BaseMapper;
import com.example.training.service.BaseService;
import com.example.training.vo.BaseVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author LuanZheng * @date 2024/2/21 8:36
 */
@Service
public class BaseServiceImpl implements BaseService {
    @Resource
    private BaseMapper baseMapper;

    @Override
    public GlobalEnum.ErrorCode addBase(BaseVo base) {
        GlobalEnum.ErrorCode errorCode = GlobalEnum.ErrorCode.BASE_ADD_FAIL;
        Base b = new Base();
        b.setArea(base.getArea());
        b.setName(base.getName());
        b.setAddress(base.getAddress());
        b.setDescription(base.getDescription());
        int rs = baseMapper.insertSelective(b);
        if (rs == 1) {
            errorCode = GlobalEnum.ErrorCode.OK;
        }
        return errorCode;
    }

    @Override
    public BaseVo queryBaseDetails(int baseId) {
        BaseVo baseVo = null;
        Base base = baseMapper.selectByPrimaryKey(baseId);
        if (null != base) {
            baseVo = new BaseVo();
            baseVo.setId(base.getBaseid());
            baseVo.setAddress(base.getAddress());
            baseVo.setName(base.getName());
            baseVo.setDescription(base.getDescription());
            baseVo.setArea(base.getArea());
        }
        return baseVo;
    }

    @Override
    public GlobalEnum.ErrorCode modifyBase(BaseVo base) {
        GlobalEnum.ErrorCode errorCode = GlobalEnum.ErrorCode.BASE_MODIFY_FAIL;
        Base b = new Base();
        b.setBaseid(base.getId());
        b.setName(base.getName());
        b.setDescription(base.getDescription());
        b.setAddress(base.getAddress());
        b.setArea(base.getArea());
        int rs = baseMapper.updateByPrimaryKey(b);
        if (rs == 1) {
            errorCode = GlobalEnum.ErrorCode.OK;
        }
        return errorCode;
    }

    @Override
    public GlobalEnum.ErrorCode deleteBase(int baseId) {
        GlobalEnum.ErrorCode errorCode = GlobalEnum.ErrorCode.BASE_DELETE_FAIL;
        int rs = baseMapper.deleteByPrimaryKey(baseId);
        if (rs == 1) {
            errorCode = GlobalEnum.ErrorCode.OK;
        }
        return errorCode;
    }
}