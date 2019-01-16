package com.example.FilesClass;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class GetFiles {
    public static void main(String[] args){
//        Path dir= Paths.get("./src/main/java/com/example/wenben.txt");
        Path dir=FileSystems.getDefault().getPath("./src/main/java/com/example/wenben.txt");
        System.out.println(dir.getFileName());
        try {
            Files.createFile(dir);
        }catch (IOException e){
            e.getMessage();
        }
//        try{
//            DirectoryStream<Path> stream= Files.newDirectoryStream(dir,"*");
//            Files.walkFileTree(dir,new FindFiles());
//
//            System.out.println("\n-------------------------------\n");
//            for(Path entry:stream){
//                System.out.println(entry.getFileName());
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//            e.getMessage();
//        }

    }
    public  static class FindFiles extends SimpleFileVisitor<Path> {
        @Override
        public  FileVisitResult visitFile(Path file, BasicFileAttributes attributes){
//            if(file.toString().endsWith(".java")){
                System.out.println(file.getFileName());
//            }
            return FileVisitResult.CONTINUE;
        }
    }

}
