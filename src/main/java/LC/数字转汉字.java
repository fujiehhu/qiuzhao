package LC;


/**
 * Created by lenovo on 20/9/14.
 */
public class 数字转汉字 {
    public static void main(String[] args) {
        long a = -2001000340;
        long b = a;
        float c = 2.345f;
        double d = 2.4;

//        String num[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String num[] = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String uint[] = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千"};
        String numa = Float.valueOf(c) + "";
        System.out.println(numa.indexOf("a"));
        String sec = numa.substring(numa.indexOf(".") + 1);
        System.out.println(sec);
        int f = Integer.parseInt(sec);
        String xs = "";
        while (f > 0) {
            xs = num[f % 10] + xs;
            f /= 10;
        }

        System.out.println(xs);
        String flag = "";
        String point = "点";
        if (a < 0) {
            flag = "负";
            a = Math.abs(a);
        }
        String dst = "";
        int cnt = 0;
        while (a > 0) {
            long s = a % 10;
            dst = num[(int) s] + uint[cnt] + dst;
            a /= 10;
            cnt++;
        }
        dst = dst.replaceAll("零[十百千]", "零").replaceAll("零+", "零").
                replaceAll("零$", "").replaceAll("零+亿", "亿").
                replaceAll("零+万", "万");
        System.out.println(flag + dst + point + xs);
        System.out.println(int2chineseNum(b));
    }

    public static String int2chineseNum(long src) {
        final String num[] = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        final String unit[] = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千"};
        String dst = "";
        int count = 0;
        while (src > 0) {
            dst = (num[(int) src % 10] + unit[count]) + dst;
            src = src / 10;
            count++;
        }
        return dst.replaceAll("零[千百十]", "零").replaceAll("零+万", "万")
                .replaceAll("零+亿", "亿").replaceAll("亿万", "亿零")
                .replaceAll("零+", "零").replaceAll("零$", "");
    }
}
