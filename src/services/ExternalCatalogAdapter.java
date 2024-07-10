package services;

import java.util.List;

import models.Book;

public class ExternalCatalogAdapter implements ExternalCatalog {
    private ExternalCatalogService externalService;

    public ExternalCatalogAdapter(ExternalCatalogService externalService) {
        this.externalService = externalService;
    }

    @Override
    public List<Book> searchBooks(String atribute, String value) {
        return externalService.getBooks(value);
    }

    @Override
    public List<Library> searchLibrarys(String ID) {
        return externalService.getLibrarys(ID);
    }
}

