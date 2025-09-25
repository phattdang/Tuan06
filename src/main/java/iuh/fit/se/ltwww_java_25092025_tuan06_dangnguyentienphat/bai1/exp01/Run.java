package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp01;

public class Run {
    public static void main(String[] args) {
        ICEngine engine = new ICEngine();
        Car car = new Car(engine);
        car.start();
    }
}
