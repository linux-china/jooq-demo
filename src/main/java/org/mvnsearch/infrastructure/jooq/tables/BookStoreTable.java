/**
 * This class is generated by jOOQ
 */
package org.mvnsearch.infrastructure.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.mvnsearch.infrastructure.jooq.JooqDatabase;
import org.mvnsearch.infrastructure.jooq.Keys;
import org.mvnsearch.infrastructure.jooq.tables.records.BookStoreRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookStoreTable extends TableImpl<BookStoreRecord> {

	private static final long serialVersionUID = -1328247105;

	/**
	 * The reference instance of <code>jooq.book_store</code>
	 */
	public static final BookStoreTable BOOK_STORE = new BookStoreTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BookStoreRecord> getRecordType() {
		return BookStoreRecord.class;
	}

	/**
	 * The column <code>jooq.book_store.name</code>.
	 */
	public final TableField<BookStoreRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

	/**
	 * Create a <code>jooq.book_store</code> table reference
	 */
	public BookStoreTable() {
		this("book_store", null);
	}

	/**
	 * Create an aliased <code>jooq.book_store</code> table reference
	 */
	public BookStoreTable(String alias) {
		this(alias, BOOK_STORE);
	}

	private BookStoreTable(String alias, Table<BookStoreRecord> aliased) {
		this(alias, aliased, null);
	}

	private BookStoreTable(String alias, Table<BookStoreRecord> aliased, Field<?>[] parameters) {
		super(alias, JooqDatabase.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BookStoreRecord>> getKeys() {
		return Arrays.<UniqueKey<BookStoreRecord>>asList(Keys.KEY_BOOK_STORE_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookStoreTable as(String alias) {
		return new BookStoreTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BookStoreTable rename(String name) {
		return new BookStoreTable(name, null);
	}
}
