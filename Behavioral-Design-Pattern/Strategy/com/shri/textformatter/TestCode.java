package com.shri.textformatter;

import java.util.List;

/**
 * @Author: ZeeroIQ
 * @Date: 5/8/2020 4:14 AM
 */
public class TestCode {

    public static void main(String ...args) {
        System.out.println("\n----------------------------------------------\n" +
                            "|\tUsing Static Strategy" +
                            "\n----------------------------------------------\n");

        TextProcessor<MarkdownListStrategy> markdownTp = new TextProcessor<>(MarkdownListStrategy::new);
        markdownTp.appendList(List.of("Nothing", " is ", " real ", " in ", " to ", "world"));
        System.out.println(markdownTp);

        TextProcessor<HtmlListStrategy> htmlTp = new TextProcessor<>(HtmlListStrategy::new);
        htmlTp.appendList(List.of("Santa ", "Banta", "Fanta"));
        System.out.println(htmlTp);
    }
}
