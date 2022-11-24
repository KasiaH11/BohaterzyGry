public class Hero {
    private String name;
    private String ablities;
    private int lvl;
    private double damage;
    private boolean fame;

    public Hero(String name, String ablities, int lvl, double damage, boolean fame) {
        this.name = name;
        this.ablities = ablities;
        this.lvl = lvl;
        this.damage = damage;
        this.fame = fame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAblities() {
        return ablities;
    }

    public void setAblities(String ablities) {
        this.ablities = ablities;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public boolean getFame() {
        return fame;
    }

    public void setFame(boolean fame) {
        this.fame = fame;
    }
    public double damagePerSecond(){
        return damage*lvl;


    }
}