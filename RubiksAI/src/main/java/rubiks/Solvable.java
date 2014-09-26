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
            if(result.length() == 54) {
                r = new RubiksCube(sb.toString());
                System.out.println(r.validate());
            }else{
                System.out.println("false");
            }
        }
    }

    /**
     * Checks if a character is valid as an input for the cube
     * @param c character to test
     * @return true if valid, otherwise false
     */
    public static boolean isValid(char c){
        return c == 'R' || c == 'r' || c == 'O' || c == 'o'  || c == 'Y' || c == 'y' || c == 'G'
                || c == 'g' || c == 'B' || c == 'b' || c == 'W' || c == 'w';
    }

    /**
     * Creates a cube from a filename
     * @param filename file that has the Rubik's cube state
     * @return the generated rubik's cube
     */
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
