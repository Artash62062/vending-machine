package vendingmachine;

import readandwrite.ReadWriteMechanism;
import chipses.*;
import chocolates.*;
import commands.Command;
import commands.CommandProcessor;
import drinks.*;
import product.Product;
import sandwiches.*;

import java.util.*;

public class VendingMachine {
    private Map<String, List<Queue<Product>>> blocks = new HashMap<>();
    private final EmptyVendingMachineInitializer emptyVendingMachineInitializer = new EmptyVendingMachineInitializer();
    CommandProcessor commandProcessor = new CommandProcessor();

    public void initVendingMachine() {
        blocks = emptyVendingMachineInitializer.initVendingMachineBlocks(blocks);
    }

    public void start() {
        this.blocks = ReadWriteMechanism.readWeedingMachineDataFromFile();
        while (true) {
            System.out.println("The Content of Wedding Machine");
            System.out.println("D :");
            List<Queue<Product>> products = blocks.get("D");
            printProductList(products);
            System.out.println();
            System.out.println("S :");
            products = blocks.get("S");
            printProductList(products);
            System.out.println();
            System.out.println("C :");
            products = blocks.get("C");
            printProductList(products);
            System.out.println();
            System.out.println("E :");
            products = blocks.get("E");
            printProductList(products);
            System.out.println();
            System.out.println("Input Command for Start");
            System.out.println("Command Style 'KEY:INDEX:COUNT'");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input S for stop");
            String stringCommand = scanner.nextLine();
            if (stringCommand.equals("S")) {
                ReadWriteMechanism.writeWeedingMachineDataToFile(this.blocks);
                break;
            }
            Command command = commandProcessor.getCommandByString(stringCommand);
            Queue<Product> removedProducts = getProduct(command);
            System.out.println(removedProducts);
        }
    }

    public void printProductList(List<Queue<Product>> products) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).peek()!=null) {
                System.out.println(i + ": " + products.get(i).peek().toString());
            }
        }
    }

    public Queue<Product> getProduct(Command command) {
        Queue<Product> products = new LinkedList<>();
        Queue<Product> currentProductQueue = blocks.get(command.getKey()).get(command.getIndex());
        for (int i = 0; i < command.getCount(); i++) {
            if (currentProductQueue.size() <= 1) {
                initAllProductsInQueue(currentProductQueue.peek());
            }
            products.add(currentProductQueue.remove());
        }
        System.out.println("removed");
        return products;
    }

    public void addProductToWeddingMachine(Product product) {
        if (product instanceof Chocolate) {
            addChocolateToWeddingMachine((Chocolate) product);
            return;
        }
        if (product instanceof Drink) {
            addDrinkToWeddingMachine((Drink) product);
            return;
        }
        if (product instanceof Sandwich) {
            addSandwichToWeddingMachine((Sandwich) product);
            return;
        }
        if (product instanceof Chips) {
            addChipsToWeddingMachine((Chips) product);
            return;
        }
        throw new IllegalArgumentException("Unexpected Product");
    }

    public void addDrinkToWeddingMachine(Drink drink) {
        List<Queue<Product>> drinks = blocks.get("D");
        if (drink instanceof Cola) {
            drinks.get(Cola.index).add((Cola) drink);
            return;
        }
        if (drink instanceof Fanta) {
            drinks.get(Fanta.index).add((Fanta) drink);
            return;
        }
        if (drink instanceof Beer) {
            drinks.get(Beer.index).add((Beer) drink);
            return;
        }
        if (drink instanceof Sprite) {
            drinks.get(Sprite.index).add((Sprite) drink);
        }
    }

    public void addSandwichToWeddingMachine(Sandwich sandwich) {
        List<Queue<Product>> sandwiches = blocks.get("E");
        if (sandwich instanceof HotDog) {
            sandwiches.get(HotDog.index).add((HotDog) sandwich);
        }
        if (sandwich instanceof HotCat) {
            sandwiches.get(HotCat.index).add((HotCat) sandwich);
        }
        if (sandwich instanceof CheeseSandwich) {
            sandwiches.get(CheeseSandwich.index).add((CheeseSandwich) sandwich);
        }
        if (sandwich instanceof Tost) {
            sandwiches.get(Tost.index).add((Tost) sandwich);
        }
    }

    public void addChocolateToWeddingMachine(Chocolate chocolate) {
        List<Queue<Product>> chocolates = blocks.get("S");
        if (chocolate instanceof Snickers) {
            chocolates.get(Snickers.index).add((Snickers) chocolate);
        }
        if (chocolate instanceof Bounty) {
            chocolates.get(Bounty.index).add((Bounty) chocolate);
        }
        if (chocolate instanceof Mars) {
            chocolates.get(Mars.index).add((Mars) chocolate);
        }
        if (chocolate instanceof Twix) {
            chocolates.get(Twix.index).add((Twix) chocolate);
        }
    }

    public void addChipsToWeddingMachine(Chips chips) {
        List<Queue<Product>> chipses = blocks.get("C");
        if (chips instanceof Lase) {
            chipses.get(Lase.index).add((Lase) chips);
        }
        if (chips instanceof Doritos) {
            chipses.get(Doritos.index).add((Doritos) chips);
        }
        if (chips instanceof Chitos) {
            chipses.get(Chitos.index).add((Chitos) chips);
        }
        if (chips instanceof Pringles) {
            chipses.get(Pringles.index).add((Pringles) chips);
        }
    }

    public void initAllProductsInQueue(Product product) {
        for (int i = 0; i < 19; i++) {
            addProductToWeddingMachine(product);
        }
    }
}
