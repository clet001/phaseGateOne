import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FacebookLikeSystem{

    @Test
public void TestToCheckIfTheTestSystemIsWorking(){

String [] array = new FacebookLikeSystem();
String expected = " no one likes this";
String actual = FacebookLikeSystem.FBLike(array);
assertEquals(expected,actual);


}

    @Test
public void TestTOCheckIfTheLikeSystemIsWorking(){
String [] array =  {"Peter"};
String expected = " Peter likes this";
String actual = FacebookLikeSystem.FBLike(array);
assertEquals(expected,actual);



}

    @Test
public void TestTOCheckIfOneLikeSystemIsWorking(){
String [] array = {"Jacob", "Alex"};
String expected = " Jacob and Alex like this";
String actual = FacebookLikeSystem.FBLike(array);
assertEquals(expected,actual);


}

