package designpattern.AFP;

public abstract class  UniversityAbstractFactory {

    public static int cutOffScore=140;
    public static UniversityAbstractFactory getUniversityInstance(Integer score) {
        if (score > cutOffScore) {
            return new PublicUniversityFactory();
        } else {
            return new IvyUniversityFactory();
        }
    }

    public abstract AdminCard getAdminCard(String stream);

    public abstract Fee getFee(String stream);

}
