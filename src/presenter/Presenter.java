package presenter;


import model.*;
import view.PassiveView;


public class Presenter {

    private final PassiveView view;
    private final Model model;

    public Presenter(PassiveView view) {
        this.view = view;
        model = new Model(this);
    }

    public void buttonWeiter() {
        model.weiter();
    }

    public void displayPhase(Ampelphase phase) {
        switch (phase) {
            case ROT:
                view.rotAn();
                view.gelbAus();
                view.gruenAus();
                break;
            case ROTGELB:
                view.rotAn();
                view.gelbAn();
                view.gruenAus();
                break;
            case GRUEN:
                view.rotAus();
                view.gelbAus();
                view.gruenAn();
                break;
            case GELB:
                view.rotAus();
                view.gelbAn();
                view.gruenAus();
                break;
        }
    }

}
