package org.lms.service;

import org.lms.Utility;
import org.lms.dto.Book;
import org.lms.dto.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryManager {
    List<Library> libraries = new ArrayList<>();
    Library library;
    List<Book> books = new ArrayList<>();

    public void createLibrary(String id, int noOfRacks) {
        library = new Library(id, noOfRacks);
        if (!libraries.contains(library)) {
            libraries.add(library);
            System.out.println("Created library with " + noOfRacks + " racks");
            return;
        }
        System.out.println("Library Id " + id + " already exists.");
    }

    public void addBookToLibrary(Integer bookId, String title, List<String> authors,
                                 List<String> publishers, List<String> bookCopies) {
        Book book = new Book(bookId, title, authors, publishers, bookCopies);
        List<List<Integer>> oldRack = new ArrayList<>(library.getRacks());
        int copyCount = 0, rackNumber = 0;
        int[] racks = new int[library.getRacks().size()];

        while (copyCount < bookCopies.size() && rackNumber < library.getRacks().size()) {
            if (library.getRacks().get(rackNumber).contains(bookId))
                rackNumber++;
            else {
                library.getRacks().get(rackNumber).add(bookId);
                racks[copyCount] = rackNumber;
                copyCount++;
            }
        }

        if (copyCount < bookCopies.size() && rackNumber == library.getRacks().size()) {
            library.setRacks(oldRack);
            System.out.println("Rack not available");
        }

        System.out.println("Added Book to racks: " + Arrays.toString(racks));
    }

    private void removeBookCopy(int bookId) {
        int rackNumber = 0;
        while (rackNumber < library.getRacks().size()) {
            if (library.getRacks().get(rackNumber).contains(bookId)) {
                library.getRacks().get(rackNumber).remove(bookId);
                System.out.println("Removed book copy: " + bookId + " from rack: " + rackNumber);
                return;
            } else
                rackNumber++;
        }
        System.out.println("Invalid Book Copy ID");
    }

}
