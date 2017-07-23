package me.inventor02.intrachat.messages;

import me.inventor02.intrachat.utils.C;

import java.util.Locale;

public class Message {
    private String prefix;
    private String format;

    public Message(String prefix, String format) {
        this.prefix = prefix;
        this.format = format;
    }

    public final String formatPrefixless(Object... args) {
        return String.format(Locale.US, format, args);
    }

    public final String format(Object... args) {
        return C.WHITE + C.BOLD + prefix + ": " + C.RESET + String.format(Locale.US, format, args);
    }

    @Override
    public String toString() {
        return format;
    }

    public String getFormat() {
        return format;
    }

    public String getPrefix() {
        return prefix;
    }
}
