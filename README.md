# library-system
A very simple library system that keeps information about the books and periodicals held in stock

There is an abstract class LibraryItem with two subclasses Book and Periodical.
* Every library item has a name (a string) and a unique reference number (also a string) and the year of publication (an int).
* Every book has an author and a publisher (both strings).
* Every periodical has an issue number (an int). 

There are constructors for all three classes. The argument lists for the constructors of the nonabstract classes are ordered as follows:
* Book: (String name, String refNum, int year, String author, String publisher)
* Periodical: (String name, String refNum, int year, int issueNum)

Both the Book and the Periodical constructor start with an invocation of the parent class constructor. There are also suitable toString() methods for classes Book and Periodical. These methods override the default provided in class Object and they produce information in intelligible format. The result is readable and includes all the information known about the item. All fields, constructors and methods are declares as public.
