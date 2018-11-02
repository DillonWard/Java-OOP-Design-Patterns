package designpatterns.creational.singleton;

public class PlayerThreads {

	public static void main(String[] args) {
		Runnable firstTiles = new GetTiles();
		Runnable secondTiles = new GetTiles();
		
		new Thread(firstTiles).start();
		new Thread(secondTiles).start();
	}
}
