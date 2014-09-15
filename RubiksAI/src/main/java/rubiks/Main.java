package rubiks;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.BitSet;

/**
 * Created by Phil on 9/10/2014.
 */
public class Main {

//    public static void main(String[] args){
//        StringBuilder sb = new StringBuilder();
//        for(byte i = 1; i <=6; i++){
//            for(byte j = 1; j <= 6; j++){
//                sb.append(compress(i, j));
//                sb.append(", ");
//            }
//        }
//        System.out.println(sb.toString());
//
////        compress((byte)1, (byte)2);
////        compress((byte)3, (byte)4);
////        compress((byte)5, (byte)6);
//
//    }

    public static byte compress(byte a, byte b){
        String as = Integer.toBinaryString(a);
        String bs = Integer.toBinaryString(b);
        as = pad(as);
        bs = pad(bs);
        String t = as + bs;
        byte result = Byte.parseByte(t, 2);
//        System.out.println(as);
//        System.out.println(bs);
//        System.out.println(t);
//        System.out.println(result);
        return result;
    }

    public static String pad(String a){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4 - a.length(); i++){
            sb.append('0');
        }
        sb.append(a);
        return sb.toString();
    }


}
