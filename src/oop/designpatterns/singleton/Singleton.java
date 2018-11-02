package oop.designpatterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton firstInstance = null;

	String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d",
			"e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i",
			"i", "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n",
			"o", "o", "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s",
			"t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"};
	
	// store the scrabble letters inside of a linked list
	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

	static boolean firstThread = true;
	private Singleton() {

	}

	public static Singleton getInstance() {
		
		if(firstThread){
			firstThread = false;
			Thread.currentThread();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// only allow the creation of an object if one doesn't already exist
		if (firstInstance == null) {

			// if there isn't already an instance create one
			firstInstance = new Singleton();
			// randomly shuffle the list
			Collections.shuffle(firstInstance.letterList);
		}

		// return either the newly created instance or the one previously created
		return firstInstance;
	}
	
	public LinkedList<String> getLetterList(){
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int noOfTiles){
		LinkedList<String> tilesToSend = new LinkedList<String>();
		
		for(int i = 0; i <= noOfTiles; i++){
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		return tilesToSend;
	}
}
