package com.vn.example.iterator;

public interface SocialNetwork {
    ProfileIterator createFriendIterator(String id);
    ProfileIterator createCoworkersIterator(String id);
}
