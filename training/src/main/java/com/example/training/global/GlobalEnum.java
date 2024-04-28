package com.example.training.global; //Global Enum type definition

public class GlobalEnum {
    public enum OperationResult {
        SUCC, UNSUCC
    }

    public enum ErrorCode {
        OK, UNKNOWN,
        BASE_ADD_FAIL, BASE_MODIFY_FAIL, BASE_DELETE_FAIL,
        CLASS_ADD_FAIL, CLASS_MODIFY_FAIL, CLASS_DELETE_FAIL,
    }
}