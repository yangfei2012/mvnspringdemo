package com.springapp.mvc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DServiceImpl implements DService {

    @Override
    public String printWord(String word) {
        String outWord = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS").format(new Date()) + word;
        System.out.println(outWord);
        return outWord;
    }
}
