package com.zoolatech.lecture3.tasks._4;

/*
Create three classes CsvReporter, PdfReporter and DocReporter
which are able to create files with tabular data in CSV, PDF and DOC formats accordingly.
Each class needs to accept three strings during an object construction
(header data, file data and file name) and have a method called generate.
The method needs to create a new file, add header data in an appropriate format (CSV, PDF, DOC),
add file data in an appropriate format and close a file.
You don’t need to work with files directly:
to complete the task you can just print statements like
“Opening a file test.txt” or “Adding file details in CSV format” for each action.
Try to minimize duplicated code between classes
(note, that in a real world multiple statements might be needed to perform these tasks).
 */

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose format:");
        System.out.println("1 : .csv,\n2: .pdf,\n3: .doc");
        switch (scanner.nextInt()) {
            case 1: {
                System.out.println("Type file data, file name for .cvs file");
                CsvReporter csvReporter = new CsvReporter(".cvs", scanner.next(), scanner.next());
                csvReporter.generate();
            }
            case 2: {
                System.out.println("Type file data, file name for .pdf file");
                PdfReporter pdfReporter = new PdfReporter(".pdf", scanner.next(), scanner.next());
                pdfReporter.generate();
            }
            case 3: {
                System.out.println("Type file data, file name for .doc file");
                DocReporter docReporter = new DocReporter(".doc", scanner.next(), scanner.next());
                docReporter.generate();
            }
        }
    }

    public void tabularData(String headerData, String fileData, String fileName) {
        System.out.println("Opening a file test.txt");
        int[][] data = new int[3][1];
        for (int[] integer : data) {
            if (integer == data[0]) {
                System.out.println("Adding header data");
                System.out.print("|---");
                for (int i : integer) {
                    String s = String.valueOf(i);
                    System.out.print(headerData);
                }
                System.out.println("---|");
            } else if (integer == data[1]) {
                System.out.println("Adding file data");
                System.out.print("|---");
                for (int i : integer) {
                    String s = String.valueOf(i);
                    System.out.print(fileData);
                }
                System.out.println("---|");
            } else if (integer == data[2]) {
                System.out.println("Adding file name");
                System.out.print("|---");
                for (int i : integer) {
                    String s = String.valueOf(i);
                    System.out.print(fileName);
                }
                System.out.println("---|");
            }
        }
        System.out.println("\nFile format and name: " + fileName + headerData + "\nFile data is: " + fileData);
    }
}

sealed class Reported permits CsvReporter, PdfReporter, DocReporter {
    String headerData;
    String fileData;
    String fileName;
    Number4 number4 = new Number4();

    public Reported(String headerData, String fileData, String fileName) {
        this.headerData = headerData;
        this.fileData = fileData;
        this.fileName = fileName;
    }

    public void generate() {
        number4.tabularData(headerData, fileData, fileName);
    }
}

non-sealed class CsvReporter extends Reported {

    public CsvReporter(String headerData, String fileData, String fileName) {
        super(headerData, fileData, fileName);
    }

    public void generate() {
        number4.tabularData(headerData, fileData, fileName);
    }
}

non-sealed class PdfReporter extends Reported {

    public PdfReporter(String headerData, String fileData, String fileName) {
        super(headerData, fileData, fileName);
    }

    public void generate() {
        number4.tabularData(headerData, fileData, fileName);
    }
}

non-sealed class DocReporter extends Reported {

    public DocReporter(String headerData, String fileData, String fileName) {
        super(headerData, fileData, fileName);
    }

    public void generate() {
        number4.tabularData(headerData, fileData, fileName);
    }
}