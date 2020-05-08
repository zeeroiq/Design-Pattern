package com.shri.textformatter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @Author: ZeeroIQ
 * @Date: 5/8/2020 4:04 AM
 */
public class TextProcessor<T extends ListStrategy> {

    private StringBuilder sb = new StringBuilder();
    private T listStrategy;

    TextProcessor(Supplier<? extends T> reference) {
        listStrategy = reference.get();
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
