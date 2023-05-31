package demo.design.pattern.application.scenarios.lottery.stateflow;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import demo.design.pattern.application.scenarios.lottery.constants.ActivityState;
import demo.design.pattern.application.scenarios.lottery.stateflow.state.ArraignmentState;
import demo.design.pattern.application.scenarios.lottery.stateflow.state.CloseState;
import demo.design.pattern.application.scenarios.lottery.stateflow.state.DoingState;
import demo.design.pattern.application.scenarios.lottery.stateflow.state.EditingState;
import demo.design.pattern.application.scenarios.lottery.stateflow.state.OpenState;
import demo.design.pattern.application.scenarios.lottery.stateflow.state.PassState;
import demo.design.pattern.application.scenarios.lottery.stateflow.state.RefuseState;

/**
 * StateConfig
 *
 * @author Wenzhou
 * @since 2023/5/30 16:33
 */
public class StateConfig {
    @Autowired
    private ArraignmentState arraignmentState;

    @Autowired
    private CloseState closeState;

    @Autowired
    private DoingState doingState;

    @Autowired
    private EditingState editingState;

    @Autowired
    private OpenState openState;

    @Autowired
    private PassState passState;

    @Autowired
    private RefuseState refuseState;

    /**
     * stateGroup
     */
    protected Map<Enum<ActivityState>, AbstractState> stateGroup = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        stateGroup.put(ActivityState.ARRAIGNMENT, arraignmentState);
        stateGroup.put(ActivityState.CLOSE, closeState);
        stateGroup.put(ActivityState.DOING, doingState);
        stateGroup.put(ActivityState.EDIT, editingState);
        stateGroup.put(ActivityState.OPEN, openState);
        stateGroup.put(ActivityState.PASS, passState);
        stateGroup.put(ActivityState.REFUSE, refuseState);
    }
}
