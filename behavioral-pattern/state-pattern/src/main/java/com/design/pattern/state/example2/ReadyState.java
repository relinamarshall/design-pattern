package com.design.pattern.state.example2;

/**
 * ReadyState
 * <p>
 * They can also trigger state transitions in the context.
 *
 * @author Wenzhou
 * @since 2023/6/1 10:44
 */
public class ReadyState extends State {
    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
