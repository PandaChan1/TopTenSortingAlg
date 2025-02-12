package day1_31;

import java.util.Scanner;

/**
 *@ClassName: Matcher
 *@Description 坐标移动
 *@Author PandaChan1
 *@Date 2021/1/31
 *@Time 17:15
 */

/**
 * 链接：https://www.nowcoder.com/questionTerminal/119bcca3befb405fbe58abe9c532eb29?toCommentId=87371
 * 来源：牛客网
 *
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 *
 * 输入：
 *
 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 *
 * 坐标之间以;分隔。
 *
 * 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 *
 * 下面是一个简单的例子 如：
 *
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 *
 * 处理过程：
 *
 * 起点（0,0）
 *
 * +   A10   =  （-10,0）
 *
 * +   S20   =  (-10,-20)
 *
 * +   W10  =  (-10,-10)
 *
 * +   D30  =  (20,-10)
 *
 * +   x    =  无效
 *
 * +   A1A   =  无效
 *
 * +   B10A11   =  无效
 *
 * +  一个空 不影响
 *
 * +   A10  =  (10,-10)
 * 结果 （10， -10）
 */


//正则匹配，过滤string

public class Matcher {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] A=str.split(";");
            int x=0,y=0;
            for(String string:A){
                if(string.charAt(0)=='D' && string.substring(1).matches("[0-9]+"))
                    x+=Integer.parseInt(string.substring(1));

                if(string.charAt(0)=='W' && string.substring(1).matches("[0-9]+"))
                    y+=Integer.parseInt(string.substring(1));

                if(string.charAt(0)=='S' && string.substring(1).matches("[0-9]+"))
                    y-=Integer.parseInt(string.substring(1));

                if(string.charAt(0)=='A' && string.substring(1).matches("[0-9]+"))
                    x-=Integer.parseInt(string.substring(1));

            }
            System.out.println(x+","+y);
        }

        sc.close();
    }
}
