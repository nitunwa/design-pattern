package com.nextgen.data.platform.datafoundation.abstract_factory;

public class AppleFactoryImpl implements ElectronicFactory{
    @Override
    public PhoneType createPhone() {
        return new IPhone14();
    }

    @Override
    public Laptop createLaptop() {
        return new MacPro();
    }
}
