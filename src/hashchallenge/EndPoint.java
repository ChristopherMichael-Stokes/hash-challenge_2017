/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashchallenge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class EndPoint {
    private int latencyToDatacentre;
    private List<List<Integer>> latencyToCache;
    
    public EndPoint(int latencyToDatacentre){
        this.latencyToDatacentre=latencyToDatacentre;
        this.latencyToCache=latencyToCache;
        latencyToCache = new ArrayList<>();
    }

    public int getLatencyToDatacentre() {
        return latencyToDatacentre;
    }

    public void setLatencyToDatacentre(int latencyToDatacentre) {
        this.latencyToDatacentre = latencyToDatacentre;
    }

    public List<List<Integer>> getLatenciesToCache(){
        return latencyToCache;
    }
    public void addLatencyToCache(List<Integer> latencyToCache){
        this.latencyToCache.add(latencyToCache);
        
    }
    
    
    
    
}
