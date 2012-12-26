package net.zhanqi.test.ip;

import java.io.IOException;

public class QQWryTest {

    // 210.21.51.116
    public static final String dat = "E:/Blog/ip/qqwry.dat";

    public static void main(String[] args) throws IOException {
        IPSeeker ips = new IPSeeker();
        System.out.println(ips.getCountry("218.19.216.194".getBytes()));
    }
}
