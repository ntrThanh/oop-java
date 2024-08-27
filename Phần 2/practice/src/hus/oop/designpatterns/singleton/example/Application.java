package hus.oop.designpatterns.singleton.example;

public class Application {
    public static void main(String[] args) {
            Database database = Database.getInstance();

            database.changeData("Data is xin chao moi nguoi toi la nguyen trong thanh");
            System.out.println(database.getData());


            Database database1 = Database.getInstance();
            System.out.println(database1.getData());

            Database database2 = Database.getInstance();
            System.out.println(database2.getData());
    }
}
