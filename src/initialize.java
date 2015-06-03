/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jan
 */
public class initialize {
    
/*
    * reads questions and quality attributes from file into arraylists
    * creates arraylist of answers for each question
    */    
    
  
 public ArrayList<question> initializeQuestions(ArrayList<question> questionList) throws FileNotFoundException {
     Scanner s1 = new Scanner(new File("questionList.txt"));
     Scanner s2 = new Scanner(new File("questributeList.txt"));
     question qQuestion;
     String qString;
     String[] qInts;
     Integer questionIndex;
     Integer i;
     
     
    while (s1.hasNextLine()){
        qQuestion = new question();
        qQuestion.Question = s1.nextLine();
        questionList.add(qQuestion);
        }
    s1.close();
    
    while (s2.hasNextLine()){
        qString = s2.nextLine();
        qInts = qString.split(";");
        questionIndex = Integer.parseInt(qInts[0]);
        for (i = 1; i<qInts.length; i++){
            questionList.get(questionIndex).affectedQualityAttributes.add(Integer.parseInt(qInts[i]));
            }
                        
        }
    s2.close();    
    
    return questionList;
    }
 
 public ArrayList<qualityAttribute> initializequalityAttributes(ArrayList<qualityAttribute> attributeList) throws FileNotFoundException {
     Scanner s1 = new Scanner(new File("attributeList.txt"));
     qualityAttribute qaQualityAttribute;
     String qaString;
     String []qaStrings;
     Integer i;
     
    while (s1.hasNextLine()){
        qaString = s1.nextLine();
        qaStrings = qaString.split(";");
        qaQualityAttribute = new qualityAttribute();
        qaQualityAttribute.qaName = qaStrings[0];
        qaQualityAttribute.qaDescription = qaStrings[1];
        attributeList.add(qaQualityAttribute);
        }
                        
    s1.close();    
    
    return attributeList;
    }
 

 }
