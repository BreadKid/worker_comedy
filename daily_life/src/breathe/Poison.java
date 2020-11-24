package breathe;

import java.util.Arrays;

/**
 * 毒气
 */
public enum Poison {
    PM25(1,"雾霾"),
    EXHAUST(2,"尾气"),
    CH2O(3,"甲醛"),
    COVID(4,"COVID-19");

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
        Poison result = Arrays.stream(Poison.values()).filter(p -> p.getState() == state)
                .findFirst().orElse(null);
        return result;
    }

}
