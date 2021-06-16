package vendingmachine;

import chipses.Chitos;
import chipses.Doritos;
import chipses.Lase;
import chipses.Pringles;
import chocolates.Bounty;
import chocolates.Mars;
import chocolates.Snickers;
import chocolates.Twix;
import drinks.Beer;
import drinks.Cola;
import drinks.Fanta;
import drinks.Sprite;
import product.Product;
import sandwiches.CheeseSandwich;
import sandwiches.HotCat;
import sandwiches.HotDog;
import sandwiches.Tost;

import java.util.*;

public class EmptyVendingMachineInitializer {
    public Map<String, List<Queue<Product>>> initVendingMachineBlocks(Map<String, List<Queue<Product>>> blocks) {
        blocks.put("D", initDrinks());
        blocks.put("S", initChocolates());
        blocks.put("C", initChipses());
        blocks.put("E", initSandwiches());
        return blocks;
    }

    public List<Queue<Product>> initDrinks() {

        Queue<Product> colas = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            colas.offer(new Cola());
        }

        Queue<Product> fantas = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            fantas.offer(new Fanta());
        }

        Queue<Product> sprites = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            sprites.offer(new Sprite());
        }

        Queue<Product> beers = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            beers.offer(new Beer());
        }

        List<Queue<Product>> drinks = new ArrayList<>();

        drinks.add(Cola.index, colas);
        drinks.add(Sprite.index, sprites);
        drinks.add(Fanta.index, fantas);
        drinks.add(Beer.index, beers);

        return drinks;
    }

    public List<Queue<Product>> initChocolates() {

        Queue<Product> snickerses = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            snickerses.offer(new Snickers());
        }

        Queue<Product> marses = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            marses.offer(new Mars());
        }

        Queue<Product> twixes = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            twixes.offer(new Twix());
        }

        Queue<Product> bounties = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            bounties.offer(new Bounty());
        }

        List<Queue<Product>> chocolates = new ArrayList<>();
        chocolates.add(Bounty.index, bounties);
        chocolates.add(Mars.index, marses);
        chocolates.add(Snickers.index, snickerses);
        chocolates.add(Twix.index, twixes);
        return chocolates;
    }

    public List<Queue<Product>> initChipses() {

        Queue<Product> chitoses = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            chitoses.offer(new Chitos());
        }

        Queue<Product> lases = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            lases.offer(new Lase());
        }

        Queue<Product> doritoses = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            doritoses.offer(new Doritos());
        }

        Queue<Product> pringleses = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            pringleses.offer(new Pringles());
        }

        List<Queue<Product>> chipses = new ArrayList<>();
        chipses.add(Chitos.index, chitoses);
        chipses.add(Doritos.index, doritoses);
        chipses.add(Lase.index, lases);
        chipses.add(Pringles.index, pringleses);

        return chipses;
    }

    public static List<Queue<Product>> initSandwiches() {
        Queue<Product> hotDogs = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            hotDogs.add(new HotDog());
        }

        Queue<Product> hotCats = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            hotCats.add(new HotCat());
        }

        Queue<Product> cheeseSandwiches = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            cheeseSandwiches.add(new CheeseSandwich());
        }
        Queue<Product> tosts = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            tosts.add(new Tost());
        }

        List<Queue<Product>> sandwiches = new ArrayList<>();
        sandwiches.add(Tost.index, tosts);
        sandwiches.add(HotDog.index, hotDogs);
        sandwiches.add(HotCat.index, hotCats);
        sandwiches.add(CheeseSandwich.index, cheeseSandwiches);

        return sandwiches;
    }
}
