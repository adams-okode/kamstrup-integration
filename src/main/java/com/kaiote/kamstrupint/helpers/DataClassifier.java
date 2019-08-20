package com.kaiote.kamstrupint.helpers;

import javax.xml.bind.DatatypeConverter;
import com.kaiote.kamstrupint.data.PackIDD;
import com.kaiote.kamstrupint.data.PackageContent;
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

    public static PackageContent packageContentClassifier(String message, PackIDDRespones packIDDRespones)
            throws Exception {
        Separator separator = new Separator();
        PackageContent packageContent = new PackageContent();
        switch (packIDDRespones.packageType) {
        case 0:
            packageContent.infoCode = separator.splitSections(message, 0, 4);
            packageContent.volume = convertIntToFloatwithDP(separator.splitSections(message, 4, 12),
                    packIDDRespones.resultDecimalPlaces);
            packageContent.minFlow = convertIntToFloatwithDP(separator.splitSections(message, 12, 16),
                    packIDDRespones.resultDecimalPlaces);
            break;
        case 1:
            packageContent.infoCode = separator.splitSections(message, 0, 4);
            packageContent.volume = convertIntToFloatwithDP(separator.splitSections(message, 4, 12),
                    packIDDRespones.resultDecimalPlaces);
            packageContent.maxFlow = convertIntToFloatwithDP(separator.splitSections(message, 12, 16),
                    packIDDRespones.resultDecimalPlaces);
            break;
        case 2:
            packageContent.infoCode = separator.splitSections(message, 0, 4);
            packageContent.volume = convertIntToFloatwithDP(separator.splitSections(message, 4, 12),
                    packIDDRespones.resultDecimalPlaces);
            packageContent.minWaterTemperature = convertIntToFloatwithDP(separator.splitSections(message, 12, 14),
                    packIDDRespones.resultDecimalPlaces);
            packageContent.minAmbientrTemperature = convertIntToFloatwithDP(separator.splitSections(message, 14, 16),
                    packIDDRespones.resultDecimalPlaces);

            break;
        case 3:
            packageContent.infoCode = separator.splitSections(message, 0, 4);
            packageContent.volume = convertIntToFloatwithDP(separator.splitSections(message, 4, 12),
                    packIDDRespones.resultDecimalPlaces);
            packageContent.minWaterTemperature = convertIntToFloatwithDP(separator.splitSections(message, 12, 14),
                    packIDDRespones.resultDecimalPlaces);
            packageContent.maxAmbientTemperature = convertIntToFloatwithDP(separator.splitSections(message, 14, 16),
                    packIDDRespones.resultDecimalPlaces);

            break;
        case 7:
            packageContent.infoCode = separator.splitSections(message, 0, 4);
            packageContent.minFlow = convertIntToFloatwithDP(separator.splitSections(message, 4, 8),
                    packIDDRespones.resultDecimalPlaces);
            packageContent.maxFlow = convertIntToFloatwithDP(separator.splitSections(message, 8, 12),
                    packIDDRespones.resultDecimalPlaces);
            packageContent.minAmbientrTemperature = convertIntToFloatwithDP(separator.splitSections(message, 12, 14),
                    packIDDRespones.resultDecimalPlaces);
            packageContent.minAmbientrTemperature = convertIntToFloatwithDP(separator.splitSections(message, 14, 16),
                    packIDDRespones.resultDecimalPlaces);

            break;

        default:

            break;
        }

        return packageContent;
    }

    public static Double convertIntToFloatwithDP(String message, int dp) {
        String input = "";
        
        Long decimal = Long.parseLong(message, 16);
        Double resp = decimal.doubleValue();
        return resp;
    }
}