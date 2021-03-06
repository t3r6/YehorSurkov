package lesson16.comparators;

import java.util.*;

public class Category {
    private String name;
    private List<Product> setOfProducts;


    public Category(String name, List<Product> setOfProducts) {
        this.name = name;
        this.setOfProducts = setOfProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getSetOfProducts() {
        return setOfProducts;
    }

    public void setSetOfProducts(ArrayList<Product> setOfProducts) {
        this.setOfProducts = setOfProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(setOfProducts, category.setOfProducts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, setOfProducts);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", setOfProducts=" + setOfProducts +
                '}';
    }

    public void printSortedByName() {
        Comparator<Product> cName = new ComparatorName();
        Set<Product> set = new TreeSet<>(cName);
        set.addAll(setOfProducts);
        set.forEach(System.out::println);
    }

    public void printSortedByCost() {
        Comparator<Product> cName = new ComparatorCost();
        Set<Product> set = new TreeSet<>(cName);
        set.addAll(setOfProducts);
        set.forEach(System.out::println);
    }

    public void printSortedByRank() {
        Comparator<Product> cName = new ComparatorRank();
        Set<Product> set = new TreeSet<>(cName);
        set.addAll(setOfProducts);
        set.forEach(System.out::println);
    }
}
