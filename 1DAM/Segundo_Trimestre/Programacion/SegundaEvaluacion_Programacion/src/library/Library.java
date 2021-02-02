package library;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private String name;
    private Book [] books;
    private Partner [] partners;
    private Loan [] loans;

    public Library(String name, Book[] books, Partner[] partners, Loan[] loans) {
        this.name = name;
        this.books = books;
        this.partners = partners;
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Partner[] getPartners() {
        return partners;
    }

    public void setPartners(Partner[] partners) {
        this.partners = partners;
    }

    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) &&
                Arrays.equals(books, library.books) &&
                Arrays.equals(partners, library.partners) &&
                Arrays.equals(loans, library.loans);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(books);
        result = 31 * result + Arrays.hashCode(partners);
        result = 31 * result + Arrays.hashCode(loans);
        return result;
    }
}
