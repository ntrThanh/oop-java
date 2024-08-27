package hus.oop.design_patterns.lab11.iterator.facebookiterator;

public class SocialSpammer {
    public void send(ProfileIterator profileIterator, String message) {
        while (profileIterator.hasMore()) {
            Profile profile = profileIterator.getNext();
            System.out.println("System send message to "
                    + profile.getEmail() + ": " + message);
        }
    }
}
