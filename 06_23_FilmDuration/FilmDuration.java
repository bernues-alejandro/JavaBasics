import java.util.Scanner;

public class FilmDuration {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("Frames per second (fps):");
		int frames = src.nextInt();
		
		System.out.println("Duration of film in minutes:");
		int minutes = src.nextInt();
		
		src.nextLine();
		
		System.out.println("Name of the film:");
		String name = src.nextLine();
		
		int seconds = minutes*60;
		
		int TotalFrames = frames*seconds;
		
		System.out.println("Total frames of film " + '"' + name + '"' + " is " + TotalFrames);
		
		
		
	}
}