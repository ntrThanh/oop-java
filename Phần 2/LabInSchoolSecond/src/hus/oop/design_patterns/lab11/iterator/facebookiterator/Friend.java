package hus.oop.design_patterns.lab11.iterator.facebookiterator;

public class Friend implements TypeOfSocialNetWork {
    private final SocialNetwork facebook;
    private final String type;

    public Friend(SocialNetwork facebook, String type) {
        this.facebook = facebook;
        this.type = type;
    }

    @Override
    public SocialNetwork getSocialNetworkAccount() {
        return facebook;
    }

    @Override
    public String getType() {
        return type;
    }
}
