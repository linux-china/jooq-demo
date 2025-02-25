/*
 * This file is generated by jOOQ.
 */
package org.mvnsearch.infrastructure.jooq.tables.records;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.mvnsearch.infrastructure.jooq.tables.Book;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
@Entity
@Table(
    name = "book",
    schema = "jooq"
)
public class BookRecord extends UpdatableRecordImpl<BookRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>jooq.book.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq.book.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooq.book.author_id</code>.
     */
    public void setAuthorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq.book.author_id</code>.
     */
    @Column(name = "author_id", nullable = false)
    public Integer getAuthorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jooq.book.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq.book.title</code>.
     */
    @Column(name = "title", nullable = false, length = 400)
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jooq.book.published_in</code>.
     */
    public void setPublishedIn(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq.book.published_in</code>.
     */
    @Column(name = "published_in", nullable = false)
    public Integer getPublishedIn() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jooq.book.language_id</code>.
     */
    public void setLanguageId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>jooq.book.language_id</code>.
     */
    @Column(name = "language_id", nullable = false)
    public Integer getLanguageId() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
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

        setId(id);
        setAuthorId(authorId);
        setTitle(title);
        setPublishedIn(publishedIn);
        setLanguageId(languageId);
        resetTouchedOnNotNull();
    }
}
