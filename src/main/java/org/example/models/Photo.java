package org.example.models;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.time.Instant;

@DynamoDbBean
public class Photo {
    private String userId;
    private String imageId;
    private String fileName;
    private String s3Key;
    private String uploadDate;
    private String status;
    private boolean isDeleted;
    private Instant deletionDate;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("userId")
    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    @DynamoDbAttribute("imageId")
    public String getImageId(){
        return imageId;
    }

    public void setImageId(String imageId){
        this.imageId = imageId;
    }

    @DynamoDbAttribute("fileName")
    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    @DynamoDbAttribute("s3Key")
    public String getS3Key(){
        return s3Key;
    }

    public void setS3Key(String s3Key){
        this.s3Key = s3Key;
    }

    @DynamoDbAttribute("uploadDate")
    public String getUploadDate(){
        return uploadDate;
    }

    public void setUploadDate(String uploadDate){
        this.uploadDate = uploadDate;
    }

    @DynamoDbAttribute("status")
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    @DynamoDbAttribute("isDeleted")
    public boolean isDeleted(){
        return isDeleted;
    }

    public void setDeleted(boolean deleted){
        isDeleted = deleted;
    }

    @DynamoDbAttribute("deletionDate")
    public Instant getDeletionDate() {
        return deletionDate;
    }

    public void setDeletionDate(Instant deletionDate){
        this.deletionDate = deletionDate;
    }

}
