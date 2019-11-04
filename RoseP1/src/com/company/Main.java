package com.company;

import java.io.*;

import java.util.Scanner;


class Application {
    public static void main(String[] args) {
        new DuplicateRemover();

            }
}

class DuplicateRemover {

    public void remove(String dataFile) {
        System.out.println("file read.");
    }

    //This method will write the contents of Set to the ouytput file
    public void Write(String outputFile) throws FileNotFoundException {
        outputFile = new String(outputFile);
        new Scanner(outputFile);
         outputFile.close();
        System.out.println("Data Written to File");

    }
}