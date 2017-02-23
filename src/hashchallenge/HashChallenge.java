/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashchallenge;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author chris
 */
public class HashChallenge {

    private List<String> input;
    private List<String> output;
    
    public HashChallenge(String input) throws IOException{
        this.input = Files.readAllLines(Paths.get("src/HashChallenge/"+input), StandardCharsets.UTF_8);
        
        
    }
    
    
    private void output() throws IOException{
        Files.write(Paths.get("output.txt"),output,Charset.defaultCharset());
        
        
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
