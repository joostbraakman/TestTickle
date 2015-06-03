/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Jan
 */
public class question {
  
    //attributes
    String Question;
    ArrayList<Integer> affectedQualityAttributes;
    Integer Answer;
    
    //methods
    public question () {
        Question = new String();
        affectedQualityAttributes = new ArrayList<>();
        Answer = -1;
    }
   

}
