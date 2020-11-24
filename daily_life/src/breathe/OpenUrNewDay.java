package breathe;

import java.util.Arrays;

/**
 * @description: 开启新一天
 * @author: Joyce Liu
 */
public class OpenUrNewDay {

    /**
     * 一天
     */
    public static void main(String[] args) {
        System.out.println("打工人");
        Worker worker = new Worker();

        // 打工人一天辗转于各地
        for (Period period: Arrays.asList(Period.values())) {
            Poison poison = worker.environment(period);
            worker.breathe(poison);
        }
        System.err.println("小心你的肺");
    }
}
