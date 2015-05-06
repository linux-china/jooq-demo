/**
 * This class is generated by jOOQ
 */
package org.mvnsearch.jooq.db;


import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.mvnsearch.jooq.db.tables.Author;
import org.mvnsearch.jooq.db.tables.Book;
import org.mvnsearch.jooq.db.tables.BookToBookStore;
import org.mvnsearch.jooq.db.tables.Language;
import org.mvnsearch.jooq.db.tables.records.AuthorRecord;
import org.mvnsearch.jooq.db.tables.records.BookRecord;
import org.mvnsearch.jooq.db.tables.records.BookToBookStoreRecord;
import org.mvnsearch.jooq.db.tables.records.LanguageRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>jooq</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;
	public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;
	public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = UniqueKeys0.KEY_BOOK_TO_BOOK_STORE_PRIMARY;
	public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = UniqueKeys0.KEY_LANGUAGE_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = createUniqueKey(Author.AUTHOR, Author.AUTHOR.ID);
		public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = createUniqueKey(Book.BOOK, Book.BOOK.ID);
		public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, BookToBookStore.BOOK_TO_BOOK_STORE.NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = createUniqueKey(Language.LANGUAGE, Language.LANGUAGE.ID);
	}
}