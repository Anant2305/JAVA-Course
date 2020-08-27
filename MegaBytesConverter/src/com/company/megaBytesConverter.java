package com.company;

public class megaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int YY = kiloBytes / 1024;
            int ZZ = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");
        }
    }
}
