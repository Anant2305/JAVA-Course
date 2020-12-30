package com.example.seatandhashsets;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        //Add filter for file directory contents
//        DirectoryStream.Filter<Path> filter =
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path path) throws IOException {
//                        return (Files.isRegularFile(path));
//                    }
//                };

        //Above as Lambda
        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

        //read directories and all enclosed contents
        //Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2"); //using current systems seperators
        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)){
            for(Path file: contents){
                System.out.println(file.getFileName());
            }
        }catch(IOException | DirectoryIteratorException e){
            System.out.println(e.getMessage());
        }

        //How to get a systems separators to see if using on MAc/Unix or windows
        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        //create a temp file
        try{
            Path tempFile = Files.createTempFile("myapp", ".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //Get File storage path
        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store : stores) {
            System.out.println("Volume Name/Drive letter = " + store);
            System.out.println("File Store = " + store.name());
        }

        System.out.println("*************************");
        Iterable<Path> rootpaths = FileSystems.getDefault().getRootDirectories();
        for(Path path : rootpaths) {
            System.out.println(path);
        }

        System.out.println("-----Walking Tree for DIR2--------");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------Copy Dir2 to Dir4/Dir2--------");
        Path copyPath = FileSystems.getDefault().getPath("fileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");

        try{
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //Mapping Common IO with Java NIO
        File file = new File("Examples/file.txt");
        Path convertedPath = file.toPath();
        System.out.println("ConvertedPath = " + convertedPath);

        File parent = new File("/Example");
        File resolvedFile = new File(parent, "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("Examples", "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("Examples");
        Path childRelativePath = Paths.get("dir/file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working Directory = " + workingDirectory.getAbsolutePath());

        System.out.println("------- Print Dir1 contents using list()---------");
        File dir2File = new File(workingDirectory, "FileTree/Dir2");
        String[] dir2Contents = dir2File.list();
        for(int i=0; i< dir2Contents.length; i++){
            System.out.println("i= " + i + ": " + dir2Contents[i]);
        }

        System.out.println("------ Print Dir2 Contents using listfiles() --------");
        File[] dir2Files = dir2File.listFiles();
        for(int i=0; i< dir2Files.length; i++){
            System.out.println("i= " + i + ": " + dir2Files[i].getName());
        }


    }
}
