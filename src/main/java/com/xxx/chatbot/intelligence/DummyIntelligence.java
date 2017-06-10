package com.xxx.chatbot.intelligence;

import edu.stanford.nlp.simple.Sentence;
import edu.stanford.nlp.trees.Tree;
import org.springframework.stereotype.Service;

/**
 * Created by himanshu dhawan on 10-06-2017.
 */
@Service
public class DummyIntelligence {

    public static String someTest(String text) {
        Sentence sent = new Sentence(text);
        return getVerb(sent.parse());
  }

    private static String getVerb(Tree treeNode) {
        String treeString = treeNode.pennString();
        int verbindex = treeString.indexOf("(VB ");
        String tempString = treeString.substring(verbindex + 4);
        String verbWord = tempString.substring(0, tempString.indexOf(")"));
        return verbWord;
    }

    public static void main(String ... args){
        DummyIntelligence.someTest("can you sell 100 shares of infosys");
    }
}
