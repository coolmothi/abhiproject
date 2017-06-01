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
public class UnigramGenerator {
    
    public boolean[] generateUnigram(String word)
    {
        //this function generates the unigram of a word that is passed as parameter
        
        boolean[] unigram=new boolean[161]; 
        // boolean because all possible elements of a unigram can have two values, that is an element is present or not present. 
        // 1 : if present , 0 :  if not present
        
        word=word.toLowerCase();
        // convert the given word to lower case to maintain consistency. That is "A" and "a" would serve the same purpose in the word.
        
        char[] word_chars=word.toCharArray();
        // convert to charachter array to make iterations easier
        
        int[] y= new int[word.length()];
        // Stores occurances of the corresponding charachters
        
        for(int i=0;i<word.length();i++)//for every characheter in the word
        {
            char cur = word_chars[i];
            y[i]=1;
            for(int j=0;j<=i-1;j++)// for every charachter before the current charachter
            {
                if(cur == word_chars[j])
                {
                    y[i]++;//increment the count when you find the instance of current charachter previously
                }
                
                
            }
            int basic_index=cur-'a'+1;
            unigram[basic_index+26*(y[i]-1)]=true;
            
            
            
        }
        
        return unigram;
        
        
        
    }
    
    void print_unigram(boolean[] unigram)
    {
        // this function prints the given unigram in readable format on to the console
        
        System.out.println("The unigram is ");
        for(int i=1;i<=160;i++)
        {
            if(unigram[i]==true)
            {
                char ch=(char) ('a'+(i%26)-1);
                int oc;
                if (i%26==0)
                {
                    ch=(char) ('z');
                    oc=i/26;
                }
                else
                {
                    ch=(char) ('a'+(i%26)-1);
                    oc=i/26+1;
                }
                String element=ch+Integer.toString(oc);
                System.out.println(element+",");
            }
            
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
