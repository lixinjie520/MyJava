package oop;

public class FriendStatic {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Amber");
        Friend friend2 = new Friend("Emma");
        Friend friend3 = new Friend("Cindy");

        System.out.println(Friend.numOfFriend);

        Friend.showFriends();// Use class name to call static methods and attributes
//        System.out.println(friend1.name);
//        System.out.println(friend1.numOfFriend);
//
//        System.out.println(friend2.name);
//        System.out.println(friend2.numOfFriend);
    }
}
