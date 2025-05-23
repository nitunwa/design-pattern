<<<<<<< HEAD:src/main/java/com/nextgen/data/platform/datafoundation/prototype_pattern/Profession.java
package com.nextgen.data.platform.datafoundation.prototype_pattern;

public  class Profession implements Cloneable {

    String type;
    int id;

    public Profession(String type, int id) {
        this.type = type;
        this.id = id;
    }

    public Object cloneProfession() {
        Object object = null;
        try {
            object = super.clone();
        } catch(CloneNotSupportedException e) {
              e.printStackTrace();
        }

        return object;
    }
=======
package com.nextgen.data.platform.datafoundation.prototype_pattern;public class Profession {
>>>>>>> db121daf4e54fd2d78f0f4ec7cc85bda7ca86ddf:design-pattern/src/main/java/com/nextgen/data/platform/datafoundation/prototype_pattern/Profession.java
}
