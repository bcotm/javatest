package com.test;

public class CharTest {
        private static final char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        private static String bytes2HexString(byte[] bytes) {
                if (bytes == null) return null;
                int len = bytes.length;
                if (len <= 0) return null;
                char[] ret = new char[len << 1]; 
                for (int i = 0, j = 0; i < len; i++) {
                        ret[j++] = hexDigits[bytes[i] >>> 4 & 0x0f];
                        ret[j++] = hexDigits[bytes[i] & 0x0f];
                }   
                return new String(ret);
        }   
        public static void main(String[] args) throws Exception {
                // String str = "中";
                // System.out.println("len="+str.length());
                // System.out.println("Bytes len="+str.getBytes().length);
                String str = "哈";
                System.out.println("str="+str);
                System.out.println("str len=" + str.length());
                System.out.println("str getBytes=" + str.getBytes().length+"  HEX="+bytes2HexString(str.getBytes()));
                System.out.println("str getBytes UTF-8=" + str.getBytes("UTF-8").length+"  HEX="+bytes2HexString(str.getBytes("UTF-8")));
                System.out.println("str getBytes UTF-16=" + str.getBytes("UTF-16").length+"  HEX="+bytes2HexString(str.getBytes("UTF-16")));
                System.out.println("str getBytes UTF-16BE=" + str.getBytes("UTF-16BE").length+"  HEX="+bytes2HexString(str.getBytes("UTF-16BE")));
                System.out.println("str getBytes UTF-16LE=" + str.getBytes("UTF-16LE").length+"  HEX="+bytes2HexString(str.getBytes("UTF-16LE")));
                System.out.println("str getBytes Unicode=" + str.getBytes("Unicode").length+"  HEX="+bytes2HexString(str.getBytes("Unicode")));
                char[] c = {'哇'};
                System.out.println(c.length);
                String s = "\u03C0\uD835\uDD6B";
                // Unicode编码， 3个代码单元，2个代码点
                int lenU = s.length();
                System.out.println(lenU);
                System.out.println(s.codePointCount(0, lenU));
        }
        // private static final char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        // public static String bytes2HexString(byte[] bytes){
        //         if(bytes == null) return null;
        //         int len = bytes.length;
        //         if(len <= 0) return null;
        //         StringBuilder sb = new StringBuilder(2*len);
        //         for(int i = 0; i<len; i++){
        //                 char high4bit = hexDigits[bytes[i]>>4 & 0x0f];
        //                 char low4bit = hexDigits[bytes[i] & 0x0f];
        //                 sb.append(high4bit);
        //                 sb.append(low4bit);
        //         }
        //         return new String(sb);
        // }
}