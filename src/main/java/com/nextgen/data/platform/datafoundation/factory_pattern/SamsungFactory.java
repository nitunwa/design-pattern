package com.nextgen.data.platform.datafoundation.factory_pattern;

import com.nextgen.data.platform.datafoundation.GalaxyS22;
import com.nextgen.data.platform.datafoundation.Phone;

public class SamsungFactory {
    static Phone getPhone(String model) {
        if("galaxyS22".equalsIgnoreCase(model)) {
            return new GalaxyS22();
        }

        return null;
    }
}
