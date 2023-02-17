package chapter17;
@FunctionalInterface
public interface Instrument {
    void play();

    default Instrument jump(Instrument i) {
        return i;
    }


}
