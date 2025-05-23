package com.nextgen.data.platform.datafoundation.builder_pattern.Java8;

public class ClientArticle {
    public static void main(String[] args) {
        Article article = GenericBuilder.of(ArticleBuilder::new)
                .with(articleBuilder -> articleBuilder.setTitle("Mother's Day"))
                .with(articleBuilder -> articleBuilder.setText("Happy Mother's Day"))
                .with(articleBuilder -> articleBuilder.setCategory("Special"))
                .build()  // from GenericBuilder
                .createArticle(); // from article builder

        System.out.println(article);
    }
}

// https://dev.to/parthasutradhar/generic-payload-in-java-3peb
