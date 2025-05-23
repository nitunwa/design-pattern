package com.nextgen.data.platform.datafoundation.factory_pattern;

import com.nextgen.data.platform.datafoundation.Phone;

public class ClientFactoryPattern {
    public static void main(String[] args) {
        // 1. client say iPhone14 please
        // getPhone("iPhone 14");
       Phone iPhone14 = AppleFactory.getPhone("iPhone14");
        String phone = iPhone14.description();
        System.out.println(phone);

        // 2. client say galaxyS22 please
        Phone samSungPhone = SamsungFactory.getPhone("galaxyS22");
        System.out.println(samSungPhone);
    }
}
