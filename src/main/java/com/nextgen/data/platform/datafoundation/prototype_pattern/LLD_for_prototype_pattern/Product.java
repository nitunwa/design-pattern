<<<<<<< HEAD:src/main/java/com/nextgen/data/platform/datafoundation/prototype_pattern/LLD_for_prototype_pattern/Product.java
package com.nextgen.data.platform.datafoundation.prototype_pattern.LLD_for_prototype_pattern;

import java.util.UUID;

public class Product implements Cloneable{


    private String type;
    private String color;
    private int sku;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public Product(String type, String color, int sku) {
        this.type = type;
        this.color = color;
        this.sku = sku;
    }

    public Product cloneItem(){
        Product product = null;
        try{
            product = (Product) super.clone();
            // product.setSku((int) (product.getSku()+ Math.random()));
            // product.setColor(product.color);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return product;
    }


=======
package com.nextgen.data.platform.datafoundation.prototype_pattern.LLD_for_prototype_pattern;public class Product {
>>>>>>> db121daf4e54fd2d78f0f4ec7cc85bda7ca86ddf:design-pattern/src/main/java/com/nextgen/data/platform/datafoundation/prototype_pattern/LLD_for_prototype_pattern/Product.java
}
