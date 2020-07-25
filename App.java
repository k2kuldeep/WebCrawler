import java.util.*;
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a complete url:");
		//String root = "http://www.google.com";	
		String root = sc.nextLine();
		
		System.out.println("Crawled urls:");
		BFS bfs = new BFS();	
		bfs.discoverWeb(root);
		
	}
}
