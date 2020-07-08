package files;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;
import java.nio.file.Files;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./resources/file-write.txt");
		
		List<String> list =
					List.of("Apple", "Boy", "Cat", "Dog", "Elephant");
		
		Files.write(pathFileToWrite, list);

	}
 
}
