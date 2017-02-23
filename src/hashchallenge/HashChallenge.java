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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author chris
 */
public class HashChallenge {

    private final List<String> input;
    private List<String> output;

    private final List<Integer> vercx;
    //private List<Integer> videos;
    private final Map<Integer, Integer> videos;
    private Map<Integer, Integer> sortedVideos;
    private final List<List<Integer>> latencies;
    private final List<List<Integer>> requests;
    private List<List<Integer>> videosInEndpoint;
    private EndPoint[] endpoints;
    
    public HashChallenge(String input) throws IOException {
        this.input = Files.readAllLines(Paths.get(input), StandardCharsets.UTF_8);
        vercx = new ArrayList<>();
        //videos = new ArrayList<>();
        videos = new TreeMap<>();
        latencies = new ArrayList<>();
        requests = new ArrayList<>();        
    }
    
    private void binPacking(){
        int ServerAmount = vercx.get(3);
        int ServerSize = vercx.get(4);
        
    }
    
    private void initEndpoints(){
        endpoints = new EndPoint[vercx.get(1)];
        for (List<Integer> latency : latencies){
            
            
        }
        
        
    }

    private void sortVideosBySize() {
        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<>(videos.entrySet());
        Collections.sort(list, 
                (Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
                        -> (o2.getValue()).compareTo(o1.getValue()));
        sortedVideos = new LinkedHashMap<>();
        
        list.forEach((entry) -> {
            sortedVideos.put(entry.getKey(), entry.getValue());
        });
        //System.out.println(sortedVideos);
    }

    private void parseInput() {
        List<String> temp = Arrays.asList(input.get(0).split(" "));

        temp.forEach(s -> vercx.add(Integer.parseInt(s)));
        //System.out.println(endpoints);        
        temp = Arrays.asList(input.get(1).split(" "));
        //temp.forEach(s -> videos.add(Integer.parseInt(s)));

        for (int i = 0; i < temp.size(); i++) {
            videos.put(i, Integer.parseInt(temp.get(i)));
        }
        sortVideosBySize();
        //System.out.println(videos);

        for (int i = 2; i < input.size(); i++) {
            temp = Arrays.asList(input.get(i).split(" "));
            List<Integer> tempInts = new ArrayList<>();

            temp.forEach(s -> tempInts.add(Integer.parseInt(s)));

            if (temp.size() == 2) {
                latencies.add(tempInts);
            } else if (temp.size() == 3) {
                requests.add(tempInts);
            }
        }
        //System.out.println(latencies);
        //System.out.println(requests);

    }

    private void output() throws IOException {
        Files.write(Paths.get("out_" + input + ".txt"), output, Charset.defaultCharset());

    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String[] inputs = new String[]{"kittens", "me_at_the_zoo",
            "trending_today", "videos_worth_spreading"};

        for (String input : inputs) {
            HashChallenge hc = new HashChallenge("data/" + input + ".in");
            hc.parseInput();
        }

    }

}
