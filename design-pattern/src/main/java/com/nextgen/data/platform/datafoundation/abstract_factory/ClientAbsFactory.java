package com.nextgen.data.platform.datafoundation.abstract_factory;

public class ClientAbsFactory {
    public static void main(String[] args) {
             ElectronicFactory appleProduct = new AppleFactoryImpl();
        PhoneType iPhoneDemo = appleProduct.createPhone();
        String phoneDes = iPhoneDemo.descriptionPhone();
        System.out.println(phoneDes);
    }
}
