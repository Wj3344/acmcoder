import java.util.Scanner;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/9/7
 * Time: 2:44
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long day = scanner.nextLong();
            long index = getIndex(day);
            System.out.println(day - 2 * index);
        }
    }

    /**
     * 此算法的关键在于找出规律，设定一个涨跌为一个周期（从开始涨到下一次跌为一个周期，即可以把[1,2],[3,4,5],[6,7,8,9]这样作为一个个周期）
     * 新增一个变量index用于标识是第几个周期从0开始，而第n天和价格money和index存在  money = n - 2 * index ，这个关系。
     * 再新增一个变量index+2表示每个周期的长度，则周期长度构成一个等差数列2,3,4,5,6
     * 由此函数可以求得是第几个周期index
     * @param day 第几天
     * @return 是第几个周期
     */
    private static long getIndex(long day) {
        long index = 0;
        long sum = 0;
        for (long i = 0; ; i++) {
            sum += i + 2;
            // 天数day刚好是该周期的最后一天
            if(sum == day){
                index = i;
                break;
            }
            // 天数在一个周期结束之前
            if (sum > day) {
                // 下标减1
                index = i - 1;
                // 总和减去相加的天数
                sum -= (i + 2);
                break;
            }
        }
        // 此时相加得到的天数在实际天数之前，下标加一
        if (sum < day) {
            index++;
        }
        return index;
    }
}
