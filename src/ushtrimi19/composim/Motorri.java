package ushtrimi19.composim;

public class Motorri {
    private int numriPistonave;
    private int kuajFuqi;
    private String marka;

    public Motorri(int numriPistonave, int kuajFuqi, String marka) {
        this.numriPistonave = numriPistonave;
        this.kuajFuqi = kuajFuqi;
        this.marka = marka;
    }

    public int getNumriPistonave() {
        return numriPistonave;
    }

    public void setNumriPistonave(int numriPistonave) {
        this.numriPistonave = numriPistonave;
    }

    public int getKuajFuqi() {
        return kuajFuqi;
    }

    public void setKuajFuqi(int kuajFuqi) {
        this.kuajFuqi = kuajFuqi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
