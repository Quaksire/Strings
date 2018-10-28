package com.quaksire.strings;

import org.jetbrains.annotations.Nullable;

public class Strings {
    /**
     * Empty string
     */
    public static final String EMPTY = "";

    /**
     * Returns the given string if it is non-null; the empty string otherwise.
     *
     * @param string the string to test and possibly return
     * @return {@code string} itself if it is non-null; {@code ""} if it is null
     */
    private static String nullToEmpty(@Nullable CharSequence string) {
        return string == null ? EMPTY : string.toString();
    }

    /**
     * Returns {@code true} if the given string is null or is the empty string.
     *
     * @param string a string reference to check
     * @return {@code true} if the string is null or is the empty string
     */
    public static boolean isNullOrEmpty(@Nullable CharSequence string) {
        return string == null || string.length() == 0;
    }

    /**
     * @return true if the string only contains white space or if {@link #isNullOrEmpty(CharSequence)}
     * would return true; false otherwise.
     */
    public static boolean isBlank(@Nullable CharSequence string) {
        return isNullOrEmpty(nullToEmpty(string).trim());
    }
}
