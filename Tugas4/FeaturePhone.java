package Tugas4;

public class FeaturePhone extends Handphone {

    public FeaturePhone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("FeaturePhone " + merk + " " + model + " dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("FeaturePhone " + merk + " " + model + " dimatikan.");
    }

    @Override
    public void telepon(String nomor) {
        System.out.println("FeaturePhone " + merk + " " + model + " menelepon ke nomor " + nomor);
    }

    public void mainGameSnake() {
        System.out.println("FeaturePhone " + merk + " " + model + " sedang memainkan game Snake.");
    }
}
