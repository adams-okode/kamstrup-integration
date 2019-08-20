package com.kaiote.kamstrupint.helpers;

import com.kaiote.kamstrupint.data.PackIDD;
import com.kaiote.kamstrupint.helpers.Separator;
import com.kaiote.kamstrupint.responses.PackIDDRespones;

/**
 * DataClassifier
 */
public class DataClassifier {

    /**
     * 
     * @param packId
     * @return
     * @throws Exception
     */
    public static PackIDD packIDDClassifier(String packId) throws Exception {
        Separator separator = new Separator();

        String decimal = separator.splitSections(packId, 0, 2);
        String units = separator.splitSections(packId, 2, 4);
        String log = separator.splitSections(packId, 4, 5);
        String packageType = separator.splitSections(packId, 5, 8);

        PackIDD packer = new PackIDD(decimal, units, log, packageType);

        return packer;
    }

    public static void packageContentClassifier(String message, PackIDDRespones packIDDRespones) {
        
    }
}