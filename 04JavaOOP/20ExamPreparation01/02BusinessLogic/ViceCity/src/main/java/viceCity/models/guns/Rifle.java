package viceCity.models.guns;

public class Rifle extends BaseGun {
    public static final int BULLETS_PER_BARREL = 50;
    //private int bullets;

    public Rifle(String name) {
        super(name, BULLETS_PER_BARREL, 500);
        //this.bullets = BULLETS_PER_BARREL;
    }
    @Override
    public int fire() {
        if (getBulletsPerBarrel() == 0 && getTotalBullets() > 0) {
            reload();
        }
        if (getBulletsPerBarrel()>0) {
            setBulletsPerBarrel(getBulletsPerBarrel()-5);
        }
        return 5;
    }

    private void reload() {
        setBulletsPerBarrel(getTotalBullets() - BULLETS_PER_BARREL);
        setBulletsPerBarrel(BULLETS_PER_BARREL);
    }

//    @Override
//    public int fire() {
//        if (!canFire()) {
//            //TODO
//        }
//        bullets -= 5;
//        if (bullets == 0) {
//            reload();
//        }
//        return 5;
//    }
//
//    private void reload() {
//        setBulletsPerBarrel(getTotalBullets() - BULLETS_PER_BARREL);
//        bullets = BULLETS_PER_BARREL;
//
//    }
}
