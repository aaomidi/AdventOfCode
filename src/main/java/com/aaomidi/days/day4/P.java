package com.aaomidi.days.day4;

import com.aaomidi.model.Problem;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by amir on 2015-12-04.
 */
public class P extends Problem {
    public static final String secret = "ckczppom";

    public P() {
        super("Day 4: The Ideal Stocking Stuffer");
    }



    public static boolean testmd5(byte[] b) {
        return b[0] == 0 && b[1] == 0 && (b[2] >> 4) == 0;

    }

    public static boolean testmd5_2(byte[] b) {
        return b[0] == 0 && b[1] == 0 && b[2] == 0;
    }

    @Override
    public String solvePart1() {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
        String input = secret;
        byte[] output;
        int answer = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            input = String.format("%s%d", secret, i);

            output = md5.digest(input.getBytes());
            if (testmd5(output)) {
                answer = i;
                break;
            }
        }

        return answer + "";
    }

    @Override
    public String solvePart2() {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
        String input = secret;
        byte[] output;
        int answer = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            input = String.format("%s%d", secret, i);

            output = md5.digest(input.getBytes());
            if (testmd5_2(output)) {
                answer = i;
                break;
            }
        }

        return answer + "";

    }
}
