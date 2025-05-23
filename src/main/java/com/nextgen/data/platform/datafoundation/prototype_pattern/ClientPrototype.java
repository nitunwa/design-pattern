package com.nextgen.data.platform.datafoundation.prototype_pattern;

public class ClientPrototype {
    public static void main(String[] args) {
        Profession dummyDoc = new Doctor("Dummy", 1);
        System.out.print("Dummy: ");
        System.out.println(dummyDoc.type);

        Profession cloneDummy = (Profession) dummyDoc.cloneProfession();
        System.out.print("cloneDummy: ");
        System.out.println(cloneDummy.type);

        Profession cloneDummy2 = (Profession) dummyDoc.cloneProfession();
        System.out.print("cloneDummy2: ");
        System.out.println(cloneDummy2.type);
    }
}
