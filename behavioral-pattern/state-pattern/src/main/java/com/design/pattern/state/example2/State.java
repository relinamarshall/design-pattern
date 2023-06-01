package com.design.pattern.state.example2;

/**
 * State
 * <p>
 * Common interface for all states.
 *
 * @author Wenzhou
 * @since 2023/6/1 10:42
 */
public abstract class State {
    Player player;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     */
    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
