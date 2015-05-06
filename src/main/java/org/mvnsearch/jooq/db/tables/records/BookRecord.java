/**
 * This class is generated by jOOQ
 */
package org.mvnsearch.jooq.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.mvnsearch.jooq.db.tables.Book;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookRecord extends UpdatableRecordImpl<BookRecord> implements Record5<Integer, Integer, String, Integer, Integer> {

	private static final long serialVersionUID = -1950178278;

	/**
	 * Setter for <code>jooq.book.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jooq.book.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>jooq.book.author_id</code>.
	 */
	public void setAuthorId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jooq.book.author_id</code>.
	 */
	public Integer getAuthorId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>jooq.book.title</code>.
	 */
	public void setTitle(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>jooq.book.title</code>.
	 */
	public String getTitle() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>jooq.book.published_in</code>.
	 */
	public void setPublishedIn(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>jooq.book.published_in</code>.
	 */
	public Integer getPublishedIn() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>jooq.book.language_id</code>.
	 */
	public void setLanguageId(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>jooq.book.language_id</code>.
	 */
	public Integer getLanguageId() {
		return (Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, Integer, Integer> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, Integer, Integer> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Book.BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Book.BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Book.BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Book.BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Book.BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value2(Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value3(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value4(Integer value) {
		setPublishedIn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value5(Integer value) {
		setLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BookRecord
	 */
	public BookRecord() {
		super(Book.BOOK);
	}

	/**
	 * Create a detached, initialised BookRecord
	 */
	public BookRecord(Integer id, Integer authorId, String title, Integer publishedIn, Integer languageId) {
		super(Book.BOOK);

		setValue(0, id);
		setValue(1, authorId);
		setValue(2, title);
		setValue(3, publishedIn);
		setValue(4, languageId);
	}
}
