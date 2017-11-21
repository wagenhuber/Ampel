
class Model {

    private final Presenter presenter;
    private Ampelphase phase;

    Model(Presenter presenter) {
        this.presenter = presenter;
        phase = Ampelphase.ROT;
        presenter.displayPhase(phase);
    }

    void weiter() {
        switch (phase) {
            case ROT:
                phase = Ampelphase.ROTGELB;
                break;
            case ROTGELB:
                phase = Ampelphase.GRUEN;
                break;
            case GRUEN:
                phase = Ampelphase.GELB;
                break;
            case GELB:
                phase = Ampelphase.ROT;
                break;
        }
        presenter.displayPhase(phase);
    }

}
