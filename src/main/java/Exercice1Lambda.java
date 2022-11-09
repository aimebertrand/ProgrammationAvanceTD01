import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercice1Lambda {


    ArrayList<ModuleEnseignementNonStatique> tab_enseignement;


    public void initConsumers() throws Exception {
        System.out.println("Question 1.1");
        Consumer<ModuleEnseignementNonStatique> ConsumerUE = (ModuleEnseignementNonStatique m) -> {
            System.out.println("le nom du module est " + m.getNomDuModule() + " et l'année de création initiale est ==> " + m.getAnneeDeCreation());
            m.setAnneeDeCreation(m.getAnneeDeCreation() + 1);
            System.out.println("le nom du module est " + m.getNomDuModule() + " et l'année de création modifié est ==> " + m.getAnneeDeCreation());
        };
        tab_enseignement.forEach(ConsumerUE);

        // #########################################################################################################################################

        System.out.println("Question 1.2");

        Consumer<ModuleEnseignementNonStatique> ConsumerUE2 = (ModuleEnseignementNonStatique m) -> {
            System.out.println("le nom du module est " + m.getNomDuModule() + " et l'enseignant est : " + m.getNomDeLEnseignant());
            if (m.getNomDeLEnseignant().equals("M.Dupont")) {
                m.setAnneeDeCreation(m.getAnneeDeCreation() + 1);
                System.out.println("Le module " + m.getNomDuModule() + " a été modifié");
            } else {
                System.out.println("Le module " + m.getNomDuModule() + " n'a pas été modifié");
            }
    };
        tab_enseignement.forEach(ConsumerUE2);

        // #########################################################################################################################################


        System.out.println("Question 1.3");

       Consumer<ModuleEnseignementNonStatique> ConsumerUE3 = (ModuleEnseignementNonStatique m) -> {
            System.out.println("le nom du module est " + m.getNomDuModule() + " et le type de controle est : " + m.getTypeDeControle());
            if (m.getTypeDeControle() == ModuleEnseignementNonStatique.TypeExercice.QCM) {
                m.setIsRattrapge(false);
                System.out.println("le  Module  " +  m.getNomDuModule() +  " a été modifié");
            } else {
                System.out.println("Pas de modification du rattrapage");
            }
        };
       tab_enseignement.forEach(ConsumerUE3);
    }
    public Exercice1Lambda(ArrayList<ModuleEnseignementNonStatique> t) {
        tab_enseignement = t;
        //enseignements = new ModuleEnseignement[] {new ModuleEnseignement("module1",1999, "M1", "Pierre", TypeExercice.QCM, true), new ModuleEnseignement("module2",2006, "M2", "Jean", TypeExercice.QCM, true)};
    }
    public static void main(String[] args) throws Exception {
        Exercice1Lambda e = new Exercice1Lambda(new  ArrayList<ModuleEnseignementNonStatique>());

        e.tab_enseignement.add(0, new ModuleEnseignementNonStatique("Scala", 2018, "MIAGE", "M.Dupont", ModuleEnseignementNonStatique.TypeExercice.QCM, true));
        e.tab_enseignement.add(1, new ModuleEnseignementNonStatique("Java", 2010, "MIAGE", "M.Donati", ModuleEnseignementNonStatique.TypeExercice.Projet, false));
        e.tab_enseignement.add(2, new ModuleEnseignementNonStatique("Python", 2011, "MIAGE", "M.Alpha", ModuleEnseignementNonStatique.TypeExercice.questionsSynthese, true));
        e.tab_enseignement.add(3, new ModuleEnseignementNonStatique("C++", 2017, "POLYTECH", "M.Beta", ModuleEnseignementNonStatique.TypeExercice.QCM, true));
        try {
            e.initConsumers();
        } catch (Exception ex) {
            System.out.println("Erreur : " + ex.getMessage());
        }
    }

}
