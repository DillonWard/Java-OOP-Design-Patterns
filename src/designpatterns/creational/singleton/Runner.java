package designpatterns.creational.singleton;

import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {

		Singleton firstInstance = Singleton.getInstance();
		Singleton secondInstance = Singleton.getInstance();

		System.out.println("Instance 1 ID: " + System.identityHashCode(firstInstance));
		System.out.println(firstInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = firstInstance.getTiles(7);
		System.out.println("Player 1: " + playerOneTiles);
		System.out.println(firstInstance.getLetterList()); 
		
		System.out.println("Instance 2 ID: " + System.identityHashCode(secondInstance));
		LinkedList<String> playerTwoTiles = secondInstance.getTiles(7);
		System.out.println("Player 2: " + playerTwoTiles);

		
	}

}
