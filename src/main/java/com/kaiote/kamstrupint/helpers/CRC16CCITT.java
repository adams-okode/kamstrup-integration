package com.kaiote.kamstrupint.helpers;

import static javax.xml.bind.DatatypeConverter.parseHexBinary;

public class CRC16CCITT {

    public static String calc(String text) {
        int crc = 0x0000; // initial value
        
        int polynomial = 0x1021; // 0001 0000 0010 0001 (0, 5, 12)

        byte[] testBytes = parseHexBinary(text);

        for (byte b : testBytes) {
            for (int i = 0; i < 8; i++) {
                boolean bit = ((b >> (7 - i) & 1) == 1);
                boolean c15 = ((crc >> 15 & 1) == 1);
                crc <<= 1;
                if (c15 ^ bit)
                    crc ^= polynomial;
            }
        }

        crc &= 0xffff;

        return HexSupport.toHexFromInt(crc, true);
    }

}