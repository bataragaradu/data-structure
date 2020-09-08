package com.innovative.algo.structures.arrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {
    public String getFileContent(String fileCodebasePath) throws IOException {
        Path filePath = Paths.get(fileCodebasePath);
        return Files.readString(filePath);
    }
}
