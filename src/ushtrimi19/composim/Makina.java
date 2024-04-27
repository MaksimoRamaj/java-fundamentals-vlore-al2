package ushtrimi19.composim;

public class Makina {

    static {
        System.out.println("Brenda bllokut statik!");
    }

    static class CdPlayer{
        String brandi;
    }

    private Motorri motorri;
    private String brandi;

    public Makina(Motorri motorri, String brandi) {
        this.motorri = motorri;
        this.brandi = brandi;
    }

    public Motorri getMotorri() {
        return motorri;
    }

    public void setMotorri(Motorri motorri) {
        this.motorri = motorri;
    }

    public String getBrandi() {
        return brandi;
    }

    public void setBrandi(String brandi) {
        this.brandi = brandi;
    }
}
