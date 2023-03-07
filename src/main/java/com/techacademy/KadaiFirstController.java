package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{ymd}")
    public static String getdispDayOfWeek(@PathVariable String ymd) {

        int y = Integer.parseInt(ymd.substring(0, 4));
        int m = Integer.parseInt(ymd.substring(4, 6));
        int d = Integer.parseInt(ymd.substring(6, 8));

//     

        LocalDate a = LocalDate.of(y, m, d);
        DayOfWeek youbi = a.getDayOfWeek();
        String dn = youbi.getDisplayName(TextStyle.FULL, Locale.US);

        return dn;

    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果:" + res;

    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果:" + res;

    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果:" + res;

    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果:" + res;
    }
}