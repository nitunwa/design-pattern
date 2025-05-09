package com.nextgen.data.platform.datafoundation.abstract_factory;

public class SamSungFactoryImpl implements ElectronicFactory {
    @Override
    public PhoneType createPhone() {
        return new GalaxyS23();
    }

    @Override
    public Laptop createLaptop() {
        return new GalaxyPro();
    }
}
