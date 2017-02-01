import app.account.AccountManager;
import app.account.viewmodels.CreateAccountViewModel;
import app.account.viewmodels.LoginViewModel;
import app.db.dummy.DummyDatabaseManager;
import app.models.User;

public class main {

    public static void main ( String [] arguments )
    {
        AccountManager accountManager = new AccountManager();

        CreateAccountViewModel createAccountViewModel = new CreateAccountViewModel();
        createAccountViewModel.setEmail("test@test.com");
        createAccountViewModel.setFirstName("Ben");
        createAccountViewModel.setLastName("Burrus");
        createAccountViewModel.setPassword("PW1");

        accountManager.CreateAccount(createAccountViewModel);

        LoginViewModel loginViewModel = new LoginViewModel();
        loginViewModel.setEmail("test@test.com");
        loginViewModel.setPassword("PW2");
        User loginFailUser = accountManager.Login(loginViewModel);

        loginViewModel.setPassword("PW1");
        loginFailUser = accountManager.Login(loginViewModel);

        System.out.println("Hello, world");
    }
}
