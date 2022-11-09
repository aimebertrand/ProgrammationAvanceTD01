//Un constructeur est appelé quand un objet d’une classe est créé, donc pas d’utilisation du constructeur statique
//"This" fait référence à l’instance d'objet. Il n’y a pas d’instance objet dans un appel d’une méthode statique, les var sont définies à la comp

public class ModuleEnseignementStatique {


    enum  TypeExercice {
        QCM, Projet, questionsSynthese
    }
    private static String NomDuModule;
    private static int AnneeDeCreation;
    private static String NomDuDiplome;
    private static String NomDeLEnseignant;
    private static ModuleEnseignementNonStatique.TypeExercice typeDeControle;
    private static Boolean IsRattrapge;

    public static String getNomDuModule() {
        return NomDuModule;
    }

    public static void setNomDuModule(String NomDuModule) {
        NomDuModule = NomDuModule;
    }

    public static int getAnneeDeCreation() {
        return AnneeDeCreation;
    }

    public static void setAnneeDeCreation(int AnneeDeCreation) {
        AnneeDeCreation = AnneeDeCreation;
    }

    public static String getNomDuDiplome() {
        return NomDuDiplome;
    }

    public static void setNomDuDiplome(String NomDuDiplome) {
        NomDuDiplome = NomDuDiplome;
    }

    public static String getNomDeLEnseignant() {
        return NomDeLEnseignant;
    }

    public static void setNomDeLEnseignant(String NomDeLEnseignant) {
        NomDeLEnseignant = NomDeLEnseignant;
    }

    public static Boolean getIsRattrapge() {
        return IsRattrapge;
    }

    public static void setIsRattrapge(Boolean IsRattrapge) {
        IsRattrapge = IsRattrapge;
    }

    public static ModuleEnseignementNonStatique.TypeExercice getTypeDeControle() {
        return typeDeControle;
    }

    public void setTypeDeControle(ModuleEnseignementNonStatique.TypeExercice typeDeControle) {
       typeDeControle = typeDeControle;
    }

    public ModuleEnseignementStatique(String NomDuModule, int AnneeDeCreation, String NomDuDiplome, String NomDeLEnseignant, ModuleEnseignementNonStatique.TypeExercice TypeDeControle, Boolean IsRattrapge) {
        NomDuModule = NomDuModule;
        AnneeDeCreation = AnneeDeCreation;
        NomDuDiplome = NomDuDiplome;
        NomDeLEnseignant = NomDeLEnseignant;
        typeDeControle = TypeDeControle;
        IsRattrapge = IsRattrapge;
    }

}
