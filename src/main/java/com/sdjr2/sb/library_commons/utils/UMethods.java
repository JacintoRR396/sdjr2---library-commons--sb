package com.sdjr2.sb.library_commons.utils;

/**
 * {@link UMethods} class.
 * <p>
 * <strong>Utilities</strong> - Represents a class to handle generic utility methods.
 *
 * @author Jacinto R^2
 * @version 1.0
 * @category Utilities
 * @upgrade 24/08/11
 * @since 24/06/16
 */
public class UMethods {

  private UMethods() {
    throw new IllegalStateException("Utility class");
  }

  public static String capitalizeWord(final String sWord) {
    StringBuilder sRes = new StringBuilder();
    sRes.append(Character.toUpperCase(sWord.charAt(0)));
    for (int i = 1; i < sWord.length(); i++) {
      sRes.append(Character.toLowerCase(sWord.charAt(i)));
    }

    return sRes.toString();
  }
}
