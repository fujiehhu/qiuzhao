package VAR;

import HJ.密码验证合格程序;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fujie on 20/8/25.
 */
//牛客样例验证程序
public class test {
    public static void main(String[] args) {
        String path = "E:\\Project\\qiuzhao\\src\\main\\java\\VAR\\demo.txt";
        readTxt(path);
        for (int i = 0; i < readTxt(path).size(); i++) {
            Object o = readTxt(path).get(i);
            System.out.print(i+1 + ": " + o + " ");
//            密码验证合格程序 a = new 密码验证合格程序();
//            a.pro((String) o);
        }
    }

    public static List<String> readTxt(String txtPath) {
        ArrayList<String> strings = new ArrayList<>();
        try {
            String encoding = "GBK";
            File file = new File(txtPath);
            if (file.isFile() && file.exists()) { //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    strings.add(lineTxt);
                }
                read.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return strings;
    }
}
