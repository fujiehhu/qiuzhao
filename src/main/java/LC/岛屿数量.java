package LC;

import utils.utils;

import java.util.*;

/**
 * Created by fujie on 20/7/29.
 */
public class 岛屿数量 {
    //给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
    //岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
    //此外，你可以假设该网格的四条边均被水包围。
    //输入:
    //        [
    //        ['1','1','0','0','0'],
    //        ['1','1','0','0','0'],
    //        ['0','0','1','0','0'],
    //        ['0','0','0','1','1']
    //        ]
    //输出: 3
    //解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。

    public static void main(String[] args) {
        char grid[][] = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};

        utils.printarr(grid);
        numIslands(grid);
    }

    public static int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        System.out.println(row + " - " + col);
        Queue<List<Object>> queue = new LinkedList<>();//queue==0时 岛屿数+1   值，x ，y
        List<String> isused = new ArrayList<>();
        int lands = 0;
        //队头入队 不为0入队
        List<Object> head = new ArrayList<>();
        head.add(grid[0][0]);
        head.add(0);
        head.add(0);
        queue.add(head);
        isused.add("00");//x y
        int x, y;
        while (isused.size() < row * col) {
            int size = queue.size();
            //遍历该层元素
            for (int i = 0; i < size; i++) {
                List<Object> tmp = queue.poll();//当前元素出队
                char zhi = (Character) tmp.get(0);
                int xx = (Integer) tmp.get(1);
                int yy = (Integer) tmp.get(2);
                //右边未访问过
                if (!isused.contains(xx + 1 + "" + yy) && xx + 1 <= col && grid[yy][xx + 1] == '1') {
                    //未访问过  右边元素存在   右边元素为1
                    List<Object> tmpr = new ArrayList<>();
                    tmpr.add(grid[yy][xx + 1]);
                    tmpr.add(xx + 1);
                    tmpr.add(yy);
                    queue.add(tmpr);
                    isused.add(xx + 1 + "" + yy);
                } else if (!isused.contains(xx + 1 + "" + yy) && (xx + 1) <= col) {
                    isused.add(xx + 1 + "" + yy);//0加入
                }
                //下边未访问过
                if (!isused.contains(xx + "" + (yy + 1)) && (yy + 1) <= row && grid[yy + 1][xx] == '1') {
                    //未访问过  右边元素存在   右边元素为1
                    List<Object> tmpb = new ArrayList<>();
                    tmpb.add(grid[yy + 1][xx]);
                    tmpb.add(xx);
                    tmpb.add(yy + 1);
                    queue.add(tmpb);
                    isused.add(xx + "" + (yy + 1));
                } else if (!isused.contains(xx + "" + (yy + 1)) && (yy + 1) <= row) {
                    isused.add(xx + "" + (yy + 1));
                }

                if (i == size - 1) {
                    if (queue.size() == 0) {
                        lands++;
                        //找到下一个1
                        label:
                        for (int j = 0; j < row; j++) {
                            for (int k = 0; k < col; k++) {
                                if (!isused.contains(k + "" + j) && grid[j][k] == '0') {
                                    isused.add(k + "" + j);
                                } else {
                                    findsm(isused, row, col);
                                    List<Object> tmp1 = new ArrayList<>();
                                    tmp1.add(grid[j][k]);
                                    tmp1.add(k);
                                    tmp1.add(j);
                                    queue.add(tmp1);
                                    break label;
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println(lands);
        return 1;
    }

    public static void findsm(List<String> isused, int row, int col) {


        Collections.sort(isused, (String x, String y) -> x.compareTo(y));
        for (int i = 0; i < isused.size(); i++) {
            if (Integer.parseInt(String.valueOf(isused.get(i).charAt(0))) <= col) {

            }
        }
    }
}
