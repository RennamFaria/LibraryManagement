package services;

import java.util.List;

import models.Book;

public interface ExternalCatalog {
    List<Book> searchBooks(String atribute, String value);       //procurar por titulos, autores, categoria ou library
    List<Library> searchLibrarys(String ID);
}