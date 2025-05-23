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
}
