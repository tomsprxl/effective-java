package com.liangxu.effectivejava.chapter02.paragraph01.demo01;

import java.io.*;

import static org.springframework.util.StreamUtils.BUFFER_SIZE;

/**
 * 描述:
 * 结论很明确：在处理必须关闭的资源时，使用 try-with-resources 语句替代 try-finally 语句。
 * 生成的代码更简洁，更清晰，并且生成的异常更有用。 try-with-resources
 * 语句在编写必须关闭资源的代码时会更容易，也不会出错，而使用 try-finally 语句实际上是不可能的。
 *
 * @author xuliang
 * @create 2019-09-26 14:35
 */
public class Demo02 {

    public static void main(String[] args) {
        firstLineOfFile("");
    }


    // try-with-resources - the the best way to close resources!
    static String firstLineOfFile(String path) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "001");
            return null;
        }
    }

    // try-with-resources on multiple resources - short and sweet
    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }

    // try-with-resources with a catch clause
    static String firstLineOfFile(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }


}