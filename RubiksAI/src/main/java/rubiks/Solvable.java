package rubiks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Phil on 9/11/2014.
 */
public class Solvable {

    public static void main(String[] args){
        RubiksCube r;
        RubiksCube t;
        if(args.length == 1){
            StringBuilder sb = new StringBuilder();
            String filename = args[0];
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                String line;
                while( (line = reader.readLine()) != null){
                    for(int i = 0; i < line.length(); i++){
                        char c = line.charAt(i);
                        if(isValid(c)) {
                            sb.append(Character.toUpperCase(c));
                        }
                    }

                }
                reader.close();
            }catch(IOException ie){
                System.out.println("File not found or corrupted.");
            }
            String result = sb.toString();

            r = new RubiksCube(sb.toString());
            // start

//            Random random = new Random(System.currentTimeMillis());
//            for(int i = 0; i < 2000; i++) {
//                RubiksCube a = r.clone();
//                StringBuilder sbb = new StringBuilder();
//                for (int j = 0; j < 20; j++) {
//                    int x = random.nextInt(6);
//                    int y = random.nextInt(3);
//                    y++;
//                    switch(x){
//                        case 0:
//                            a.rotateU(y);
//                            sbb.append("U" + y);
//                            break;
//                        case 1:
//                            sbb.append("D" + y);
//                            a.rotateD(y);
//                            break;
//                        case 2:
//                            a.rotateF(y);
//                            sbb.append("F" + y);
//                            break;
//                        case 3:
//                            a.rotateB(y);
//                            sbb.append("B" + y);
//                            break;
//                        case 4:
//                            a.rotateL(y);
//                            sbb.append("L" + y);
//                            break;
//                        case 5:
//                            a.rotateR(y);
//                            sbb.append("R" + y);
//                            break;
//                        default:
//                            break;
//                    }
//                    if(!a.validate()){
//                        System.out.println("failed on:\n" + sbb.toString() + "\n" + a);
//                    }
//                }
//            }
            //end

//            r.rotateR(3);
//            r.rotateL(1);
//            r.rotateB(3);
//            r.rotateU(2);
//            r.rotateB(3);
//            r.rotateF(3);
//            r.rotateB(1);
//            r.rotateD(3);
            System.out.println(r);
            System.out.println(r.validate());
        }
    }

    public static boolean isValid(char c){
        return c == 'R' || c == 'r' || c == 'O' || c == 'o'  || c == 'Y' || c == 'y' || c == 'G'
                || c == 'g' || c == 'B' || c == 'b' || c == 'W' || c == 'w';
    }

    public static RubiksCube createCube(String filename){
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while( (line = reader.readLine()) != null){
                for(int i = 0; i < line.length(); i++){
                    char c = line.charAt(i);
                    if(isValid(c)) {
                        sb.append(Character.toUpperCase(c));
                    }
                }

            }
            reader.close();
        }catch(IOException ie){
            System.out.println("File not found or corrupted.");
        }
        return new RubiksCube(sb.toString());
    }
}
