package com.company;

import javax.swing.event.ListDataListener;
import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Beep Purple");
        album.addSong("Sormbringer", 4.6);
        album.addSong("Love dont mean a thing", 4.22);
        album.addSong("Holy Man", 4.32);
        album.addSong("Hold On", 5.6);
        album.addSong("Lady Killer", 3.50);
        album.addSong("You can't do it right", 6.35);
        album.addSong("The Gypsy", 4.40);
        album.addSong("Soldier of Fortuneg", 3.13);
        albums.add(album);

        album = new Album("For those about to Rock", "AC/DC");
        album.addSong("For those about roack", 5.44);
        album.addSong("Lets GO", 3.25);
        album.addSong("Snowballed", 4.51);
        album.addSong("C.O.D", 5.25);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Lady Killer", playList);
        albums.get(0).addToPlayList("Holy Man", playList);
        albums.get(0).addToPlayList("Speed", playList);;
        albums.get(0).addToPlayList(7,playList);
        albums.get(1).addToPlayList(1,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(4,playList);
        albums.get(0).addToPlayList(10,playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit =false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No SOngs in Playlist");
        }else{
            System.out.println("Now Playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the play list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We have reached the end of the play list");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Replaying " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the playlist");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We are at the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now Playing " + listIterator.previous());
                        }
                    }
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - Quit\n" +
                            "1 - to play next song\n" +
                            "2 - Play Previous Song\n" +
                            "3 - Replay Current Song\n" +
                            "4 - List Songs in Play List\n" +
                            "5 - Print Available Actions\n" +
                            "6 - Delete current song");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("===============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===============================");
    }

}
