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
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author chris
 */
public class HashChallenge {

    private List<String> input;
    private List<String> output;
    
    private List<String> endpoints;
    private List<String> videos;
    private List<String> latencies;
    private List<String> requests;
    
    public HashChallenge(String input) throws IOException{
        this.input = Files.readAllLines(Paths.get(input), StandardCharsets.UTF_8);
        
        
    }
    
    private void parseInput(){
        endpoints = Arrays.asList(input.get(0).split(" "));
        videos = Arrays.asList(input.get(1).split(" "));
        
        
        
        
    }
    
    
    
    private void output() throws IOException{
        Files.write(Paths.get("output.txt"),output,Charset.defaultCharset());       
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        HashChallenge hc = new HashChallenge("data/meet_at_the_zoo.in");
    }
    
}
