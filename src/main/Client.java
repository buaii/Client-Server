package main;

public class Client {

	public static void main(String[] args) {
		Server server = new Server();
		System.out.println(server.add(1, 2));
	}

}
