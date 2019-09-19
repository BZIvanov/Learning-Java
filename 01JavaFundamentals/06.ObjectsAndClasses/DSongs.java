package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DSongs {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSongs = Integer.parseInt(sc.nextLine());
        List<DSong> songs = new ArrayList<>();

        for (int i = 0; i < numSongs; i++) {
            String[] data = sc.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            DSong song = new DSong();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = sc.nextLine();

        if (typeList.equals("all")) {
            for (DSong song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (DSong song : songs) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
