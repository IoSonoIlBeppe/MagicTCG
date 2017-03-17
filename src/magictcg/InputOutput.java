/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg;

import java.util.Scanner;
import magictcg.magic.instant.IInstant;
import magictcg.player.Player;

/**
 *
 * @author gianmarcocallegher
 */
public final class InputOutput {

    private static int input(Player p, int l) {
        int i;
        do {
            p.getHand().showMagics();
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
        } while (i < l || i > p.getHand().getSize());
        return (i==0)? 0:(i - 1);
    }

    public static int inputMagic(Player p) {
        System.out.println("sono il player:" + p.getName() + "  Choose the magic you want to play or press 0 to skip:");
        return input(p, 0);
    }

    public static int inputInstant(Player p) {
        System.out.println("sono il player:" + p.getName() + "Choose the instant you want to play or press 0 to skip:");
        int i;
        do {
            i = input(p, 0);
        } while (!(p.getHand().getMagic(i) instanceof IInstant) && i != 0);

        return i;
    }

    public static int inputDiscard(Player p) {
        System.out.println("Choose the magic you want to discard:");
        return input(p, 1);
    }
}
