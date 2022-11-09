import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercice1NonStatique {

    ArrayList<ModuleEnseignementNonStatique> tab_enseignement;

    class ConsumerUE implements Consumer<ModuleEnseignementNonStatique> {
        @Override
        public void accept(ModuleEnseignementNonStatique m) {
            System.out.println("le nom du module est " + m.getNomDuModule() + " et l'année de création initiale est ==> " + m.getAnneeDeCreation());
            m.setAnneeDeCreation(m.getAnneeDeCreation() + 1);
            System.out.println("le nom du module est " + m.getNomDuModule() + " et l'année de création modifié est ==> " + m.getAnneeDeCreation());

        }
    }

    class ConsumerUE2 implements Consumer<ModuleEnseignementNonStatique> {
        @Override
        public void accept(ModuleEnseignementNonStatique m) {
            System.out.println("le nom du module est " + m.getNomDuModule() + " et l'enseignant est : " + m.getNomDeLEnseignant());
            if (m.getNomDeLEnseignant().equals("M.Dupont")) {
                m.setAnneeDeCreation(m.getAnneeDeCreation() + 1);
                System.out.println("Le module " + m.getNomDuModule() + " a été modifié");
            } else {
                System.out.println("Le module " + m.getNomDuModule() + " n'a pas été modifié");
            }

        }

    }



    class ConsumerUE3 implements Consumer<ModuleEnseignementNonStatique> {
        @Override
        public void accept(ModuleEnseignementNonStatique m) {
            System.out.println("le nom du module est " + m.getNomDuModule() + " et le type de controle est : " + m.getTypeDeControle());
            if (m.getTypeDeControle() == ModuleEnseignementNonStatique.TypeExercice.QCM) {
                m.setIsRattrapge(false);
                System.out.println("le  Module  " + m.getNomDuModule() + " a été modifié");
            } else {
                System.out.println("Pas de modification du rattrapage");
            }

        }

    }

    public Exercice1NonStatique (ArrayList<ModuleEnseignementNonStatique> t){
        this.tab_enseignement = t;
    }

    public static void main(String[] args) throws Exception {
        Exercice1NonStatique exo = new Exercice1NonStatique(new ArrayList<ModuleEnseignementNonStatique>());

        exo.tab_enseignement.add(new ModuleEnseignementNonStatique("Module 1", 2010, "Diplome 1", "M.Dupont", ModuleEnseignementNonStatique.TypeExercice.QCM, true));
        exo.tab_enseignement.add(new ModuleEnseignementNonStatique("Module 2", 2011, "Diplome 2", "M.Dupond", ModuleEnseignementNonStatique.TypeExercice.Projet, false));
        exo.tab_enseignement.add(new ModuleEnseignementNonStatique("Module 3", 2012, "Diplome 3", "M.Dupont", ModuleEnseignementNonStatique.TypeExercice.questionsSynthese, true));
        exo.tab_enseignement.add(new ModuleEnseignementNonStatique("Module 4", 2013, "Diplome 4", "M.Dupond", ModuleEnseignementNonStatique.TypeExercice.QCM, true));

        System.out.println("Question 1.1");
        exo.tab_enseignement.forEach(exo.new ConsumerUE());
        System.out.println("Question 1.2");
        exo.tab_enseignement.forEach(exo.new ConsumerUE2());
        System.out.println("Question 1.3");
        exo.tab_enseignement.forEach(exo.new ConsumerUE3());
    }
}
