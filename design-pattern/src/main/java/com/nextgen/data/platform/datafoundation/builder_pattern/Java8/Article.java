package com.nextgen.data.platform.datafoundation.builder_pattern.Java8;

public class Article {

    private String title;

    private String text;

    private String category;

    public Article(String title, String text, String category) {
        this.title = title;
        this.text = text;
        this.category = category;
    }

    // getters
    public String getTitle() {
        return title;
    }


    public String getText() {
        return text;
    }


    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "GenericPost{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
