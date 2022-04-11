package com.jmonclus.problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Problem url: https://projecteuler.net/problem=22
 * 
 * @author Josep Monclus
 */
public class Problem0022 {
    public static void main(String[] args) {
        List<String> alphabet = getAlphabet();
        List<String> names = getNamesList();
        Collections.sort(names);

        System.out.println(alphabet.size());
        System.out.println(names.size());


        String name = "COLIN";
        char[] nameCharArray = name.toCharArray();

        int sumCharPositions = 0;
        for(char c : nameCharArray) {
            sumCharPositions += alphabet.indexOf(Character.toString(c)) + 1;
        }

        System.out.println(sumCharPositions);
        System.out.println(names.indexOf(name));
    }

    private static List<String> getAlphabet() {
        List<String> alphabet = new ArrayList<>();
        alphabet.add("A");
        alphabet.add("B"); 
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");
        alphabet.add("I");
        alphabet.add("J");
        alphabet.add("K");
        alphabet.add("L");
        alphabet.add("M");
        alphabet.add("N");
        alphabet.add("O");
        alphabet.add("P");
        alphabet.add("Q");
        alphabet.add("R");
        alphabet.add("S");
        alphabet.add("T");
        alphabet.add("U");
        alphabet.add("V");
        alphabet.add("W");
        alphabet.add("X");
        alphabet.add("Y"); 
        alphabet.add("Z");

        return alphabet;
    }

    private static List<String> getNamesList() {
        String[] source = {};

        try{
            File namesFile = new File("resources\\Problem0022_names.txt");
            Scanner namesReader = new Scanner(namesFile);
            if (namesReader.hasNextLine()) {
                String data = namesReader.nextLine();
                source = data.split(",");
            }
            namesReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return Arrays.asList(source);
    }
}
