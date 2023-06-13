package geometri;


public class Lingkaran {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}
