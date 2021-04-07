package viceCity.models.guns;

public class Pistol extends BaseGun {
    public static final int BULLETS_PER_BARREL = 10;
    //private int bullets;

    public Pistol(String name) {
        super(name, BULLETS_PER_BARREL, 100);
        //this.bullets = BULLETS_PER_BARREL;
    }

    @Override
    public int fire() {
        if (getBulletsPerBarrel() == 0 && getTotalBullets() > 0) {
            reload();
        }
        if (getBulletsPerBarrel()>0) {
            setBulletsPerBarrel(getBulletsPerBarrel()-1);
        }
        return 1;
    }

    private void reload() {
        setBulletsPerBarrel(getTotalBullets() - BULLETS_PER_BARREL);
        setBulletsPerBarrel(BULLETS_PER_BARREL);
    }
}
