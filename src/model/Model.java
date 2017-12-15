package model;

import presenter.Presenter;


public class Model {

    private Presenter presenter;
    private Ampelphase phase;
    private Zustand zustand;

    public Model(Presenter presenter) {
        this.presenter = presenter;
        phase = Ampelphase.ROT;
        zustand = new Rot(this);
        presenter.displayPhase(phase);
    }

    public void weiter() {
        //Delegation an konkreten Zusand
        zustand.weiter();
        /*switch (phase) {
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
        }*/
        presenter.displayPhase(phase);
    }

    public void setZustand(Zustand zustand) {
        this.zustand = zustand;

    }

    public void setPhase(Ampelphase phase){
        this.phase = phase;
    }

}
