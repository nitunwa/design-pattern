package com.nextgen.data.platform.datafoundation.abstract_factory;

public interface ElectronicFactory {
    PhoneType createPhone();
    Laptop createLaptop();
}
