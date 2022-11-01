Create a command-line application for the library management system with the following requirements.

**Details about the Library:**
1. The library will have one or more copies of multiple books
2. The library will have multiple racks and each rack can contain at most one copy of any book.
3. Each book will have the following properties:
Book ID,  Title, Authors, Publishers, Details about Book Copies
4. There could be multiple copies of the same book.
5. Each book copy will have a unique ID.
6. Each book copy will be placed on a rack.
7. Each book copy can be borrowed by a user with a specific due date.
8. Every rack will have a unique rack number (numbered serially from 1 to n where n is the total number of racks).

**Details about User:**
1. User details: User ID, Name
2. A user can borrow a maximum of 5 books.

**The functions that the library management system can do:**
1. Create a library.
2. Add a book to the library. The book should be added to the first available rack.
3. Remove a book copy from the library.
4. Allow a user to borrow a book copy given the book id, user id, and due date. The first available copy based on the rack number should be provided.
5. Allow a user to borrow a book copy given the book copy id, user id, and due date.
6. Allow a user to return a book copy given the book copy id. The book should be added to the first available rack.
7. Allow a user to print the book copy ids of all the books borrowed by them.
8. Allow a user to search for books using few book properties (Book ID, Title, Author, Publisher). Searching should return details about all the book copies that match the search query.

**Input/Output Format**
The code should strictly follow the input/output format and will be tested with provided test cases.

**Input Format**
_Multiple lines with each line containing a command._

Possible commands:

* create_library <library_id> <no_of_racks>
* add_book <book_id> <title> <comma_separated_authors> <comma_separated_publishers> <comma_separated_book_copy_ids>
* remove_book_copy <book_copy_id>
* borrow_book <book_id> <user_id> <due_date>
* borrow_book_copy <book_copy_id> <user_id> <due_date>
* return_book_copy <book_copy_id>
* print_borrowed <user_id>
* search <attribute> <attribute_value>
* Possible values of attribute: book_id, author, publisher
* exit
* Stop taking the input when you encounter the word exit.

_Note: You can assume that there would be no spaces in the book title or names of publishers/authors._

**Output Format**
_Print output based on the specific commands as mentioned below._


* **create_library**
Created library with <no_of_racks> racks


* **add_book**
Added Book to racks: <comma_separated_rack_nos>
Print "Rack not available" if there are not enough racks available and reject this add request.


* **remove_book_copy** 
Removed book copy: <book_copy_id> from rack: <rack_no>
Print "Invalid Book Copy ID" if the book copy is not present in any of the racks.


* **borrow_book**
Borrowed Book from rack: <rack_no>
Print "Invalid Book ID" if book id is invalid.
Print "Not available" if no more copies of that book are available.
Print "Overlimit" if the user has already borrowed 5 books.


* **borrow_book_copy**
Borrowed Book Copy from rack: <rack_no>
Print "Invalid Book Copy ID" if the book copy is not present in any of the racks.
Print "Overlimit" if the user has already borrowed 5 books.


* **return_book_copy**
Returned book copy <book_copy_id> and added to rack: <rack_no>
Print "Invalid Book Copy ID" if the book copy id is not present in the system.
Assume that the book copy is not already present on the rack.


* **print_borrowed**
Book Copy: <book_copy_id> <due_date>
The above will be printed for each borrowed book copy.
Do not print anything if no book is borrowed
Print in ascending order of book_copy_id.


* **search**
Book Copy: <book_copy_id> <book_id> <title> <comma_separated_authors> <comma_separated_publishers> <rack_no> <borrowed_by_id> <due_date>
The above will be printed for each copy (irrespective of whether it is borrowed or not).
If the book is borrowed, rack_no will be -1
If the book is not borrowed, do not print borrowed_by_id and due_date
If the library does not own that book then do not print anything
Print in ascending order of rack number.