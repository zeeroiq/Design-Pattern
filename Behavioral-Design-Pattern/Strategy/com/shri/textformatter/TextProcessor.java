package com.shri.textformatter;

import java.util.List;

/**
 * @Author: ZeeroIQ
 * @Date: 5/8/2020 4:04 AM
 */
public class TextProcessor {

    private StringBuilder sb = new StringBuilder();
    private ListStrategy listStrategy;

    TextProcessor(OutputFormatter formatter) {
        setOutputFormat(formatter);
    }

    public void setOutputFormat(OutputFormatter formatter) {
        switch (formatter) {
            case MARKDOWN:
                this.listStrategy = new MarkdownListStrategy();
                break;
            case HTML:
                this.listStrategy = new HtmlListStrategy();
                break;
        }
    }

    public void appendList(List<String> items) {
        listStrategy.start(sb);
        for(String item: items) {
            listStrategy.addListItem(sb, item);
        }
        listStrategy.end(sb);
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
