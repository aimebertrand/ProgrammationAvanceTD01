import java.util.ArrayList;
import java.util.function.Consumer;
// Une classe locale est déclarée au sein d'un bloc de code Java/Methode
// Une classe locale est instanciable comme une classe membre.
// Une classe locale est associée à un objet instancié de la classe englobante.
// Une classe locale n'est visible et utilisable qu'au sein d'un bloc de code Java.où elle a été déclarée.
// Une classe locale peut utiliser des variables ( locales, d'instances ou paramètres ) visibles dans le bloc ou elle est déclarée à la condition impérative que ces variables aient été déclarées en mode final.
// Une classe locale peut utiliser des variables d'instances comme une classe membre.
// Une classe locale ne peut pas être qualifiée en public, private, protected ou static.
public class Exercice1Locale {




    ArrayList<ModuleEnseignementNonStatique> tab_enseignement;


    public void initConsumers() throws Exception {
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
                    System.out.println("le  Module  " +  m.getNomDuModule() +  " a été modifié");
                } else {
                    System.out.println("Pas de modification du rattrapage");
                }

            }
        }
        System.out.println("Question 1.1");
        tab_enseignement.forEach(new ConsumerUE());
        System.out.println("Question 1.2");
        tab_enseignement.forEach(new ConsumerUE2());
        System.out.println("Question 1.3");
        tab_enseignement.forEach(new ConsumerUE3());
    }
    public Exercice1Locale (ArrayList < ModuleEnseignementNonStatique > t) {
        tab_enseignement = t;
    }
    public static void main(String[] args) throws Exception {
        Exercice1Locale e = new Exercice1Locale(new  ArrayList<ModuleEnseignementNonStatique>());
        
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
