import java.util.ArrayList;

public class Main {
    public static void populateInventory(ArrayList<Book> inventory) {
        inventory.add(new Book("9781974718900", "Sensor", "Junji Ito", 3, 19.99, "Viz Media"));
        inventory.add(new Book("1234567890123", "Debug", "Debug", 1, 9.99, "Debug"));
        inventory.add(new Book("9780312558154", "The Dream of Perpetual Motion", "Dexter Palmer", 1, 24.99, "St. Martin's Press"));
        inventory.add(new Book("9780761169086", "Atlas Obscura", "Joshua Foer", 1, 35.00, "Workman Publishing"));
        inventory.add(new Book("9780385663250", "The Montreal Canadiens: 100 Years of Glory", "D'Arcy Jenish", 2, 22.00, "Anchor Canada"));
        inventory.add(new Book("9780321546342", "This Book is Full of Spiders", "David Wong", 1, 25.99, "Thomas Dunne Books"));
        inventory.add(new Book("9784805314432", "Japanese Death Poems", "Yoel Hoffman", 2, 14.99, "Tuttle Publishing"));
        inventory.add(new Book("9781250318541", "Mistborn", "Brandon Sanderson", 2, 9.99, "Tor"));
        inventory.add(new Book("9781250318572", "The Well of Ascension", "Brandon Sanderson", 2, 10.99, "Tor"));
        inventory.add(new Book("9781250318626", "The Hero of Ages", "Brandon Sanderson", 2, 10.99, "Tor"));
        inventory.add(new Book("9780593201275", "How to Sell a Haunted House", "Grady Hendrix", 2, 18.00, "Berkley"));
    }

    public static void main(String[] args) {
        ArrayList<Book> inventory = new ArrayList<>();
        populateInventory(inventory);

        System.out.printf("%-15s%-45s%-20s%-10s%-8s%-10s%n", "ISBN", "Title", "Author", "Edition", "Price", "Publisher");

        for (Book book : inventory) {
            System.out.println(book);
        }
    }
}