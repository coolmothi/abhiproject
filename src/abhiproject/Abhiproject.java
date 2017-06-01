/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhiproject;

/**
 *
 * @author User
 */
public class Abhiproject {

    public static void main(String[] args) {
        // initially obtain keywords set  from files
        // next convert all the keywords to their stems
        // you get the set of stem keywords ST (As per paper)
        // for every word STi in ST, pass the word to unigram generator to obtain the unigram
        
        UnigramGenerator ug = new UnigramGenerator();// crreating instance of the class
        
        boolean[] u = ug.generateUnigram("ZyZy"); // Call this function with the word of interest. That is, word for which unigram is needed
        ug.print_unigram(u);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
