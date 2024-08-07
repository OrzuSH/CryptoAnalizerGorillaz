package com.javarush.shosafoev.constant;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

public class Alphabet {


    private char symbol;
    private int i;

    public Alphabet() {
        int counter = 0;
        char[] alphabet = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
                'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'ъ', 'ы', 'ь', 'э', 'ю', 'я',
                '.', ',', '«', '»', '"', '\n', ':', '!', '?', ' '};
        AtomicReference<Map<Integer, Character>> alphabetMap = new AtomicReference<>(new TreeMap<>());
        for (char symbol : alphabet) {
            alphabetMap.get().put(counter, symbol);
            counter++;
        }
    }

    public int length() {
        return 0;
    }

    public int getIndexByValue() {
        return 0;
    }



    public char getSymbolByIndex() {
        return 0;
    }

    public boolean isSymbolExists(char symbol) {
        this.symbol = symbol;

        return false;
    }

    public char getSymbolByIndex(int i) {
        this.i = i;

        return 0;
    }
}