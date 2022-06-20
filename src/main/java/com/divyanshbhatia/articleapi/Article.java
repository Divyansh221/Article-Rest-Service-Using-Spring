package com.divyanshbhatia.articleapi;

import org.springframework.stereotype.Component;

public class Article {
    private Long id;
    private String fileName;
    private String filePath;
    private String fileContent;

    public Article(Long id, String fileName, String filePath, String fileContent) {
        this.id = id;
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileContent = fileContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id =" + id +
                ", fileName ='" + fileName + '\'' +
                ", filePath ='" + filePath + '\'' +
                ", fileContent ='" + fileContent + '\'' +
                '}';
    }
}
