/*
 * This file is generated by jOOQ.
 */
package org.mvnsearch.infrastructure.jooq;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.mvnsearch.infrastructure.jooq.tables.Author;
import org.mvnsearch.infrastructure.jooq.tables.Book;
import org.mvnsearch.infrastructure.jooq.tables.BookStore;
import org.mvnsearch.infrastructure.jooq.tables.BookToBookStore;
import org.mvnsearch.infrastructure.jooq.tables.Language;
import org.mvnsearch.infrastructure.jooq.tables.records.AuthorRecord;
import org.mvnsearch.infrastructure.jooq.tables.records.BookRecord;
import org.mvnsearch.infrastructure.jooq.tables.records.BookStoreRecord;
import org.mvnsearch.infrastructure.jooq.tables.records.BookToBookStoreRecord;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * jooq.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = Internal.createUniqueKey(Author.AUTHOR, DSL.name("KEY_author_PRIMARY"), new TableField[] { Author.AUTHOR.ID }, true);
    public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = Internal.createUniqueKey(Book.BOOK, DSL.name("KEY_book_PRIMARY"), new TableField[] { Book.BOOK.ID }, true);
    public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_NAME = Internal.createUniqueKey(BookStore.BOOK_STORE, DSL.name("KEY_book_store_name"), new TableField[] { BookStore.BOOK_STORE.NAME }, true);
    public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = Internal.createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, DSL.name("KEY_book_to_book_store_PRIMARY"), new TableField[] { BookToBookStore.BOOK_TO_BOOK_STORE.NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID }, true);
    public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = Internal.createUniqueKey(Language.LANGUAGE, DSL.name("KEY_language_PRIMARY"), new TableField[] { Language.LANGUAGE.ID }, true);
}
