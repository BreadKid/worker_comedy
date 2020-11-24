package time;

import java.util.Random;

/**
 * @description: 打工人
 * @author: Joyce Liu
 * @create: 2020-11-20 19:01
 */
public class Worker {
    // 毕业前三年是活力四射的年纪，设22岁
    public static int minYears = 3;
    // 截止至2020年，法定退休年龄为60岁，设工作38年
    public static int maxYears = 38;

    /**
     * 打工人打工
     * @param totalYears 各人工作总年数
     */
    public void work(Integer totalYears) {
        // ICU的年份其实早已注定
        int icuYear = new Random().nextInt(totalYears-Worker.minYears)+Worker.minYears;
        // 打工人在操劳中度日
        for (int i = 1; i < totalYears; i++) {
            // 一不小心，就到了ICU的年纪
            if (icuYear==i) {
                intoICU(i);
            }
            // 又是没病没灾的一年，感谢公司福报
            System.out.println(String.format("%s: 今年996",i));
        }
    }

    /**
     * 打工劳累触发的ICU异常
     * @param icuYear 第几年住进ICU
     */
    private void intoICU(int icuYear) {
        throw new RuntimeException(String.format("第%s年进了ICU",icuYear));
    }
}
