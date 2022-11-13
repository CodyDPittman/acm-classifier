package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestAsciiInput{

    private static final String FileName = "C:\\test\\test.txt";

    @Test
    public void testaddFile(){
        AsciiInput input = new AsciiInput();
        assertThat(input.addFile(FileName), equalTo(FileName));

    }
}
