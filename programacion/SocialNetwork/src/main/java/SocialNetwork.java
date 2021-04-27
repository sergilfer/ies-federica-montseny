import java.util.*;

public class SocialNetwork implements ISocialNetwork{
    private String name;
    private Map<String, User> users;
    private List<String> trendingTopic;

    public SocialNetwork(String name, Map<String, User> users, List<String> trendingTopic) {
        this.name = name;
        this.users = users;
        this.trendingTopic = trendingTopic;
    }

    @Override
    public User createUser(String username) {
        TreeSet<Post> wall = new TreeSet<>();
        User user = new User(username, wall);
        users.put(username, user);
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public List<String> getTrendingTopic() {
        return trendingTopic;
    }

    public void setTrendingTopic(List<String> trendingTopic) {
        this.trendingTopic = trendingTopic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialNetwork that = (SocialNetwork) o;
        return Objects.equals(name, that.name) && Objects.equals(users, that.users) && Objects.equals(trendingTopic, that.trendingTopic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users, trendingTopic);
    }
}
