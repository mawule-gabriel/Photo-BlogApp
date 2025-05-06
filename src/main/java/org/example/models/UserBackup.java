package org.example.models;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.time.Instant;

@DynamoDbBean
public class UserBackup {

    private String sub;
    private String email;
    private String givenName;
    private String familyName;
    private Instant backupTimestamp;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("sub")
    public String getSub(){
        return sub;
    }

    public void setSub(String sub){
        this.sub = sub;
    }

    @DynamoDbAttribute("email")
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @DynamoDbAttribute("givenName")
    public String getGivenName(){
        return givenName;
    }

    public void setGivenName(String givenName){
        this.givenName = givenName;
    }

    @DynamoDbAttribute("familyName")
    public String getFamilyName(){
        return familyName;
    }

    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    public Instant getBackupTimestamp(){
        return backupTimestamp;
    }

    public void setBackupTimestamp(Instant backupTimestamp){
        this.backupTimestamp = backupTimestamp;
    }



}
