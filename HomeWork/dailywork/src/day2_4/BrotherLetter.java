package day2_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *@ClassName: BrotherLetter
 *@Description 牛客  查找兄弟单词 https://www.nowcoder.com/questionTerminal/03ba8aeeef73400ca7a37a5f3370fe68
 *@Author PandaChan1
 *@Date 2021/2/5
 *@Time 18:49
 */

/**
 * 1、哈希解法  效率高
 * 2、全排列 挨个比较
 */

public class BrotherLetter {
    public static boolean checkBorther(String str1, String str2){
        int[] arr = new int[26];
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        for(int i=0; i<ch1.length; i++){
            arr[ch1[i]-'a']++;
            arr[ch2[i]-'a']--;
        }
        for(int i=0; i<26; i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt(); //输入字典中单词的个数
            String[] str = new String[N];
            for(int i=0; i<N; i++){ //输入n个单词作为字典单词
                str[i]=sc.next();
            }
            // 查找兄弟单词
            String findStr = sc.next();//输入一个待查单词
            int ind = sc.nextInt(); //输入待查单词的 指定序号
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i<N; i++){
                if((str[i].length() == findStr.length()) && (!str[i].equals(findStr))){//长度相等 且 字符串不相等
                    if(checkBorther(findStr,str[i])){
                        list.add(str[i]);
                    }
                }
            }
            //输出
            System.out.println(list.size());

            Collections.sort(list);
            if(list.size()>=ind){
                System.out.println(list.get(ind-1));
            }


        }

    }
}
