package hus.oop.design_patterns.lab11.iterator.facebookiterator;

import java.util.LinkedList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private Profile profile;
    private final List<TypeOfSocialNetWork> facebookList;

    public Facebook(Profile profile) {
        this.profile = profile;
        facebookList = new LinkedList<>();
    }

    public Profile[] socialGraphRequest(String profileId, String type) {
        List<Profile> list = new LinkedList<>();

        for (int i = 0; i < facebookList.size(); i++) {
            if (facebookList.get(i).getType().equals(type)
                    && facebookList.get(i).getSocialNetworkAccount() instanceof Facebook) {
                list.add(((Facebook) facebookList.get(i).getSocialNetworkAccount()).getProfile());
            }
        }
        Profile[] profiles = new Profile[list.size()];
        return list.toArray(profiles);
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void addFacebookUserInToFacebookList(SocialNetwork facebook, String type) {
        this.facebookList.add(new Friend(facebook, type));
    }

    @Override
    public ProfileIterator createFriendIterator(String id) {
        return new FacebookIterator(this, id, "friend");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String id) {
        return new FacebookIterator(this, id, "coworker");
    }
}
