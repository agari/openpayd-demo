package com.openpayd.demo.util;

import com.openpayd.demo.config.constants.Constants;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class DateUtils {


    public static Date now() {
        return Calendar.getInstance().getTime();
    }

    public static LocalDate YYYYDASHMMDASHDD(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constants.FORMAT_yyyyDASHMMDASHdd);
        LocalDate date= LocalDate.parse(dateStr, formatter);
        return  date;
    }

    public static Date toUtilDate(LocalDate  localDate) {
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date;
    }







}
