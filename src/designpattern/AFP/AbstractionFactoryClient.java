package designpattern.AFP;

public class AbstractionFactoryClient {

    public static void main(String[] args) {
        UniversityAbstractFactory factory=UniversityAbstractFactory.getUniversityInstance(145);

       AdminCard  factoryAdminCard=factory.getAdminCard("AI");
        Fee  factoryFee=factory.getFee("AI");

        System.out.println(factoryAdminCard.getAdmitCard()+ ": "+ factoryFee.fee());

    }
}
