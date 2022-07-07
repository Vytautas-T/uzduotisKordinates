public class Kordinates {
    private double x;
    private double y;

    public Kordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void swap(){
        double keiciamasis;
        keiciamasis = y;
        y = x;
        x = keiciamasis;
    }

    public  static double atstumasTarpKordinaciu(Kordinates pirmaKordinate,Kordinates antraKordinate){
        double x1,x2,y1,y2;
        x1 = pirmaKordinate.getX();
        y1 = antraKordinate.getY();
        double atstumas;
        atstumas = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return atstumas;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Kordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
