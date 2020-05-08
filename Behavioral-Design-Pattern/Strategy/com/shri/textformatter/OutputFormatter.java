package com.shri.textformatter;

/**
 * @Author: ZeeroIQ
 * @Date: 5/8/2020 3:38 AM
 */
public enum  OutputFormatter {
    MARKDOWN("0"), HTML("1");

    private final String formatter;

    OutputFormatter(String formatter) {
        this.formatter = formatter;
    }

    public String getFormatter() {
        return formatter;
    }
}
