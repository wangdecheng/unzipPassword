package com.wangdecheng.ziputil;

import net.lingala.zip4j.exception.ZipException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Character> characterList = new ArrayList<>();
    static Params params = new Params();

    public static void main(String[] args) {

       new Main().test();

    }

    public void test() {
        for (int i = params.getMinLength(); i <= params.getMaxLength(); i++) {
            try {
                if (createPassWord( new char[i], 0, i))
                    break;
            } catch (ZipException e) {
                e.printStackTrace();
            }
        }
    }

    // 这是一个全排列算法, 对特定长度的密码排列组合，把结果存入list
    // n:字符下标 ， len：字符数组长度,也就是密码长度
    private boolean createPassWord(char[] str, int n, int len) throws ZipException {
        if (n == len) {
            String ps = new String(str);
            if(CompressUtil.unzip(params.file,ps)){
               System.out.println("===============password:"+ps);
            }
            //System.out.println(ps);
            return false;
        }
        if(params.isContainsNum()){
            for (int i = 0; i <= 9; i++) {
                str[n] = (char) (i + '0');
                if (createPassWord( str, n + 1, len))
                    return true;
            }
        }
        if(params.isContainsUpper()) {
            for (char i = 'A'; i <= 'Z'; i++) {
                str[n] = i;
                if (createPassWord(str, n + 1, len))
                    return true;
            }
        }
        if(params.isContainsLower()){
            for (char i = 'a'; i <= 'z'; i++) {
                str[n] = i;
                if (createPassWord(str, n + 1, len))
                    return true;
            }
        }
        return false;
    }
}
