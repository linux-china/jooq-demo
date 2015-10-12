/**
 * This class is generated by jOOQ
 */
package org.mvnsearch.infrastructure.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.mvnsearch.infrastructure.jooq.tables.BookToBookStoreTable;


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
public class BookToBookStoreRecord extends UpdatableRecordImpl<BookToBookStoreRecord> implements Record3<String, Integer, Integer> {

	private static final long serialVersionUID = -2113637138;

	/**
	 * Setter for <code>jooq.book_to_book_store.name</code>.
	 */
	public void setName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jooq.book_to_book_store.name</code>.
	 */
	public String getName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>jooq.book_to_book_store.book_id</code>.
	 */
	public void setBookId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jooq.book_to_book_store.book_id</code>.
	 */
	public Integer getBookId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>jooq.book_to_book_store.stock</code>.
	 */
	public void setStock(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>jooq.book_to_book_store.stock</code>.
	 */
	public Integer getStock() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<String, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return BookToBookStoreTable.BOOK_TO_BOOK_STORE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return BookToBookStoreTable.BOOK_TO_BOOK_STORE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return BookToBookStoreTable.BOOK_TO_BOOK_STORE.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getStock();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookToBookStoreRecord value1(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookToBookStoreRecord value2(Integer value) {
		setBookId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookToBookStoreRecord value3(Integer value) {
		setStock(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookToBookStoreRecord values(String value1, Integer value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BookToBookStoreRecord
	 */
	public BookToBookStoreRecord() {
		super(BookToBookStoreTable.BOOK_TO_BOOK_STORE);
	}

	/**
	 * Create a detached, initialised BookToBookStoreRecord
	 */
	public BookToBookStoreRecord(String name, Integer bookId, Integer stock) {
		super(BookToBookStoreTable.BOOK_TO_BOOK_STORE);

		setValue(0, name);
		setValue(1, bookId);
		setValue(2, stock);
	}
}
