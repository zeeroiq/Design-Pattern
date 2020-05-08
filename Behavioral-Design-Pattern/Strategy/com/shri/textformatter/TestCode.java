package com.shri.textformatter;

import java.util.List;

/**
 * @Author: ZeeroIQ
 * @Date: 5/8/2020 4:14 AM
 */
public class TestCode {

    public static void main(String ...args) {
        TextProcessor tp = new TextProcessor(OutputFormatter.MARKDOWN);
        tp.appendList(List.of("Nothing", " is ", " real ", " in ", " to ", "world"));
        System.out.println(tp);

        tp.clear();
        tp.setOutputFormat(OutputFormatter.HTML);
        tp.appendList(List.of("Santa ", "Banta", "Fanta"));
        System.out.println(tp);
    }
}
