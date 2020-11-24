package time;

import java.util.Random;

/**
 * @description: 时间就是金钱
 * @author: Joyce Liu
 * @create: 2020-11-20 18:20
 */
public class TimeIsMoney {

    /**
     * 每一段职业生涯里
     * 总会有些命中注定
     */
    public static void main(String[] args) {
        System.out.print("打工人");
        // 各人职业寿命不同，进度条需要随机
        int totalYears = new Random().nextInt(Worker.maxYears-Worker.minYears)+Worker.minYears;
        System.out.println(String.format("能干%s年",totalYears));
        // 打工人抱着有限的进度条开始了福报之旅
        new Worker().work(totalYears);
    }
}
