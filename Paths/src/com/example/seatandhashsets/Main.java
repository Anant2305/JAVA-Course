package com.example.seatandhashsets;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {

        //COPYING FILES AND FOLDER STRUCTURES
        try {
            //Move a file to a directory
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "filecopy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "Dir1", "filecopy.txt");
//            Files.move(fileToMove, destination);

            //Move File and rename it.
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples",  "file1.txt");
//            Files.move(fileToMove, destination);

            //Copy a file and rename it
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "filecopy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            //copy a directory (but will remain empty)
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

            //Delete a file
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "filecopy.txt");
//            Files.deleteIfExists(fileToDelete);

            //Creating a file
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);

            //Create a Directory
//            Path DirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(DirToCreate);

            //Create nested Directories
//              Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2/Dir3/Dir4/Dir5/Dir6");
//              Files.createDirectories(dirToCreate);

            //Get File Attributes
            Path filedata = FileSystems.getDefault().getPath("Examples", "file1.txt");
            long size = Files.size(filedata);
            System.out.println("Size = " + size);
            System.out.println("Last Modified " + Files.getLastModifiedTime(filedata));

            BasicFileAttributes attrs = Files.readAttributes(filedata, BasicFileAttributes.class);
            System.out.println("Size " + attrs.size() );
            System.out.println("Last Modified " + attrs.lastModifiedTime());
            System.out.println("Created " + attrs.creationTime());
            System.out.println("Is Directory " + attrs.isDirectory());
            System.out.println("Is regular file " + attrs.isRegularFile());


        }catch(IOException e){
            System.out.println(e.getMessage());

        }



//        //Checking paths and directories
//        //curent directory
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
//        //sub folder
////        Path filePath = FileSystems.getDefault().getPath("files", "SubDirectoryFile.txt");
//        Path filePath = Paths.get(".","files", "SubDirectoryFile.txt");
//        printFile(filePath);
//
//        //outside curent directrory
//        Path filePath2 = Paths.get("/Users/anantchohan","Documents", "WorkingDirectory.txt");
//        printFile(filePath2);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubDirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        //this will still output regardless of weather file exists or not
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesentexits.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        //this will still output regardless of weather path exists or not
//        Path path4 = Paths.get("Users/test/INF", "whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        //this checks if directory exists.
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists " + Files.exists(filePath));
//        System.out.println("Exisits "  + Files.exists(path4));


    }

    private static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){
            String line;
            while((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
