package org.eclipse.sirius.conml.design.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {

  private DateUtils() {}

  private static final DateFormat DATE_FORMAT_YYYYMMDD = new SimpleDateFormat("yyyy-MM-dd");

  public static String tryFormatYYYYMMDD(Date date) {
    try {
      return DATE_FORMAT_YYYYMMDD.format(date);
    } catch (final Exception ex) {
      return null;
    }
  }

  public static Date tryParseYYYYMMDD(String dateStr) {
    if (dateStr != null) {
      try {
        return DATE_FORMAT_YYYYMMDD.parse(dateStr);
      } catch (ParseException ex) {
        return null;
      }
    }
    return null;
  }
}
