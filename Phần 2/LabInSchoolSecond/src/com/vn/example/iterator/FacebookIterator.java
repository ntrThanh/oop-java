package com.vn.example.iterator;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId, type;
    private int positionCurrent;
    private Profile[]  cache;

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
        if(cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }
}
