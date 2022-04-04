package protagonistes;

import affrontement.Bataille;
import armes.Arme;
import armes.Epee;

public class Homme extends EtreVivant {

    protected Arme maPossession;

    public Homme(String nom) {
        super(nom, 100);
    }

    public String parler(String s) {
        return nom + ": " + s + "\n";
    }

    public String rejointBataille(Bataille bataille) {
        super.rejointBataille(bataille);
        return bataille.ajouter(this);
    }

    public String mourir() {
        return "c’est ainsi que le courageux " + nom + " mourut\n" +
                bataille.eliminer(this) + this.lacher();

    }

    public String lacher() {
        if (maPossession != null) {
            maPossession.lacher();
            return (super.getNom() + " a lâché son " + maPossession.getNature() + "\n");
        }
            maPossession = null;
            return "Personne ne peut lacher cette arme car personne ne la possède !\n";

    }

    public String prendre(Arme arme) {
        if (maPossession != null) {
            this.lacher();
        }
        if (arme.estPris()) {
            this.lacher();
            Homme proprietaire = arme.getProprietaire();
            maPossession = arme;
            arme.setProprietaire(this);
            return (this.getNom() + " : " + proprietaire.getNom() + " peux tu me laisser ton "
                    + arme.getNature() + " ? \n" +
                    proprietaire.getNom()+" : Pas de soucis, cela me permettra de reprendre mon souffle. \n")
                    + (super.getNom() + " je prends mon " + arme.getNature() + ".\n");
        }

        if(arme instanceof Epee) {
           return prendreEpee((Epee)arme)+(super.getNom() + " je prends mon " + arme.getNature() + ".\n");
        }

        arme.estPris();
        maPossession = arme;
        arme.setProprietaire(this);
        return (super.getNom() + " je prends mon " + arme.getNature() + ".\n");
    }

    public String combattre(Dragon dragon) {
        if (maPossession != null) {
            return maPossession.attaque(dragon);

        } else {
            return super.getNom() + " s’attaque sans aucune arme à " + dragon.getNom() + "\n" +
                    this.mourir();
        }
    }
    public String prendreEpee (Epee epee) {
        if (this.vie <=0)
        {
            this.mourir();
            return this.getNom()+" a voulu prendre l'épée mais son état de fatigue ne lui permettait pas cet ultime effort, il en est mort. \n";
        }
        this.subirAttaque(this, 10);
        return "Je prends l'épée même si pour cela je dois perdre des forces. \n";
    }
}
