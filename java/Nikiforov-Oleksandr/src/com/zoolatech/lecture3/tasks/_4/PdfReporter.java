package com.zoolatech.lecture3.tasks._4;

public class PdfReporter extends Reporter {
    private static final String FORMAT = " in PDF format";
    public PdfReporter(String headerData, String fileData, String fileName) {
        super(headerData, fileData, fileName+".pdf");
    }

    @Override
    public void addHeaderData(){
        super.addHeaderData();
        System.out.println(FORMAT);
    }

    public void addFileData(){
        super.addFileData();
        System.out.println(FORMAT);
    }
}
