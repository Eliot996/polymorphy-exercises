package customer;

public class VIPCustomer extends Customer{

    private int bonusPoint;

    public VIPCustomer(String name, String phone, int bonusPoint) {
        super(name, phone);
        this.bonusPoint = bonusPoint;
    }

    @Override
    public String toString() {
        return "VIPCustomer{" +
                "name='" + getName() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", bonusPoint=" + bonusPoint +
                '}';
    }

   /* @Override
    public String toString() {
        String fromSuper = super.toString();
        return "VIP" + fromSuper.substring(0, fromSuper.length()-1) +
                ", bonusPoint=" + bonusPoint +
                '}';
    }*/

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}
