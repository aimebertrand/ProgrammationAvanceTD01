import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercice1Statique {
    static ArrayList <ModuleEnseignementStatique> tab_enseignement ;


    public static class ConsumerUE implements Consumer<ModuleEnseignementStatique> {
        @Override
        public void accept(ModuleEnseignementStatique m) {
            System.out.println("le nom du module est :" + m.getNomDuModule()+ " et annee de creation : " + ModuleEnseignementStatique.getAnneeDeCreation());
            ModuleEnseignementStatique.setAnneeDeCreation(ModuleEnseignementStatique.getAnneeDeCreation() + 1);
            System.out.println("le nom du module est " + ModuleEnseignementStatique.getNomDuModule() + " et l'année de création modifié est ==> " + ModuleEnseignementStatique.getAnneeDeCreation());
        }
    }

    public static class ConsumerUE2 implements Consumer<ModuleEnseignementStatique> {
        @Override
        public void accept(ModuleEnseignementStatique m) {
            System.out.println("le nom du module est :" + ModuleEnseignementStatique.getNomDuModule() + "et enseignant est : " + ModuleEnseignementStatique.getNomDeLEnseignant());
            if (ModuleEnseignementStatique.getNomDeLEnseignant().equals("M.Dupont")) {
                ModuleEnseignementStatique.setAnneeDeCreation(ModuleEnseignementStatique.getAnneeDeCreation() + 1);
                System.out.println("le module " + ModuleEnseignementStatique.getNomDuModule() + " a ete modifie");
            } else {
                System.out.println("le module " + ModuleEnseignementStatique.getNomDuModule() + " n'a pas ete modifie");
            }

        }
    }

    public static class ConsumerUE3 implements Consumer<ModuleEnseignementStatique> {
        @Override
        public void accept(ModuleEnseignementStatique m) {
            System.out.println("le nom du module est " + ModuleEnseignementStatique.getNomDuModule() + " et le type de controle est : " + ModuleEnseignementStatique.getTypeDeControle());
            if (ModuleEnseignementStatique.getTypeDeControle().equals("QCM")) {
                ModuleEnseignementStatique.setAnneeDeCreation(ModuleEnseignementStatique.getAnneeDeCreation() + 1);
                System.out.println("le module " + ModuleEnseignementStatique.getNomDuModule() + " a ete modifie");
            } else {
                System.out.println("le module " + ModuleEnseignementStatique.getNomDuModule() + " n'a pas ete modifie");
            }

        }
    }
    public Exercice1Statique (ArrayList<ModuleEnseignementStatique> t){
        this.tab_enseignement = t;
    }

    public static void main(String[] args) throws Exception {

    // Je n'ai pas compris comment implémenter via la "technique" static
    }

}