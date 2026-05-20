package designpattern.AFP;

public class IITAdminCard implements AdminCard {

    @Override
    public String getAdmitCard() {
        return this.getClass().getName();
    }
}
