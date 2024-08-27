package hus.oop.design_patterns.lab11.iterator.facebookiterator;

public class Application {
    SocialNetwork socialNetwork;
    SocialSpammer socialSpammer;

    public Application(SocialNetwork socialNetwork, SocialSpammer socialSpammer) {
        this.socialNetwork = socialNetwork;
        this.socialSpammer = socialSpammer;
    }

    public void sendSpamToFriend() {
        ProfileIterator profileIterator = socialNetwork.createFriendIterator("");
        socialSpammer.send(profileIterator, "The important message to Friend");
    }

    public void sendSpamToCoworker() {
        ProfileIterator profileIterator = socialNetwork.createCoworkersIterator("");
        socialSpammer.send(profileIterator, "The important message to Coworker");
    }

    public static void main(String[] args) {
        SocialNetwork socialNetwork1 = new Facebook(new Profile("12345", "nguyentrongthanh672@gmail.com"));

        SocialNetwork socialNetwork2 = new Facebook(new Profile("12425", "nguyentrongthanh602@gmail.com"));
        SocialNetwork socialNetwork3 = new Facebook(new Profile("12325", "nguyentrongthanh612@gmail.com"));
        SocialNetwork socialNetwork4 = new Facebook(new Profile("14425", "nguyentrongthanh632@gmail.com"));
        SocialNetwork socialNetwork5 = new Facebook(new Profile("6876", "nguyentrongthanh672@gmail.com"));

        if (socialNetwork1 instanceof Facebook) {
            ((Facebook) socialNetwork1).addFacebookUserInToFacebookList(socialNetwork2, "friend");
            ((Facebook) socialNetwork1).addFacebookUserInToFacebookList(socialNetwork3, "friend");
            ((Facebook) socialNetwork1).addFacebookUserInToFacebookList(socialNetwork4, "friend");
            ((Facebook) socialNetwork1).addFacebookUserInToFacebookList(socialNetwork5, "coworker");
        }
        Application application = new Application(socialNetwork1, new SocialSpammer());
        application.sendSpamToFriend();
        application.sendSpamToCoworker();

    }
}
