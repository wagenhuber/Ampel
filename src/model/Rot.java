package model;

public class Rot implements Zustand {

    private Model model;


    public Rot(Model model) {
        this.model = model;
        model.setPhase(Ampelphase.ROT);
    }

    @Override
    public void weiter() {
        model.setZustand(new RotGelb(model));
        System.out.println("weiter zu RotGelb");
    }

}
