package com.example.training.controller;

import com.example.training.service.BaseService;
import com.example.training.vo.BaseVo;
import com.example.training.vo.BasicMsg;
import com.example.training.vo.BasicMsgWithData;
import com.example.training.global.GlobalEnum;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "Base")
public class BaseController {
    @Resource
    private BaseService baseService;

    @Operation(summary = "Add a new base.")
    @PostMapping("/base")
    public BasicMsg addBase(@RequestBody BaseVo base) {
        BasicMsg msg = new BasicMsg();
        GlobalEnum.ErrorCode errorCode = baseService.addBase(base);
        msg.setErrorCode(errorCode);
        if (errorCode == GlobalEnum.ErrorCode.OK) {
            msg.setErrorMsg("新建基地成功。");
            msg.setOperationResult(GlobalEnum.OperationResult.SUCC);
        } else {
            msg.setErrorMsg("新建基地失败。");
            msg.setOperationResult(GlobalEnum.OperationResult.UNSUCC);
        }
        return msg;
    }

    @Operation(summary = "Query a base.")
    @GetMapping("/base/{id}")
    public BasicMsgWithData<BaseVo> queryBase(@PathVariable int id) {
        BasicMsgWithData<BaseVo> basicMsgWithData = new BasicMsgWithData<>();
        BaseVo baseVo = baseService.queryBaseDetails(id);
        if (null != baseVo) {
            basicMsgWithData.setErrorMsg("查询基地成功。");
            basicMsgWithData.setOperationResult(GlobalEnum.OperationResult.SUCC);
            basicMsgWithData.setData(baseVo);
        } else {
            basicMsgWithData.setErrorMsg("查询基地失败。");
            basicMsgWithData.setOperationResult(GlobalEnum.OperationResult.UNSUCC);
        }
        return basicMsgWithData;
    }

    @Operation(summary = "Modify a base.")
    @PutMapping("/base/{id}")
    public BasicMsg modifyBase(@PathVariable int id, @RequestBody BaseVo base) {
        BasicMsg msg = new BasicMsg();
        GlobalEnum.ErrorCode errorCode = baseService.modifyBase(base);
        msg.setErrorCode(errorCode);
        if (errorCode == GlobalEnum.ErrorCode.OK) {
            msg.setErrorMsg("修改基地成功。");
            msg.setOperationResult(GlobalEnum.OperationResult.SUCC);
        } else {
            msg.setErrorMsg("修改基地失败。");
            msg.setOperationResult(GlobalEnum.OperationResult.UNSUCC);
        }
        return msg;
    }

    @Operation(summary = "Delete a base.")
    @DeleteMapping("/base/{id}")
    public BasicMsg deleteBase(@PathVariable int id) {
        BasicMsg msg = new BasicMsg();
        GlobalEnum.ErrorCode errorCode = baseService.deleteBase(id);
        msg.setErrorCode(errorCode);
        if (errorCode == GlobalEnum.ErrorCode.OK) {
            msg.setErrorMsg("删除基地成功。");
            msg.setOperationResult(GlobalEnum.OperationResult.SUCC);
        } else {
            msg.setErrorMsg("删除基地失败。");
            msg.setOperationResult(GlobalEnum.OperationResult.UNSUCC);
        }
        return msg;
    }
}