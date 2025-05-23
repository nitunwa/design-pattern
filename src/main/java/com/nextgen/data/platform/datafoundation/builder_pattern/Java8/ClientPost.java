<<<<<<< HEAD:src/main/java/com/nextgen/data/platform/datafoundation/builder_pattern/Java8/ClientPost.java
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
=======
package com.nextgen.data.platform.datafoundation.builder_pattern.Java8;public class ClientPost {
}
>>>>>>> db121daf4e54fd2d78f0f4ec7cc85bda7ca86ddf:design-pattern/src/main/java/com/nextgen/data/platform/datafoundation/builder_pattern/Java8/ClientPost.java
