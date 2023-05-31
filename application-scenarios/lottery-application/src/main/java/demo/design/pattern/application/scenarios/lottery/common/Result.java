package demo.design.pattern.application.scenarios.lottery.common;

import java.io.Serializable;

import lombok.Getter;

/**
 * Result
 * <p>
 * 统一返回对象中 Code码 Info描述
 *
 * @author Wenzhou
 * @since 2023/5/30 16:15
 */
public class Result implements Serializable {
    private static final long serialVersionUID = -1L;
    @Getter
    private String code;
    @Getter
    private String info;

    public static Result buildResult(ResponseCode code) {
        return new Result(code.getCode(), code.getInfo());
    }

    public static Result buildResult(ResponseCode code, String info) {
        return new Result(code.getCode(), info);
    }

    public static Result buildResult(String code, String info) {
        return new Result(code, info);
    }

    public static Result buildResult(ResponseCode code, ResponseCode info) {
        return new Result(code.getCode(), info.getInfo());
    }

    public static Result buildSuccessResult() {
        return new Result(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getInfo());
    }

    public static Result buildErrorResult() {
        return new Result(ResponseCode.UN_ERROR.getCode(), ResponseCode.UN_ERROR.getInfo());
    }

    public static Result buildErrorResult(String info) {
        return new Result(ResponseCode.UN_ERROR.getCode(), info);
    }

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }
}

