package breathe;

/**
 * @description: 开启新一天
 * @author: Joyce Liu
 * @create: 2020-11-20 18:17
 */
public class OpenUrNewDay {

    public static void main(String[] args) {
        System.out.println("打工人");
        Worker worker = new Worker();
        for (Period period: Period.values()) {
            Poison poison = worker.environment(period);
            worker.breathe(poison);
        }
        System.err.println("小心你的肺");
    }
}
