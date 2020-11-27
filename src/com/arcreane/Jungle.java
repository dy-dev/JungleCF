package com.arcreane;

import org.fusesource.jansi.AnsiConsole;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import static org.fusesource.jansi.Ansi.ansi;

public class Jungle {
    public static Random s_Random = new Random();
    public static JungleObject[] s_JungleObject = new JungleObject[2];

    public static void main(String[] args) throws UnsupportedEncodingException {
        AnsiConsole.systemInstall();
        char escCode = 0x1B;
        int row = 0;
        int column = 0;
//        System.out.print(String.format("%c[%d;%df",escCode,row,column));
//
//        System.out.println(ansi().eraseScreen().fg(Ansi.Color.RED).a("Hello").fg(Ansi.Color.GREEN).a("World"));
//        System.out.println(ansi().reset());
//
//        for (Ansi.Color col: Ansi.Color.values()) {
//            System.out.println(col);
//
//        }
        createNewTerrain();
        s_JungleObject[1] = new Weather(getTerrain());

        while (getTerrain().hasLivingCreatures()) {
            System.out.println(ansi().eraseScreen());
            System.out.print(String.format("%c[%d;%df", escCode, row, column));
            for (JungleObject obj : s_JungleObject) {
                obj.step();
            }
            getTerrain().draw();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void createNewTerrain() {
        Terrain terrain = new Terrain();
        s_JungleObject[0] = terrain;
        terrain.init();
    }

    public static Terrain getTerrain() {
        return (Terrain) s_JungleObject[0];
    }
}
