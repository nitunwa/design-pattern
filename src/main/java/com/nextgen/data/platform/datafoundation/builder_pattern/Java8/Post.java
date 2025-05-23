package com.nextgen.data.platform.datafoundation.builder_pattern.Java8;

public class Post {
    private final String title;

    private final String text;

    private final String category;

    private Post(PostBuilder postBuilder) {
        this.title = postBuilder.title;
        this.text = postBuilder.text;
        this.category = postBuilder.category;

    }

    public static class PostBuilder{
        private String title;

        private String text;

        private String category;

        public PostBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public PostBuilder withText(String text) {
            this.text = text;
            return this;
        }

        public PostBuilder withCategory(String category) {
            this.category = category;
            return this;
        }

        public Post build() {
            // if this object is null return with exception

            return  new Post(this);
        }
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
