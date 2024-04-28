package com.example.training.vo;

import com.example.training.global.GlobalEnum;

public class BasicMsg {
    private GlobalEnum.OperationResult operationResult = GlobalEnum.OperationResult.UNSUCC;
    private String errorMsg = "";
    private GlobalEnum.ErrorCode errorCode = GlobalEnum.ErrorCode.UNKNOWN;

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errMsg) {
        this.errorMsg = errMsg;
    }

    public GlobalEnum.OperationResult getOperationResult() {
        return this.operationResult;
    }

    public void setOperationResult(GlobalEnum.OperationResult operationResult) {
        this.operationResult = operationResult;
    }

    public GlobalEnum.ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(GlobalEnum.ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}