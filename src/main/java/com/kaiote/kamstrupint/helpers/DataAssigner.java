package com.kaiote.kamstrupint.helpers;

import java.lang.Integer;

import com.kaiote.kamstrupint.data.PackIDD;
import com.kaiote.kamstrupint.responses.PackIDDRespones;

/**
 * DataAssigner
 */
public class DataAssigner {

    /***
     * 
     * @param packIDD
     * @return
     */
    public static PackIDDRespones packIDDResponseAssigner(PackIDD packIDD) {
        /**
         * Package Type response instantiation
         */
        PackIDDRespones response = new PackIDDRespones();

        // Calculation on package type
        int packTypeDefiner = Integer.parseInt(packIDD.getPackageType(), 2);

        // set package Type ranges from 1 - 7
        response.setPackageType(packTypeDefiner);

        /**
         * Set Log Frequency
         */
        if (Integer.parseInt(packIDD.getLog(), 2) == 0) {
            response.setLoggingFrequency("Daily");
        } else if (Integer.parseInt(packIDD.getLog(), 2) == 1) {
            response.setLoggingFrequency("Hourly");
        }

        /**
         * Set Unit Structure
         */
        if (Integer.parseInt(packIDD.getUnits(), 2) == 0) {
            response.unitStructure("m3 & L/hr");
        } else if (Integer.parseInt(packIDD.getUnits(), 2) == 1) {
            response.unitStructure("ft3 & GPM");
        } else if (Integer.parseInt(packIDD.getUnits(), 2) == 2) {
            response.unitStructure("Gal & GPM");
        }

        response.resultDecimalPlaces(Integer.parseInt(packIDD.getDecimals(), 2));
        return response;
    }
}