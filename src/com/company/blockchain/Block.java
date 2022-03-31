package com.company.blockchain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Date;

public class Block {

    private String hash;
    private String data;
    private String previousHash;
    private long time;

    public Block(String data, String previousHash) {
        this.hash = calculateHash();
        this.data = data;
        this.previousHash = previousHash;
        this.time = new Date().getTime();
        System.out.println(hash);
    }

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String calculateHash() {
        String data = previousHash + time + this.data;
        MessageDigest digest = null;
        byte[] arr = null;

        try {
            digest = MessageDigest.getInstance("SHA-256");
            arr = digest.digest(data.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error");
        }

        StringBuffer buffer = new StringBuffer();

        for (byte b : arr) {
            String hex = Integer.toHexString(0xff & b);

            if (hex.length() == 1) {
                buffer.append("0");
            } else {
                buffer.append(hex);
            }
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        return "Block{" +
                "hash='" + hash + '\'' +
                ", data='" + data + '\'' +
                ", previousHash='" + previousHash + '\'' +
                ", time=" + time +
                '}';
    }
}
