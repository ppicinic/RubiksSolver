package rubiks;

/**
 * Created by Phil on 9/10/2014.
 */
public class RubiksCube {

    // Face Color values
    public static final int _RED = 1;
    public static final int _YELLOW = 2;
    public static final int _ORANGE = 3;
    public static final int _WHITE = 4;
    public static final int _GREEN = 5;
    public static final int _BLUE = 6;

    // corners first = 8, 9, 11, 10, 10, 11, 13, 12

    /*

    10    11
    8     9

    12    13
    10    11
     */
    // member fields
    private byte[] faces;

    public RubiksCube(){
        faces = new byte[54];
    }

    public RubiksCube(String text){
        faces = new byte[54];
        for(int i = 0; i < text.length() && i < 56; i++){
            byte b = 0;
            char c = text.charAt(i);
            switch (c){
                case 'R':
                    b = _RED;
                    break;
                case 'O':
                    b = _ORANGE;
                    break;
                case 'Y':
                    b = _YELLOW;
                    break;
                case 'G':
                    b = _GREEN;
                    break;
                case 'B':
                    b = _BLUE;
                    break;
                case 'W':
                    b = _WHITE;
                    break;
            }
            faces[i] = b;
        }
    }

    public RubiksCube(byte[] array){
        if(array.length != 54){
            throw new RuntimeException("Invalid state representation");
        }
        this.faces = array.clone();
    }

    public byte[] getState(){
        return faces;
    }

    public void rotateU(int turns){
        for(int i = 0; i < turns; i++) {
            // shift face corners first
            byte b = faces[2];
            faces[2] = faces[0];
            faces[0] = faces[6];
            faces[6] = faces[8];
            faces[8] = b;
            // shift face middles
            b = faces[5];
            faces[5] = faces[1];
            faces[1] = faces[3];
            faces[3] = faces[7];
            faces[7] = b;
            //shift outside corner1
            b = faces[9];
            faces[9] = faces[12];
            faces[12] = faces[15];
            faces[15] = faces[53];
            faces[53] = b;
            //shift outside corner2
            b = faces[11];
            faces[11] = faces[14];
            faces[14] = faces[17];
            faces[17] = faces[51];
            faces[51] = b;
            //shift outside middle
            b = faces[10];
            faces[10] = faces[13];
            faces[13] = faces[16];
            faces[16] = faces[52];
            faces[52] = b;
        }
    }

    public void rotateD(int turns){
        for(int i = 0; i < turns; i++) {
            // shift face corners first
            byte b = faces[38];
            faces[38] = faces[36];
            faces[36] = faces[42];
            faces[42] = faces[44];
            faces[44] = b;
            // shift face middles
            b = faces[41];
            faces[41] = faces[37];
            faces[37] = faces[39];
            faces[39] = faces[43];
            faces[43] = b;
            //shift outside corner1
            b = faces[35];
            faces[35] = faces[32];
            faces[32] = faces[29];
            faces[29] = faces[45];
            faces[45] = b;
            //shift outside corner2
            b = faces[33];
            faces[33] = faces[30];
            faces[30] = faces[27];
            faces[27] = faces[47];
            faces[47] = b;
            //shift outside middle
            b = faces[34];
            faces[34] = faces[31];
            faces[31] = faces[28];
            faces[28] = faces[46];
            faces[46] = b;
        }
    }

    public void rotateF(int turns){
        for(int i = 0; i < turns; i++) {
            // shift face corners first
            byte b = faces[14];
            faces[14] = faces[12];
            faces[12] = faces[30];
            faces[30] = faces[32];
            faces[32] = b;
            // shift face middles
            b = faces[23];
            faces[23] = faces[13];
            faces[13] = faces[21];
            faces[21] = faces[31];
            faces[31] = b;
            //shift outside corner1
            b = faces[15];
            faces[15] = faces[6];
            faces[6] = faces[29];
            faces[29] = faces[38];
            faces[38] = b;
            //shift outside corner2
            b = faces[33];
            faces[33] = faces[8];
            faces[8] = faces[11];
            faces[11] = faces[36];
            faces[36] = b;
            //shift outside middle
            b = faces[24];
            faces[24] = faces[7];
            faces[7] = faces[20];
            faces[20] = faces[37];
            faces[37] = b;
        }
    }

    public void rotateB(int turns){
        for(int i = 0; i < turns; i++) {
            // shift face corners first
            byte b = faces[47];
            faces[47] = faces[45];
            faces[45] = faces[51];
            faces[51] = faces[53];
            faces[53] = b;
            // shift face middles
            b = faces[50];
            faces[50] = faces[46];
            faces[46] = faces[48];
            faces[48] = faces[52];
            faces[52] = b;
            //shift outside corner1
            b = faces[35];
            faces[35] = faces[42];
            faces[42] = faces[9];
            faces[9] = faces[2];
            faces[2] = b;
            //shift outside corner2
            b = faces[17];
            faces[17] = faces[44];
            faces[44] = faces[27];
            faces[27] = faces[0];
            faces[0] = b;
            //shift outside middle
            b = faces[26];
            faces[26] = faces[43];
            faces[43] = faces[18];
            faces[18] = faces[1];
            faces[1] = b;
        }
    }

    public void rotateL(int turns){
        for(int i = 0; i < turns; i++) {
            // shift face corners first
            byte b = faces[11];
            faces[11] = faces[9];
            faces[9] = faces[27];
            faces[27] = faces[29];
            faces[29] = b;
            // shift face middles
            b = faces[20];
            faces[20] = faces[10];
            faces[10] = faces[18];
            faces[18] = faces[28];
            faces[28] = b;
            //shift outside corner1
            b = faces[12];
            faces[12] = faces[0];
            faces[0] = faces[45];
            faces[45] = faces[36];
            faces[36] = b;
            //shift outside corner2
            b = faces[30];
            faces[30] = faces[6];
            faces[6] = faces[51];
            faces[51] = faces[42];
            faces[42] = b;
            //shift outside middle
            b = faces[21];
            faces[21] = faces[3];
            faces[3] = faces[48];
            faces[48] = faces[39];
            faces[39] = b;
        }
    }

    public void rotateR(int turns){
        for(int i = 0; i < turns; i++) {
            // shift face corners first
            byte b = faces[17];
            faces[17] = faces[15];
            faces[15] = faces[33];
            faces[33] = faces[35];
            faces[35] = b;
            // shift face middles
            b = faces[26];
            faces[26] = faces[16];
            faces[16] = faces[24];
            faces[24] = faces[34];
            faces[34] = b;
            //shift outside corner1
            b = faces[2];
            faces[2] = faces[14];
            faces[14] = faces[38];
            faces[38] = faces[47];
            faces[47] = b;
            //shift outside corner2
            b = faces[8];
            faces[8] = faces[32];
            faces[32] = faces[44];
            faces[44] = faces[53];
            faces[53] = b;
            //shift outside middle
            b = faces[5];
            faces[5] = faces[23];
            faces[23] = faces[41];
            faces[41] = faces[50];
            faces[50] = b;
        }
    }

    private void rotateUD(int turns){
        for(int i = 0; i < turns; i++) {
            //shift outside corner1
            byte b = faces[18];
            faces[18] = faces[21];
            faces[21] = faces[24];
            faces[24] = faces[50];
            faces[50] = b;
            //shift outside corner2
            b = faces[20];
            faces[20] = faces[23];
            faces[23] = faces[26];
            faces[26] = faces[48];
            faces[48] = b;
            //shift outside middle
            b = faces[19];
            faces[19] = faces[22];
            faces[22] = faces[25];
            faces[25] = faces[49];
            faces[49] = b;
        }
    }

    private void rotateFB(int turns){
        for(int i = 0; i < turns; i++) {
            //shift outside corner1
            byte b = faces[34];
            faces[34] = faces[5];
            faces[5] = faces[10];
            faces[10] = faces[39];
            faces[39] = b;
            //shift outside corner2
            b = faces[16];
            faces[16] = faces[3];
            faces[3] = faces[28];
            faces[28] = faces[41];
            faces[41] = b;
            //shift outside middle
            b = faces[25];
            faces[25] = faces[4];
            faces[4] = faces[19];
            faces[19] = faces[40];
            faces[40] = b;
        }
    }

    private void rotateLR(int turns){
        for(int i = 0; i < turns; i++) {
            //shift outside corner1
            byte b = faces[1];
            faces[1] = faces[13];
            faces[13] = faces[37];
            faces[37] = faces[46];
            faces[46] = b;
            //shift outside corner2
            b = faces[7];
            faces[7] = faces[31];
            faces[31] = faces[43];
            faces[43] = faces[52];
            faces[52] = b;
            //shift outside middle
            b = faces[4];
            faces[4] = faces[22];
            faces[22] = faces[40];
            faces[40] = faces[49];
            faces[49] = b;
        }
    }

    private void reset(){
        if(faces[19] == _RED){
            rotateF(1);
            rotateFB(1);
            rotateB(3);
        }else if(faces[22] == _RED){
            rotateR(1);
            rotateLR(1);
            rotateL(3);
        }else if(faces[25] == _RED){
            rotateF(3);
            rotateFB(3);
            rotateB(1);
        }else if(faces[40] == _RED){
            rotateR(2);
            rotateLR(2);
            rotateL(2);
        }else if(faces[49] == _RED){
            rotateR(3);
            rotateLR(3);
            rotateL(1);
        }

        if(faces[19] == _YELLOW){
            rotateU(3);
            rotateUD(3);
            rotateD(1);
        }else if(faces[25] == _YELLOW){
            rotateU(1);
            rotateUD(1);
            rotateD(3);
        }else if(faces[49] == _YELLOW){
            rotateU(2);
            rotateUD(2);
            rotateD(2);
        }
    }

    public boolean validate(){
        return validateSpaces() && validatePermutationParity() && validateEdges() && validateCorners() && validateMiddle();
    }

    private boolean validateMiddle(){
        RubiksCube r = this.clone();
        r.reset();
        return r.faces[4] == _RED && r.faces[19] == _GREEN && r.faces[22] == _YELLOW
                && r.faces[25] == _BLUE && r.faces[40] == _ORANGE && r.faces[49] == _WHITE;
    }

    private boolean validateCorners(){
        return validateCornerCount() && validateCornerParity();
    }

    public boolean validatePermutationParity(){
        return (edgePermutations() + cornerPermutations()) % 2 == 0;
    }

    private int edgePermutations(){
        int[] array = new int[13];
        int permutations = 0;

        array[1] = getEdgeCountValue(7, 13);
        array[2] = getEdgeCountValue(1, 52);
        array[3] = getEdgeCountValue(3, 10);
        array[4] = getEdgeCountValue(5, 16);

        // bottom face
        array[5] = getEdgeCountValue(37, 31);
        array[7] = getEdgeCountValue(39, 28);
        array[6] = getEdgeCountValue(43, 46);
        array[8] = getEdgeCountValue(41, 34);

        // middle ring
        array[9] = getEdgeCountValue(20, 21);
        array[10] = getEdgeCountValue(23, 24);
        array[11] = getEdgeCountValue(18, 48);
        array[12] = getEdgeCountValue(26, 50);

        for(int i = 1; i < array.length; i++){
            if(array[i] != i){
                for(int j = i + 1; j < array.length; j++){
                    if(array[j] == i){
                        permutations++;
                        int t = array[j];
                        array[j] = array[i];
                        array[i] = t;
                        break;
                    }
                }
            }
        }

        return permutations;
    }

    private int cornerPermutations(){
        int[] array = new int[9];
        int permutations = 0;
        //
        array[1] = getCornerCountVal(6, 11, 12);
        array[2] = getCornerCountVal(8, 14, 15);
        array[3] = getCornerCountVal(0, 9, 51);
        array[4] = getCornerCountVal(2, 17, 53);

        array[5] = getCornerCountVal(42, 45, 27);
        array[6] = getCornerCountVal(44, 47, 35);
        array[7] = getCornerCountVal(36, 29, 30);
        array[8] = getCornerCountVal(38, 32, 33);

        for(int i = 1; i < array.length; i++){
            if(array[i] != i){
                for(int j = i + 1; j < array.length; j++){
                    if(array[j] == i){
                        permutations++;
                        int t = array[j];
                        array[j] = array[i];
                        array[i] = t;
                        break;
                    }
                }
            }
        }

        return permutations;
    }

    private boolean validateSpaces(){
        int red = 0;
        int blue = 0;
        int white = 0;
        int yellow = 0;
        int orange = 0;
        int green = 0;

        for(byte b : faces){
            switch(b){
                case _RED:
                    red++;
                    break;
                case _WHITE:
                    white++;
                    break;
                case _ORANGE:
                    orange++;
                    break;
                case _YELLOW:
                    yellow++;
                    break;
                case _GREEN:
                    green++;
                    break;
                case _BLUE:
                    blue++;
                    break;
                default:
                    break;
            }
        }
        return red == 9 && blue == 9 && white == 9 && yellow == 9 && orange == 9 && green == 9;
    }

    private boolean validateCornerCount(){
        int sum = 0;
        long product = 1;

        int t = getCornerCountVal(6, 11, 12);
        sum += t;
        product *= t;

        t = getCornerCountVal(0, 9, 51);
        sum += t;
        product *= t;

        t = getCornerCountVal(2, 17, 53);
        sum += t;
        product *= t;

        t = getCornerCountVal(8, 14, 15);
        sum += t;
        product *= t;

        t = getCornerCountVal(36, 29, 30);
        sum += t;
        product *= t;

        t = getCornerCountVal(38, 32, 33);
        sum += t;
        product *= t;

        t = getCornerCountVal(42, 45, 27);
        sum += t;
        product *= t;

        t = getCornerCountVal(44, 47, 35);
        sum += t;
        product *= t;

        return sum == 36 && product == 40320;
    }

    private int getCornerCountVal(int x, int y, int z){
        if(faces[x] == _RED || faces[y] == _RED || faces[z] == _RED ){
            if(faces[x] == _YELLOW || faces[y] == _YELLOW || faces[z] == _YELLOW){
                if(faces[x] == _GREEN || faces[y] == _GREEN || faces[z] == _GREEN){
                    return 1;
                }else if(faces[x] == _BLUE || faces[y] == _BLUE || faces[z] == _BLUE){
                    return 2;
                }
            }else if(faces[x] == _WHITE || faces[y] == _WHITE || faces[z] == _WHITE){
                if(faces[x] == _GREEN || faces[y] == _GREEN || faces[z] == _GREEN){
                    return 3;
                }else if(faces[x] == _BLUE || faces[y] == _BLUE || faces[z] == _BLUE){
                    return 4;
                }
            }
        }else if(faces[x] == _ORANGE || faces[y] == _ORANGE || faces[z] == _ORANGE){
            if(faces[x] == _YELLOW || faces[y] == _YELLOW || faces[z] == _YELLOW){
                if(faces[x] == _GREEN || faces[y] == _GREEN || faces[z] == _GREEN){
                    return 5;
                }else if(faces[x] == _BLUE || faces[y] == _BLUE || faces[z] == _BLUE){
                    return 6;
                }
            }else if(faces[x] == _WHITE || faces[y] == _WHITE || faces[z] == _WHITE){
                if(faces[x] == _GREEN || faces[y] == _GREEN || faces[z] == _GREEN){
                    return 7;
                }else if(faces[x] == _BLUE || faces[y] == _BLUE || faces[z] == _BLUE){
                    return 8;
                }
            }
        }
        return 0;
    }

    public boolean validateCornerParity(){
        int total = 0;

        // top face
        total += getCornerValue(0, 9, 51);
        total += getCornerValue(2, 53, 17);
        total += getCornerValue(6, 12, 11);
        total += getCornerValue(8, 15, 14);

        // bottom face
        total += getCornerValue(36, 29, 30);
        total += getCornerValue(38, 32, 33);
        total += getCornerValue(42, 45, 27);
        total += getCornerValue(44, 35, 47);

        return total % 3 == 0;
}

    public boolean validateEdges(){
        return validateEdgeCount() && validateEdgeParity();
    }

    private boolean validateEdgeParity(){
        int total = 0;

        // top face
        total += getEdgeValue(1, 52);
        total += getEdgeValue(7, 13);

        // front face
        total += getEdgeValue(21, 20);
        total += getEdgeValue(23, 24);

        // left face
        total += getEdgeValue(10, 3);
        total += getEdgeValue(28, 39);

        // right face
        total += getEdgeValue(16, 5);
        total += getEdgeValue(34, 41);

        // bottom face
        total += getEdgeValue(37, 31);
        total += getEdgeValue(43, 46);

        // back face
        total += getEdgeValue(48, 18);
        total += getEdgeValue(50, 26);

        return total % 2 == 0;
    }

    private boolean validateEdgeCount(){
        int sum = 0;
        long product = 1;

        // top face
        int t = getEdgeCountValue(1, 52);
        sum += t;
        product *= t;

        t = getEdgeCountValue(3, 10);
        sum += t;
        product *= t;

        t = getEdgeCountValue(5, 16);
        sum += t;
        product *= t;

        t = getEdgeCountValue(7, 13);
        sum += t;
        product *= t;

        // bottom face
        t = getEdgeCountValue(37, 31);
        sum += t;
        product *= t;

        t = getEdgeCountValue(39, 28);
        sum += t;
        product *= t;

        t = getEdgeCountValue(43, 46);
        sum += t;
        product *= t;

        t = getEdgeCountValue(41, 34);
        sum += t;
        product *= t;

        // middle ring
        t = getEdgeCountValue(20, 21);
        sum += t;
        product *= t;

        t = getEdgeCountValue(23, 24);
        sum += t;
        product *= t;

        t = getEdgeCountValue(18, 48);
        sum += t;
        product *= t;

        t = getEdgeCountValue(26, 50);
        sum += t;
        product *= t;

        return sum == 78 && product == 479001600;
    }

    private int getEdgeCountValue(int x, int y){
        if(faces[x] == _RED || faces[y] == _RED){
            if(faces[x] == _YELLOW || faces[y] == _YELLOW){
                return 1;
            }else if(faces[x] == _WHITE || faces[y] == _WHITE){
                return 2;
            }else if(faces[x] == _GREEN || faces[y] == _GREEN){
                return 3;
            }else if(faces[x] == _BLUE || faces[y] == _BLUE){
                return 4;
            }
        }else if(faces[x] == _ORANGE || faces[y] == _ORANGE){
            if(faces[x] == _YELLOW || faces[y] == _YELLOW){
                return 5;
            }else if(faces[x] == _WHITE || faces[y] == _WHITE){
                return 6;
            }else if(faces[x] == _GREEN || faces[y] == _GREEN){
                return 7;
            }else if(faces[x] == _BLUE || faces[y] == _BLUE){
                return 8;
            }
        }else if(faces[x] == _YELLOW || faces[y] == _YELLOW){
            if(faces[x] == _GREEN || faces[y] == _GREEN){
                return 9;
            }else if(faces[x] == _BLUE || faces[y] == _BLUE){
                return 10;
            }
        }else if(faces[x] == _WHITE || faces[y] == _WHITE) {
            if (faces[x] == _GREEN || faces[y] == _GREEN) {
                return 11;
            } else if (faces[x] == _BLUE || faces[y] == _BLUE) {
                return 12;
            }
        }
        return 0;
    }

    private int getCornerValue(int x, int y, int z){
        if(faces[x] == _RED || faces[x] == _ORANGE){
            return 0;
        }else if(faces[y] == _RED || faces[y] == _ORANGE){
            return 1;
        }else if(faces[z] == _RED || faces[z] == _ORANGE){
            return 2;
        }
        return -1;
    }

    private int getEdgeValue(int x, int y){
        switch(faces[x]){
            case _RED:
                if(faces[y] == _YELLOW || faces[y] == _WHITE){
                    return 0;
                }else{
                    return 1;
                }
            case _YELLOW:
                if(faces[y] == _GREEN || faces[y] == _BLUE){
                    return 0;
                }else{
                    return 1;
                }
            case _ORANGE:
                if(faces[y] == _YELLOW || faces[y] == _WHITE){
                    return 0;
                }else{
                    return 1;
                }
            case _WHITE:
                if(faces[y] == _GREEN|| faces[y] == _BLUE){
                    return 0;
                }else{
                    return 1;
                }
            case _GREEN:
                if(faces[y] == _RED || faces[y] == _ORANGE){
                    return 0;
                }else{
                    return 1;
                }
            case _BLUE:
                if(faces[y] == _RED || faces[y] == _ORANGE){
                    return 0;
                }else{
                    return 1;
                }
        }
        return 0;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 9; i++){
            sb.append(charVal(faces[i]));
            if(i % 3 == 2){
                sb.append('\n');
            }
        }
        for(int i = 9; i < 36; i++){
            sb.append(charVal(faces[i]));
            if(i % 9 == 8){
                sb.append('\n');
            }
        }
        for(int i = 36; i < 54; i++){
            sb.append(charVal(faces[i]));
            if(i % 3 == 2){
                sb.append('\n');
            }
        }

        return sb.toString();
    }

    private char charVal(byte b){
        char c = ' ';
        switch(b){
            case _BLUE:
                c = 'B';
                break;
            case _GREEN:
                c = 'G';
                break;
            case _ORANGE:
                c = 'O';
                break;
            case _RED:
                c = 'R';
                break;
            case _WHITE:
                c = 'W';
                break;
            case _YELLOW:
                c = 'Y';
                break;
            default:
                break;
        }
        return c;
    }

    public RubiksCube clone(){
        return new RubiksCube(faces.clone());
    }

    public boolean equals(RubiksCube r){
        RubiksCube t1 = this.clone();
        RubiksCube t2 = r.clone();
        t1.reset();
        t2.reset();
        for(int i = 0; i < 56; i++){
            if(t1.faces[i] != t2.faces[i]){
                return false;
            }
        }
        return true;
    }
}
