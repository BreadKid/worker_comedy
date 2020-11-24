package thirtyFiveYear;

/**
 * @description: 打工人
 * @author: Joyce Liu
 */
public class Worker {

    // 滚粗年龄
    public static final int goOutAge = 35;
    // 法定退休年龄
    public static final int retirementAge = 60;

    /**
     * 打工人兢兢业业打工
     * @param goOutAge
     * @param retirementAge
     */
    public void hardWork(int goOutAge, int retirementAge) {
        // 年复一年的苟活
        for (int i = 1; i < retirementAge; i++) {
            // 终于被赶走了
            if (i == goOutAge) {
                System.err.println("HR: 请团成一团，优雅的离开");
                return;
            }
            System.out.println(String.format("苟活的第%s年",i));
        }
    }
}
