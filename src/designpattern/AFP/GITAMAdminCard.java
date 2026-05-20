package designpattern.AFP;

public class GITAMAdminCard implements AdminCard {

    @Override
    public String getAdmitCard() {
        return this.getClass().getName();
    }
}
