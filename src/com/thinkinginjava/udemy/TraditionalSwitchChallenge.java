package com.thinkinginjava.udemy;

public class TraditionalSwitchChallenge {

    public static void main(String[] args) {

        System.out.println(natoCode("Helado"));
    }

    public static String natoCode(String string) {
        String code = "";
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a','A': code += "Able "; break;
                case 'b','B': code += "Baker "; break;
                case 'c','C': code += "Charlie "; break;
                case 'd','D': code += "Dog "; break;
                case 'e','E': code += "Easy "; break;
                case 'f','F': code += "Fox "; break;
                case 'g','G': code += "George "; break;
                case 'h','H': code += "How "; break;
                case 'i','I': code += "Item "; break;
                case 'j','J': code += "Jig "; break;
                case 'k','K': code += "King "; break;
                case 'l','L': code += "Love "; break;
                case 'm','M': code += "Mike "; break;
                case 'n','N': code += "Nan "; break;
                case 'o','O': code += "Oboe "; break;
                case 'p','P': code += "Peter "; break;
                case 'q','Q': code += "Queen "; break;
                case 'r','R': code += "Roger "; break;
                case 's','S': code += "Sugar "; break;
                case 't','T': code += "Tare "; break;
                case 'u','U': code += "Uncle "; break;
                case 'v','V': code += "Victor "; break;
                case 'w','W': code += "William "; break;
                case 'x','X': code += "X-ray "; break;
                case 'y','Y': code += "Yoke "; break;
                case 'z','Z': code += "Zebra "; break;
                default: code += "";

            }
        }
        return code;
    }
}
