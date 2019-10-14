package com.codefactory.testrx.data;

import com.codefactory.testrx.model.BadGuy;
import com.codefactory.testrx.model.Crime;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    public static List<BadGuy> prepareData() {
        List<BadGuy> data = new ArrayList<>();
        data.add(new BadGuy(21, "Frank", 1));
        data.add(new BadGuy(22, "Ann", 1));
        data.add(new BadGuy(23, "Julius", 2));
        data.add(new BadGuy(24, "Zed", 3));
        data.add(new BadGuy(25, "Sony", 4));
        return data;
    }

    public static List<Crime> prepareCrimeData(){
        List<Crime> data = new ArrayList<>();
        data.add(new Crime(1, "Theft", "the description of the theft"));
        data.add(new Crime(2, "kidnapping", "the description of the kidnapping"));
        data.add(new Crime(3, "murder", "the description of the murder"));
        data.add(new Crime(4, "drugs", "the description of the drugs"));
        data.add(new Crime(5, "gambling", "the description of the gambling"));
        return data;
    }
}
