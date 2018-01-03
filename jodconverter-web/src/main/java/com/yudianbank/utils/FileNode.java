package com.yudianbank.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
/**
 * 文件节点(区分文件上下级)
 */
public class FileNode{

    private String originName;
    private String fileName;
    private String parentFileName;
    private boolean directory;

    private List<FileNode> childList;

//FileNode -> Object

    public FileNode(String originName, String fileName, String parentFileName, List<FileNode> childList, boolean directory) {
        this.originName = originName;
        this.fileName = fileName;
        this.parentFileName = parentFileName;
        this.childList = childList;
        this.directory = directory;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getParentFileName() {
        return parentFileName;
    }

    public void setParentFileName(String parentFileName) {
        this.parentFileName = parentFileName;
    }

    public List<FileNode> getChildList() {
        return childList;
    }

    public void setChildList(List<FileNode> childList) {
        this.childList = childList;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public boolean isDirectory() {
        return directory;
    }

    public void setDirectory(boolean directory) {
        this.directory = directory;
    }
}