package hus.oop.design_patterns.lab11.iterator.facebookiterator;

public class FacebookIterator implements ProfileIterator {
    private final Facebook facebook;
    private final String profileId;
    private final String type;
    private int positionCurrent;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
        this.positionCurrent = 0;
    }

    @Override
    public Profile getNext() {
        if (hasMore()) {
            positionCurrent++;
            return cache[positionCurrent - 1];
        }

        return null;
    }

    @Override
    public boolean hasMore() {
        init();
        return cache.length > positionCurrent;
    }

    public void init() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }
}
