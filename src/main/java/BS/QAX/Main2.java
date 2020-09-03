package BS.QAX;

/**
 * Created by lenovo on 20/9/2.
 */
public class Main2 {
    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 8, 9, 8, 8, 6, 5};
        house(arr);
    }

    public static int house(int[] person) {
        int flag[] = new int[person.length];
        int n1 = person.length;
        if (n1 == 1) {
            return 1;
        }
        // write code here
        int n2 = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i + 1] > person[i]) {//sheng xu
                int j = i;
                while (person[j] < person[j + 1]) {
                    j++;
                }
                for (; i <= j; i++) {
                    if (person[i] > person[j]) {
                        flag[i] += flag[i - 1] + 1;
                    } else {
                        flag[i] = 0;
                    }
                }
            }
        }
        System.out.println(n1 + n2);
        return n1 + n2;
    }
}
