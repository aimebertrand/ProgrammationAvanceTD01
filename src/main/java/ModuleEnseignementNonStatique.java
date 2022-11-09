
import java.util.function.Consumer;



public class ModuleEnseignementNonStatique {

    enum TypeExercice {
        QCM, Projet, questionsSynthese
    }
    private String NomDuModule;
    private int AnneeDeCreation;
    private String NomDuDiplome;
    private String NomDeLEnseignant;
    private TypeExercice typeDeControle;
    private Boolean IsRattrapge;

    public String getNomDuModule() {
        return NomDuModule;
    }

    public void setNomDuModule(String NomDuModule) {
        this.NomDuModule = NomDuModule;
    }

    public int getAnneeDeCreation() {
        return AnneeDeCreation;
    }

    public void setAnneeDeCreation(int AnneeDeCreation) {
        this.AnneeDeCreation = AnneeDeCreation;
    }

    public String getNomDuDiplome() {
        return NomDuDiplome;
    }

    public void setNomDuDiplome(String NomDuDiplome) {
        this.NomDuDiplome = NomDuDiplome;
    }

    public String getNomDeLEnseignant() {
        return NomDeLEnseignant;
    }

    public void setNomDeLEnseignant(String NomDeLEnseignant) {
        this.NomDeLEnseignant = NomDeLEnseignant;
    }

    public Boolean getIsRattrapge() {
        return IsRattrapge;
    }

    public void setIsRattrapge(Boolean IsRattrapge) {
        this.IsRattrapge = IsRattrapge;
    }

    public TypeExercice getTypeDeControle() {
        return typeDeControle;
    }

    public void setTypeDeControle(TypeExercice typeDeControle) {
        this.typeDeControle = typeDeControle;
    }

    public  ModuleEnseignementNonStatique(String NomDuModule, int AnneeDeCreation, String NomDuDiplome, String NomDeLEnseignant, TypeExercice TypeDeControle, Boolean IsRattrapge) {
        this.NomDuModule = NomDuModule;
        this.AnneeDeCreation = AnneeDeCreation;
        this.NomDuDiplome = NomDuDiplome;
        this.NomDeLEnseignant = NomDeLEnseignant;
        this.typeDeControle = TypeDeControle;
        this.IsRattrapge = IsRattrapge;
    }

}
