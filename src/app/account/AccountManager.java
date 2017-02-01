package app.account;

import app.BaseClass;
import app.account.viewmodels.CreateAccountViewModel;
import app.account.viewmodels.LoginViewModel;
import app.models.Account;
import app.models.User;

public class AccountManager extends BaseClass {

    public AccountManager() {
        super();
    }

    public void CreateAccount(CreateAccountViewModel viewModel) {

        Account account = new Account();
        this.databaseManager.Insert(account);

        User user = new User();
        user.setAccountId(account.getId());
        user.setEmail(viewModel.getEmail());
        user.setFirstName(viewModel.getFirstName());
        user.setLastName(viewModel.getLastName());
        user.setPassword(viewModel.getPassword());
        this.databaseManager.Insert(user);

    }

    public User Login(LoginViewModel viewModel) {

        User user = this.databaseManager.Get("Email", viewModel.getEmail(), User.class);

        if (user.getPassword().equals(viewModel.getPassword())) {
            return user;
        }
        return null;
    }
}
