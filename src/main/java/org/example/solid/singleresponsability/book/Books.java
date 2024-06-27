    package org.example.solid.singleresponsability.book;

    import java.util.HashSet;
    import java.util.LinkedHashSet;
    import java.util.Set;

    public class Books implements BookOperation{
        private Set<Book> books;

        @Override
        public  void addBook(Book book){
            if (books == null){
                books = new LinkedHashSet<>();
            }

            books.add(book);
        }
        @Override
        public Set<Book> showBooks() throws Exception {

            if (books == null){
                throw new Exception("There is not any book to be shown");
            }

            return books;
        }
        @Override
        public  String  deleteBooks(Book book) {

            String message = "";

            if (books == null || !books.remove(book))
                message = "There is no book with title " + book.getTitle()
                        + " from the author " + book.getAutor();

            return message;
        }
    }
