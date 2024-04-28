package com.example.training.service;

import com.example.training.vo.BaseVo;
import com.example.training.global.GlobalEnum;

public interface BaseService {
    GlobalEnum.ErrorCode addBase(BaseVo base);

    BaseVo queryBaseDetails(int baseId);

    GlobalEnum.ErrorCode modifyBase(BaseVo base);

    GlobalEnum.ErrorCode deleteBase(int baseId);
}