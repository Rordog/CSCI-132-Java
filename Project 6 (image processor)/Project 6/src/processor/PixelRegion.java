/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processor;

/**
 *
 * @author rdonl
 */
public class PixelRegion {
    public boolean checkThreshold(int[] baseColors, int[] colors){
        //blue
        if(baseColors[1] == 0 && colors[1] == 0 && baseColors[2] == 0 && colors[2] == 0 && baseColors[3] > 200 && colors[3] > 200){
            return true;
        }
        //red
        else if(baseColors[1] == 255 && colors[1] == 255 && baseColors[2] < 70 && colors[2] < 70 && baseColors[3] < 70 && colors[3] < 70){
            return true;
        }
        //yellow
        else if(baseColors[1] > 190 && colors[1] > 190 && baseColors[2] > 170 && baseColors[2] < 225 && colors[2] > 170 && colors[2] < 225 && baseColors[3] > 80 && baseColors[3] < 170 && colors[3] > 80 && colors[3] < 170){
            return true;
        }
        //background
        else if(baseColors[1] == 154 && colors[1] == 154 && baseColors[2] == 153 && colors[2] == 153 && baseColors[3] == 255 && colors[3] == 255){
            return true;
        }
        else{
            return false;
        }
    }
}
