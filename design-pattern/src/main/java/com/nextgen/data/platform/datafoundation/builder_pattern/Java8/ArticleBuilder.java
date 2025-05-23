package com.nextgen.data.platform.datafoundation.builder_pattern.Java8;

public class ArticleBuilder {
    private String title;

    private String text;

    private String category;

    public ArticleBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ArticleBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public ArticleBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public Article createArticle() {
        // if this object is null return with exception
        return new Article(title,text,category);
    }

}
