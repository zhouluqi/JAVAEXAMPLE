package com.company;

public class 替换空格 {
    public static void main(String[] args) {
           StringBuffer str = new StringBuffer("We Are Happy.");
           System.out.println(replaceSpace(str));
    }
    public static String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for(int i=0;i<length;i++){
        if( String.valueOf(str.charAt(i)).equals(" ")){
              stringBuffer.append("%20");
            }else {
            stringBuffer.append(str.charAt(i));
           }
        }
        return stringBuffer.toString();
    }
}
