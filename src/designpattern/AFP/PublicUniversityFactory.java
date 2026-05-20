package designpattern.AFP;

public class PublicUniversityFactory extends UniversityAbstractFactory {
    @Override
    public AdminCard getAdminCard(String stream) {
       switch (stream) {
           case "AI":
               return new MITAdminCard();
           case "DATASCIENCE":
               return new IITAdminCard();
           default:
               break;
       }
       return null;
    }

    @Override
    public Fee getFee(String stream) {
        switch (stream) {
            case "AI":
                return new MITFeeCalculation();
            case "DATASCIENCE":
                return new IITFeeCalculation();
            default:
                break;
        }
        return null;
    }
}
