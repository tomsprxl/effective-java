package com.liangxu.effectivejava.chapter02.paragraph01.demo01;

import java.io.*;

import static org.springframework.util.StreamUtils.BUFFER_SIZE;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-26 14:27
 */
public class Demo01 {

    public static void main(String[] args) throws IOException {
        firstLineOfFile("F:\\code\\private\\effective-java\\src\\main\\resources\\application.properties");
    }

    // try-finally - No longer the best way to close resources!
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    // try-finally is ugly when used with more than one resource!
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }





}