package br.com.consultbilletregistry.security;

import javax.xml.bind.DatatypeConverter;

/**
 * Allow to encode/decode the authentification
 * @author Deisss (LGPLv3)
 */
public class Base64 {
    /**
     * Decode the basic auth and convert it to array login/password
     * @param auth The string encoded authentification
     */
    public static String decode(String auth) {
        //Decode the Base64 into byte[]
        byte[] decodedBytes = DatatypeConverter.parseBase64Binary(auth);
 
        //If the decode fails in any case
        if(decodedBytes == null || decodedBytes.length == 0){
            return null;
        }
 
        return new String(decodedBytes);
    }
    
    /**
     * Decode the basic auth and convert it to array login/password
     * @param auth The string encoded authentification
     * @return The login (case 0), the password (case 1)
     */
    public static String encode(String auth) {
        //Encode the Base64 into byte[]
        auth = DatatypeConverter.printBase64Binary(auth.getBytes());
 
        //If the encode fails in any case
        if(auth == null || auth.isEmpty()){
            return null;
        }
 
        return auth;
    }
}