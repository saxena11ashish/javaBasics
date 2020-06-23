package oops.interfaces;

public class Person implements Student,Youtuber{

    public void study(){
        System.out.println("person is studying");
    }
    public void makeVideo(){
        System.out.println("person is making a video");
    }
    public void editVideos(){
        System.out.println("person is editing a video");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.study();
        p.makeVideo();
    }
}
