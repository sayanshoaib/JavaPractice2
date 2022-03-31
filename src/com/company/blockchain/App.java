package com.company.blockchain;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        blockchain.add(new Block("Hello", "0"));
        blockchain.add(new Block("Hey", blockchain.get(blockchain.size() - 1).getHash()));
        blockchain.add(new Block("Subscribe My Channel", blockchain.get(blockchain.size() - 2).getHash()));
        System.out.println(isValid());

        for (Block block : blockchain) {
            System.out.println(block);
        }
    }

    public static boolean isValid() {
        Block current, previous;

        for (int i = 1; i < blockchain.size(); i++) {
            current = blockchain.get(i);
            previous = blockchain.get(i - 1);

            if (!current.getHash().equals(current.calculateHash())) {
                System.out.println("Hash not match");
                return false;
            }

            if (!current.getPreviousHash().equals(previous.getHash())) {
                System.out.println("Previous Hash not match");
                return false;
            }
        }
        return true;
    }
}
