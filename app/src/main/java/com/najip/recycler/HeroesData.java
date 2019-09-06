package com.najip.recycler;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Ahmad Dahlan",
            "Ahmad Yani",
            "Sutomo",
            "Gatot Soebroto",
            "Ki Hadjar Dewantarai",
            "Mohammad Hatta",
            "Soedirman",
            "Soekarno",
            "Soepomo",
            "Tan Malaka"
    };
    private static String[] heroDetails = {
            "bismillah",
            "bismillah",
            "bismillah",
            "bismillah",
            "bismillah",
            "bismillah",
            "bismillah",
            "bismillah",
            "bismillah",
            "bismillah"
    };
    private static int[] heroImages = {
            R.drawable.maschio,
            R.drawable.maschio,
            R.drawable.maschio,
            R.drawable.maschio,
            R.drawable.maschio,
            R.drawable.maschio,
            R.drawable.maschio,
            R.drawable.maschio,
            R.drawable.maschio,
            R.drawable.maschio
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position<heroNames.length;position++){
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroImages[position]);
            list.add(hero);
        }
        return list;
    }
}
