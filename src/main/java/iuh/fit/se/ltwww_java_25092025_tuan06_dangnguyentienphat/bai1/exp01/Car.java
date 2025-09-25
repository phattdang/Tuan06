package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp01;

public class Car {
    private ICEngine engine;

    public Car(ICEngine engine) {
        super();
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}
