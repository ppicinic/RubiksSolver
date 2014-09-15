package rubiks;

//import junit.framework.Assert;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Phil on 9/13/2014.
 */

public class EdgeParityTest {

    public final String _DRIVE = "D:\\AI\\RubiksCubeStates\\";
    public final String _INVALID = _DRIVE + "invalid\\";

    @Test
    public void testCase1(){
        try {
            String filename = _INVALID + "test1.txt";
            RubiksCube r = Solvable.createCube(filename);
            Assert.assertFalse(r.validateEdges());
        }catch(AssertionError ae){
            System.out.println("Failed test1.txt");
            Assert.fail();
        }
    }

    @Test
    public void testCase2(){
        try {
            String filename = _INVALID + "test2.txt";
            RubiksCube r = Solvable.createCube(filename);
            Assert.assertTrue(r.validateEdges());
        }catch(AssertionError ae){
            System.out.println("Failed test2.txt");
            Assert.fail();
        }
    }

    @Test
    public void testCase3(){
        try {
            String filename = _INVALID + "test3.txt";
            RubiksCube r = Solvable.createCube(filename);
            Assert.assertFalse(r.validateEdges());
        }catch(AssertionError ae){
            System.out.println("Failed test3.txt");
            Assert.fail();
        }
    }

    @Test
    public void testCase4(){
        try {
            String filename = _INVALID + "test4.txt";
            RubiksCube r = Solvable.createCube(filename);
            Assert.assertFalse(r.validateEdges());
        }catch(AssertionError ae){
            System.out.println("Failed test4.txt");
            Assert.fail();
        }
    }

    @Test
    public void testCase5(){
        try {
            String filename = _INVALID + "test5.txt";
            RubiksCube r = Solvable.createCube(filename);
            Assert.assertTrue(r.validateEdges());
        }catch(AssertionError ae){
            System.out.println("Failed test5.txt");
            Assert.fail();
        }
    }

    @Test
    public void testCase6(){
        try {
            String filename = _INVALID + "test6.txt";
            RubiksCube r = Solvable.createCube(filename);
            Assert.assertTrue(r.validateEdges());
        }catch(AssertionError ae){
            System.out.println("Failed test6.txt");
            Assert.fail();
        }
    }

    @Test
    public void testCase7(){
        try {
            String filename = _INVALID + "test7.txt";
            RubiksCube r = Solvable.createCube(filename);
            Assert.assertTrue(r.validateEdges());
        }catch(AssertionError ae){
            System.out.println("Failed test7.txt");
            Assert.fail();
        }
    }

    @Test
    public void testCase8(){
        try {
            String filename = _INVALID + "test8.txt";
            RubiksCube r = Solvable.createCube(filename);
            Assert.assertFalse(r.validateEdges());
        }catch(AssertionError ae){
            System.out.println("Failed test8.txt");
            Assert.fail();
        }
    }
}
