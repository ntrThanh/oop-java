package com.vn.example.iterator;

public class Friend implements TypeOfSocialNetWork {
    private SocialNetwork facebook;
    private String type;

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
