package com.nextgen.data.platform.datafoundation.factory_pattern;

import com.nextgen.data.platform.datafoundation.IPhone14;
import com.nextgen.data.platform.datafoundation.Phone;

public class AppleFactory {
    static Phone getPhone(String phoneModel) {
        // "iPhone14"
        if("iPhone14".equalsIgnoreCase(phoneModel)) {
            return new IPhone14();
        }

        return null;
    }
}
