package demo.design.pattern.application.scenarios.lottery.repository;

import org.springframework.stereotype.Repository;

import demo.design.pattern.application.scenarios.lottery.constants.ActivityState;

/**
 * IActivityRepository
 * <p>
 * 活动仓库服务(活动表、奖品表、策略表、策略明细表)
 *
 * @author Wenzhou
 * @since 2023/5/30 16:25
 */
@Repository
public interface IActivityRepository {
    /**
     * 变更活动状态
     *
     * @param activityId  活动ID
     * @param beforeState 修改前状态
     * @param afterState  修改后状态
     * @return 更新结果
     */
    boolean alterStatus(Long activityId, Enum<ActivityState> beforeState, Enum<ActivityState> afterState);
}
