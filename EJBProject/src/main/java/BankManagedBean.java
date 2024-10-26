import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BankManagedBean {
    @EJB
    private BankBean bankBean;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit() {
        bankBean.deposit();
    }

    public void withdraw() {
        bankBean.withdraw();
    }
}
