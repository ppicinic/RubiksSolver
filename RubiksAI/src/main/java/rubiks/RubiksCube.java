package rubiks;

/**
 * Created by Phil on 9/10/2014.
 */
public class RubiksCube {
    private byte[] faces;

    public RubiksCube(){
        faces = new byte[56];
    }

    public RubiksCube(String text){
        faces = new byte[56];
        for(int i = 0; i < text.length() && i < 56; i++){
            byte b = 0;
            char c = text.charAt(i);
            switch (c){
                case 'R':
                    b = 1;
                    break;
                case 'O':
                    b = 2;
                    break;
                case 'Y':
                    b = 3;
                    break;
                case 'G':
                    b = 4;
                    break;
                case 'B':
                    b = 5;
                    break;
                case 'V':
                    b = 1;
                    break;
            }
            faces[i] = b;
        }
    }

    public RubiksCube(byte[] array){
        if(array.length != 56){
            throw new RuntimeException("Invalid state representation");
        }
        this.faces = array;
    }

    public byte[] getState(){
        return faces;
    }
}
