package utilities;

import org.junit.Test;

import static org.junit.Assert.*;
import static utilities.MultiBracketValidation.multiBracketValidation;

public class MultiBracketValidationTest {
    @Test public void getBracketValidationTest() throws Exception {
        String input1 = "([{}])";
        String input2 = "{}(){}";
        String input3 = "()[[Extra Characters]]";
        String input4 = "(){}[[]]";
        String input5 = "{}{Code}[Fellows](())";
        String input6 = "[({}]";
        String input7 = "(](";
        String input8 = "{";
        String input9 = "[}";


        assertTrue(multiBracketValidation(input1));
        assertTrue(multiBracketValidation(input2));
        assertTrue(multiBracketValidation(input3));
        assertTrue(multiBracketValidation(input4));
        assertTrue(multiBracketValidation(input5));
        assertFalse(multiBracketValidation(input6));
        assertFalse(multiBracketValidation(input7));
        assertFalse(multiBracketValidation(input8));
        assertFalse(multiBracketValidation(input9));



    }
}
