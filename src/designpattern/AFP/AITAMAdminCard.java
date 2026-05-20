package designpattern.AFP;

public class AITAMAdminCard implements AdminCard {

    @Override
    public String getAdmitCard() {
        return this.getClass().getName();
    }
}
