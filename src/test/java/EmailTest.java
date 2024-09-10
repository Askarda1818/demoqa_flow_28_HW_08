import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты на email рассылку")
public class EmailTest {
    @Test
    @DisplayName("Email должен быть отпарвлен новому юзеру")
    public void emailShiuldSendedFroNewUser(){
        System.out.println("Hello World");

    }
    @Test
    @DisplayName("Email должен быть отпарвлен забаненному юзеру")
    public void emailShiuldSendedFroBannedUser(){
        System.out.println("Hello World");

    }
    @Test
    @DisplayName("Email должен быть отпарвлен в случае изменения PaymentMethod")
    public void emailShiuldSendedAfterChangePaymentMethod(){
        System.out.println("Hello World");

    }

}
