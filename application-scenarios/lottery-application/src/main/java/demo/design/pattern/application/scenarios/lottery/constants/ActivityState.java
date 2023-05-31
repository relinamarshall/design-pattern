package demo.design.pattern.application.scenarios.lottery.constants;

import lombok.Getter;

/**
 * ActivityState
 *
 * @author Wenzhou
 * @since 2023/5/30 16:11
 */
public enum ActivityState {
    /**
     * 1：编辑
     */
    EDIT(1, "编辑"),
    /**
     * 2：提审
     */
    ARRAIGNMENT(2, "提审"),
    /**
     * 3：撤审
     */
    REVOKE(3, "撤审"),
    /**
     * 4：通过
     */
    PASS(4, "通过"),
    /**
     * 5：运行
     */
    DOING(5, "运行"),
    /**
     * 6：拒绝
     */
    REFUSE(6, "拒绝"),
    /**
     * 7：关闭
     */
    CLOSE(7, "关闭"),
    /**
     * 8：开启
     */
    OPEN(8, "开启"),
    ;

    @Getter
    private final Integer code;
    @Getter
    private final String info;

    ActivityState(Integer code, String info) {
        this.code = code;
        this.info = info;
    }
}
