package com.mycom.myapp.upload.model;

import java.sql.Timestamp;

public class UploadFileVO {
	
	private int fileId;
	private String directoryName;
	private String fileName;
	private long fileSize;
	private String fileContentType;
	private Timestamp fileploadDate;
	private byte[] fileData;
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getDirectoryName() {
		return directoryName;
	}
	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public Timestamp getFileploadDate() {
		return fileploadDate;
	}
	public void setFileploadDate(Timestamp fileploadDate) {
		this.fileploadDate = fileploadDate;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	
}