package com.company.bazlur.java_date_time;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MonthEnumExample {
    public static void main(String[] args) {
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println(month);
        }

        List<Month> months2 = Arrays.stream(Month.values()).sequential().collect(Collectors.toList());
        System.out.println(months2);

    }
}
