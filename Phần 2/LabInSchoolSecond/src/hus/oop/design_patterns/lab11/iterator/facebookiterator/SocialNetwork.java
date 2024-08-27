package hus.oop.design_patterns.lab11.iterator.facebookiterator;

public interface SocialNetwork {
    ProfileIterator createFriendIterator(String id);

    ProfileIterator createCoworkersIterator(String id);
}
