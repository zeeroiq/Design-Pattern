package com.shri.textformatter;

/**
 * @Author: ZeeroIQ
 * @Date: 5/8/2020 3:52 AM
 */
public interface ListStrategy {
    default void start(StringBuilder stringBuilder) {}
    void addListItem(StringBuilder stringBuilder, String item);
    default void end(StringBuilder stringBuilder) {}
}
