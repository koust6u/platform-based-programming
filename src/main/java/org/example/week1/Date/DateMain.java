package org.example.week1.Date;


import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.String.format;
import static java.util.Locale.KOREA;

public class DateMain {
    public static void main(String[] args) {
        Date currentTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일", KOREA);
        String first = sdf.format(currentTime);
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String second = sdf.format(currentTime);
        sdf = new SimpleDateFormat("오늘은 이 달의 W번째 E요일입니다.");
        String third = sdf.format(currentTime);

        System.out.println(first +" "+second+ " "+ third+" ");
    }
}
