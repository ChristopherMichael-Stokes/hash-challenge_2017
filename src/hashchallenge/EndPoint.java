/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashchallenge;

/**
 *
 * @author chris
 */
public class EndPoint {
    private int latencyToDatacentre;
    private int[][] latencyToCache;
    
    public EndPoint(int latencyToDatacentre,int[][] latencyToCache){
        this.latencyToDatacentre=latencyToDatacentre;
        this.latencyToCache=latencyToCache;
    }

    public int getLatencyToDatacentre() {
        return latencyToDatacentre;
    }

    public void setLatencyToDatacentre(int latencyToDatacentre) {
        this.latencyToDatacentre = latencyToDatacentre;
    }

    public int[][] getLatencyToCache() {
        return latencyToCache;
    }

    public void setLatencyToCache(int[][] latencyToCache) {
        this.latencyToCache = latencyToCache;
    }
    
    
    
    
    
}
