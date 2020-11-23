package breathe;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 毒气
 */
public enum Poison {
    PM25(1,"雾霾"),
    EXHAUST(2,"尾气"),
    CH2O(3,"甲醛");

    public Integer state;
    public String description;

    Poison(Integer state, String description) {
        this.state = state;
        this.description = description;
    }

    public Integer getState() {
        return state;
    }

    public static Poison choose(Integer state) {
        for (Poison p : Poison.values()) {
            if (p.getState() == state) {
                return p;
            }
        }
        return null;
    }

}