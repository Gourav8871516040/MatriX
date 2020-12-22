package com.example.matrix;

public class NumberSystem {


    public long  binToDec(String s)
    {

   return Long.parseLong(s,2);

    }

    public String binToOctal(String s)
    {
        return Long.toOctalString(Long.parseLong(s,2));
    }

    public String binToHexa(String s)
    {
        return Long.toHexString(Long.parseLong(s,2));
    }


    public String octToBin(String s) {

        return Long.toBinaryString(Long.parseLong(s,8));
    }

    public long octToDec(String s)
    {
        return Long.parseLong(s,8);
    }
    public String octToHexa(String s)
    {
        return Long.toHexString(Long.parseLong(s,8));
    }


    public String hexToBin(String s)
    {
        return Long.toBinaryString(Long.parseLong(s,16));
    }

    public String  hexToOct(String s ){
        return Long.toOctalString(Long.parseLong(s,16));

    }
    public long hexToDec(String s)
    {
        return Long.parseLong(s,16);
    }


    public String decToBin(String s)
    {
        return Long.toBinaryString(Long.parseLong(s));
    }

    public String decToOct(String s )
    {
        return Long.toOctalString(Long.parseLong(s));
    }

    public String decToHex(String s)
    {
        return Long.toHexString(Long.parseLong(s));
    }


}
