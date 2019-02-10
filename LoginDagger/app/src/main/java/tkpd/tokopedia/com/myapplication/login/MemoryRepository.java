package tkpd.tokopedia.com.myapplication.login;

public class MemoryRepository implements LoginRepository {

    private User user;

    @Override
    public User getUser() {

        if (user == null) {
            User user = new User("Jamie", "Vardy");
            user.setId(0);
            return user;
        } else {
            return user;
        }

    }

    @Override
    public void saveUser(User user) {

        if (user == null) {
            user = getUser();
        }

        this.user = user;

    }
}

// 10