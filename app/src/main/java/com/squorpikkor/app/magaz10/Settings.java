package com.squorpikkor.app.magaz10;

//  Created by Squorpikkor on 13.03.2017.

public class Settings {
    private int krotCount;
    private int montazCount;
    private int sborkaCount;
    private int korelinCount;
    private int othersCount;

    private double bigJuicePrice;
    private double bigMilkPrice;
    private double smallJuicePrice;
    private double smallMilkPrice;

    //region GETTER & SETTERS

    public void setKrotCount(int krotCount) {
        this.krotCount = krotCount;
    }

    public void setMontazCount(int montazCount) {
        this.montazCount = montazCount;
    }

    public void setSborkaCount(int sborkaCount) {
        this.sborkaCount = sborkaCount;
    }

    public void setKorelinCount(int korelinCount) {
        this.korelinCount = korelinCount;
    }

    public void setOthersCount(int othersCount) {
        this.othersCount = othersCount;
    }

    public void setBigJuicePrice(double bigJuicePrice) {
        this.bigJuicePrice = bigJuicePrice;
    }

    public void setBigMilkPrice(double bigMilkPrice) {
        this.bigMilkPrice = bigMilkPrice;
    }

    public void setSmallJuicePrice(double smallJuicePrice) {
        this.smallJuicePrice = smallJuicePrice;
    }

    public void setSmallMilkPrice(double smallMilkPrice) {
        this.smallMilkPrice = smallMilkPrice;
    }

    public int getJuiceCount() {
        return juiceCount;
    }
    //endregion

    private int juiceCount = krotCount + montazCount + sborkaCount + korelinCount + othersCount;

}
