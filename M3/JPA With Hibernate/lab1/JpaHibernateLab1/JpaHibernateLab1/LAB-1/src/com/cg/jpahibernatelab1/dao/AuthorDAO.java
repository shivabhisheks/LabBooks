package com.cg.jpahibernatelab1.dao;

import com.cg.jpahibernatelab1.bean.Author;

public interface AuthorDAO {
	public boolean addAuthor(Author author);
	public boolean deleteAuthor(Author author);
	public Author updateAuthor(Author author);
	public Author findAuthor(Integer id);
}
