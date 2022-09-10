package com.company.bazlur.java_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleDateFormatExample {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date now = new Date();
        String formattedDateTime = sdf.format(now);
        System.out.println(formattedDateTime);
    }
}
