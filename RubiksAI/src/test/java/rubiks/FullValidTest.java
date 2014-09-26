package rubiks;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Phil on 9/23/2014.
 */
public class FullValidTest {

    private static final String path = "D:\\AI\\RubiksCubeStates\\valid\\";

    @Test
    public void fullTestSuite(){

        File[] files = new File(path).listFiles();
        for(File file : files){
            if(file.isFile()){
                try {
                    RubiksCube r = Solvable.createCube(file.getAbsolutePath());
                    assertTrue(r.validate());
                }catch(AssertionError e){
                    System.out.println("failed on state: " + file.getName());
                    System.out.println(e);
                    fail();
                }
            }
        }
    }
}
