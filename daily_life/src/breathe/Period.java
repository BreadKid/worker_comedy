package breathe;

/**
 * 时间段
 */
public enum Period {
    GO_FOR_WORK(1,"上班"),
    GO_FOR_HOME(2,"下班"),
    WORKING(3,"办公"),
    WITH_CROWD(4,"人群中");


    public int state;
    public String description;

    Period(int state, String description) {
        this.state = state;
        this.description = description;
    }


}
