package com.donic.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    //    createTheFileIdItDoesNotExist(File file).
    public static void createTheFileIdItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("The file does not exist, it has to be create");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception " + e.getMessage());
            }
        }
    }

    //    informIfTheTheFileExists(File file).
    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file is present");
        } else {
            System.out.println("The file is not present");
        }
    }

    //    printTheFileName(File file).
    public static void printTheFileName(File file) {
        System.out.println("The file name is: " + file.getName());
    }

    //    printTheFileAbsolutePath(File file).
    public static void printTheFileAbsolutePath(File file) {
        System.out.println("The file absolut path: " + file.getAbsolutePath());
    }

    //    printIfTheFileIsADirectory(File file).
    public static void printIfTheFileIsADirectory(File inputfile) {
        System.out.println("The file is a directory: " + inputfile.isDirectory());
//        if (inputfile.isDirectory()){
//            System.out.println("This is a directory");
//        } else {
//            System.out.println("This is a file");
//        }
    }

    //    deleteTheFileIfExists(File file).
    public static void deleteTheFileIfExists(File inputFile) {
        if (inputFile.exists()) {
            if (inputFile.delete()) {
                System.out.println("The file was deleted");
            } else {
                System.out.println("The file exists, but was not deleted");
            }
        } else {
            System.out.println("The file does not exist");
        }
    }

}
