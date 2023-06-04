package com.donic.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {

        File demoFile = new File("src/main/java/com/donic/filemanagementservice/test.txt");
        FileManager.createTheFileIdItDoesNotExist(demoFile);
        FileManager.informIfTheFileExists(demoFile);
        FileManager.printIfTheFileIsADirectory(demoFile);
        FileManager.printTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
//        FileManager.deleteTheFileIfExists(demoFile);

        InputFileReadManager.readDataFromTextFile(demoFile);
        InputFileReadManager.readDataFromATextFileUsingFileReader(demoFile);
        System.out.println();
        InputFileReadManager.readDataFromATextFileUsingBufferedReader(demoFile);

        String contentForTheFile = "Text for test file txt \n Another line with text";
        OutputFileWriterManager.writeDataIntoFile(demoFile, contentForTheFile);
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Empty");

    }
}
