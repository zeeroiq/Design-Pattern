package com.shri.textformatter;

/**
 * @Author: ZeeroIQ
 * @Date: 5/8/2020 3:59 AM
 */
public class HtmlListStrategy implements ListStrategy{
    @Override
    public void start(StringBuilder stringBuilder) {
        stringBuilder.append("<ul>").append(System.lineSeparator());
    }

    @Override
    public void addListItem(StringBuilder stringBuilder, String item) {
        stringBuilder.append(" <li>")
                        .append(item)
                     .append("</li>").append(System.lineSeparator());
    }

    @Override
    public void end(StringBuilder stringBuilder) {
        stringBuilder.append("</ul>").append(System.lineSeparator());
    }
}
