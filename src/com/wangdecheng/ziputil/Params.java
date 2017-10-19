package com.wangdecheng.ziputil;

/**
 * Created by wangdecheng on 10/19/17.
 */
public class Params {
    boolean containsUpper = false;//包含大写
    boolean containsLower = false;//包含小写
    boolean containsNum = true;//包含数字
    int minLength = 2;//最小长度
    int maxLength = 3;//最大长度

    String file ="/Users/wangdecheng/work/projects/ziputil/test/test.zip";//文件

    public boolean isContainsUpper() {
        return containsUpper;
    }

    public void setContainsUpper(boolean containsUpper) {
        this.containsUpper = containsUpper;
    }

    public boolean isContainsLower() {
        return containsLower;
    }

    public void setContainsLower(boolean containsLower) {
        this.containsLower = containsLower;
    }

    public boolean isContainsNum() {
        return containsNum;
    }

    public void setContainsNum(boolean containsNum) {
        this.containsNum = containsNum;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}
