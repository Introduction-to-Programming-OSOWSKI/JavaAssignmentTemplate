package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

import assignment.App;

public class Tests {


   @Test
   public void test(){
       App.main(null);
       //assertEquals(EXPECTED RESULT, App.METHODtoTEST, "ERROR MESSAGE");
   }

}
