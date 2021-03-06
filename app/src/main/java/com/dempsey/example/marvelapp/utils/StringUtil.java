package com.dempsey.example.marvelapp.utils;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringUtil {

  static boolean isEmpty(String string) {
    return string == null || string.length() == 0;
  }

  static String trimSpaces(String str) {
    if (!TextUtils.isEmpty(str)) {
      return str.replaceAll("\\s+", " ").trim();
    }
    return "";
  }

  static String getWordsFromString(final String arg) {
    Pattern pattern = Pattern.compile("([\\S]+\\s*){1,4}");
    Matcher matcher = pattern.matcher(arg);
    matcher.find();
    return matcher.group();
  }

  public static String removeUnwantedString(final String string, final String stringToRemove) {
    return trimSpaces(string.replaceFirst(stringToRemove,""));
  }

}
