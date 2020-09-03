package BS.QAX;

/**
 * Created by lenovo on 20/9/2.
 */
public class Main3 {
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        house(arr);
    }

    public static int house(int[] person) {
        boolean flag = false;
        int flagv = 0;
        int index = 2;
        int ans = person[0] <= person[1] ? 1 : 2;
        for (int i = 1; i < person.length; i++) {
            if (person[i] > person[i - 1]) {
                flag = false;
                ans+=index;
                index++;
            } else if (person[i] == person[i - 1]) {
                flag = false;
                ans += 1;
                index = 2;

            } else {
                if (flag) {
                    if (index == flagv) {
                        ans += index + 1;
                        index += 2;
                    } else {
                        ans += index;
                        index++;
                    }
                } else {
                    flag = true;
                    flagv = index - 1;
                    ans += 1;
                    index = 2;
                }
            }
        }
        System.out.println(ans);
        return ans;

    }
}
