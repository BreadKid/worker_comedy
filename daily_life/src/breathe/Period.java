package breathe;

/**
 * 时间段
 */
public enum Period {
    GO_FOR_WORK(1,"上班"),
    GO_FOR_HOME(2,"下班"),
    WORKING(3,"办公");

    public int state;
    public String description;

    Period(int state, String description) {
        this.state = state;
        this.description = description;
    }
}
