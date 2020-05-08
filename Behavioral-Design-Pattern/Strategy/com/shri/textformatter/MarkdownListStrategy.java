package com.shri.textformatter;

/**
 * @Author: ZeeroIQ
 * @Date: 5/8/2020 3:54 AM
 */
public class MarkdownListStrategy implements ListStrategy{
    @Override
    public void addListItem(StringBuilder stringBuilder, String item) {
        stringBuilder.append(" * ").append(item)
                .append(System.lineSeparator());
    }
}
