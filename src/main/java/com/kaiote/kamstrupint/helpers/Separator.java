package com.kaiote.kamstrupint.helpers;

import com.kaiote.kamstrupint.data.SigFoxStructure;

/**
 * Separator
 */
public class Separator {

    /**
     * 
     * @param message
     * @param start
     * @param stop
     * @return
     * @throws Exception
     */
    public String splitSections(String message, int start, int stop) throws Exception {

        String firstnChars;
        if (message.length() >= (stop - start)) {
            firstnChars = message.substring(start, stop);
        } else {
            throw new Exception("The string is not the right Size");
        }
        return firstnChars;
    }


    /**
     * 
     * @param message
     * @return
     * @throws Exception
     */
    public SigFoxStructure classifyMessage(String message) throws Exception {
        SigFoxStructure structure = new SigFoxStructure();
        structure.setPackID(this.splitSections(message, 0, 2));
        structure.setAESCnt(this.splitSections(message, 2, 4));
        structure.setEncryptedPayload(this.splitSections(message, 4, 24));
        return structure;
    }
 
}
