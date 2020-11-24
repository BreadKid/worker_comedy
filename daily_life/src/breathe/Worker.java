package breathe;

/**
 * @description: 打工人
 * @author: Joyce Liu
 * @create: 2020-11-20 17:22
 */
public class Worker {

    /**
     * 环境
     * @param period
     * @return 环境产生毒气
     */
    public Poison environment(Period period) {
        System.out.print(period.description);
        // 毒气与环境相匹配
        Poison breathPoison = Poison.choose(period.state);
        return breathPoison;
    }

    /**
     * 呼吸
     * @param poison
     */
    public void breathe(Poison poison) {
        System.out.println(String.format("吸%s",poison.description));
    }
}
