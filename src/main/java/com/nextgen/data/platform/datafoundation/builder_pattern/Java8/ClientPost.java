package com.nextgen.data.platform.datafoundation.builder_pattern.Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ClientPost {
    public static void main(String[] args) {
        // Supplier
        /*Supplier<String> newStrSupplier = () -> new String("Nitun");
        String s = newStrSupplier.get();
        System.out.println(s);*/

        /*============================Without Java 8========================================*/

         Post newPost = new Post.PostBuilder()
                 .withTitle("Mother's Day")
                 .withText("Wishing all a wonderfull Happy Mother's day")
                 .withCategory("Special Day")
                 .build();

        System.out.println(newPost);

        /*=======================================================================*/


    }
}


/*GenericPost::setTitle ⇒ BiConsumer<GenericPost, String>
        BiConsumer<GenericPost, String> setTitleConsumer = GenericPost::setTitle;
        setTitleConsumer.accept(postInstance, "Builder Pattern");
        postInstance.setTitle("Builder Pattern");*/
