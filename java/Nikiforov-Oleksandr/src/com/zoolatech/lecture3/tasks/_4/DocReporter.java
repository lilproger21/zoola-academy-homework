package com.zoolatech.lecture3.tasks._4;

public class DocReporter extends Reporter {
    private final String format = " in DOC format";
    public DocReporter(String headerData, String fileData, String fileName) {
        super(headerData, fileData, fileName+".docx");
    }

    @Override
    public void addHeaderData(){
        super.addHeaderData();
        System.out.println(format);
    }

    public void addFileData(){
        super.addFileData();
        System.out.println(format);
    }
}
