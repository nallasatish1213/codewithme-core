package designpattern.AFP;

public class MITAdminCard implements AdminCard {
    @Override
    public String getAdmitCard() {
        return this.getClass().getName();
    }
}
