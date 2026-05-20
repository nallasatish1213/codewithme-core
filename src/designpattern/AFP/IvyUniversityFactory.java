package designpattern.AFP;

public class IvyUniversityFactory extends UniversityAbstractFactory{


    @Override
    public AdminCard getAdminCard(String stream) {
       switch (stream) {
           case "MATH":
               return new GITAMAdminCard();
           case "SCIENCE":
               return new AITAMAdminCard();
           default:
               break;
       }
        return null;
    }

    @Override
    public Fee getFee(String stream) {
       switch (stream) {
           case "MATH":
               return new GITAMFeeCalculation();
           case "SCIENCE":
               return new AITAMFeeCalculation();
           default:
               break;
       }
       return null;
    }
}
