package oop;

public class Friend {
    static int numOfFriend;// 用 static 可以共享資源，屬於CLASS，所有物件都可以訪問。
    String name;

    Friend(String name){
        this.name = name;
        numOfFriend++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriend +" total friends");//不是this.numOfFriend,不用加this
    }
}
