package net.zhanqi.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {
        File f = new File("src/zhanqi.sql");
        InputStream is = new FileInputStream(f);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        StringBuilder sb  = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        is.close();
        
        String[] parts  = sb.toString().split("\\?p=");
        for (String string : parts) {
            System.out.println(string);
        }
    }
}
