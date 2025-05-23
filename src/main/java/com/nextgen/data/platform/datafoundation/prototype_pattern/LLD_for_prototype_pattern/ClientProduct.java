<<<<<<< HEAD:src/main/java/com/nextgen/data/platform/datafoundation/prototype_pattern/LLD_for_prototype_pattern/ClientProduct.java
package com.nextgen.data.platform.datafoundation.prototype_pattern.LLD_for_prototype_pattern;

public class ClientProduct {
    public static void main(String[] args) {
        int count = 1;
        Product tempProd = new Product("TShirt", "White", 1203);
        Product tempProdClone1 = tempProd.cloneItem();
        tempProdClone1.setSku((int) (tempProdClone1.getSku() + count++));
        tempProdClone1.setColor("Red");
        Product tempProdClone2 = tempProd.cloneItem();
        Product tempProdClone3 = tempProd.cloneItem();

        System.out.println(" tempProdClone1== "+ tempProdClone1.getSku()+ " Color: "+ tempProdClone1.getColor()+ " -- " + tempProdClone2.getSku());

    }
=======
package com.nextgen.data.platform.datafoundation.prototype_pattern.LLD_for_prototype_pattern;public class ClientProduct {
>>>>>>> db121daf4e54fd2d78f0f4ec7cc85bda7ca86ddf:design-pattern/src/main/java/com/nextgen/data/platform/datafoundation/prototype_pattern/LLD_for_prototype_pattern/ClientProduct.java
}
