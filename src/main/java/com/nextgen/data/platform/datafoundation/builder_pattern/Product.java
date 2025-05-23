<<<<<<< HEAD:src/main/java/com/nextgen/data/platform/datafoundation/builder_pattern/Product.java
package com.nextgen.data.platform.datafoundation.builder_pattern;

public class Product {
    private final String name;
    private final String description;
    private final double price;
    private final String category;
    private final double rating;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.category = builder.category;
        this.rating = builder.rating;
    }


    /*public static ProductBuilder builder() {
        return new ProductBuilder();
    }*/

   public static class ProductBuilder {
       private  String name;
       private String description;
       private  double price = 0.0;
       private  String category;
       private  double rating = 0.0;

       public ProductBuilder withName(String name) {
           this.name = name;
           return this;
       }

       public ProductBuilder withDescription(String description) {
           this.description = description;
           return this;
       }

       public ProductBuilder withPrice(double price) {
           this.price = price;
           return this;
       }

       public ProductBuilder withCategory(String category) {
           this.category = category;
           return this;
       }

       public ProductBuilder withRating(double rating) {
           this.rating = rating;
           return this;
       }

       public Product Build() {
           if(this.name == null && this.description == null && this.price == 0.0  && this.category == null && this.rating == 0.0) {
               throw new IllegalStateException("Some fields are null");
           }

           return new Product(this);
       }


   }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                '}';
    }
=======
package com.nextgen.data.platform.datafoundation.builder_pattern;public class Product {
>>>>>>> db121daf4e54fd2d78f0f4ec7cc85bda7ca86ddf:design-pattern/src/main/java/com/nextgen/data/platform/datafoundation/builder_pattern/Product.java
}
