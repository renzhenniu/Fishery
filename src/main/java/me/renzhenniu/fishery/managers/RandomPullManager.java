package me.renzhenniu.fishery.managers;

import java.util.Random;

public class RandomPullManager {

    Random rnd = new Random();

    public int getFish() {
        int r = this.rnd.nextInt(2986);
        if (r <= 1000) {
            return r <= 200 ? 1 : r <= 400 ? 2 : r <= 550 ? 3 : r <= 700 ? 4 : r <= 850 ? 5 : 6;
        } else if (r <= 1870) {
            return r <= 1150 ? 7 : r <= 1300 ? 8 : r <= 1450 ? 9 : r <= 1600 ? 10 : r <= 1750 ? 11 : 12;
        } else if (r <= 2450) {
            return r <= 1980 ? 13 : r <= 2090 ? 14 : r <= 2200 ? 15 : r <= 2290 ? 16 : r <= 2380 ? 17 : 18;
        } else if (r <= 2730) {
            return r <= 2520 ? 19 : r <= 2590 ? 20 : r <= 2630 ? 21 : r <= 2670 ? 22 : r <= 2700 ? 23 : 24;
        } else if (r <= 2866) {
            return r <= 2760 ? 25 : r <= 2783 ? 26 : r <= 2806 ? 27 : r <= 2826 ? 28 : r <= 2846 ? 29 : 30;
        } else if (r <= 2966) {
            return r <= 2886 ? 31 : r <= 2906 ? 32 : r <= 2921 ? 33 : r <= 2936 ? 34 : 35;
        } else {
            return r <= 2976 ? 37 : r <= 2981 ? 38 : r <= 2984 ? 39 : 40;
        }
    }

    public int getCrate() {
        int r = this.rnd.nextInt(13);
        switch (r) {
            default:
                return 1;
            case 5:
            case 6:
            case 7:
                return 2;
            case 8:
            case 9:
                return 3;
            case 10:
            case 11:
                return 4;
            case 12:
                return 5;
        }
    }

    public int getItem() {
        int r = this.rnd.nextInt(11);
        switch (r) {
            default:
                return 1;
            case 5:
            case 6:
            case 7:
                return 2;
        }

    }
}