package com.cg.jpahibernatelab1.service;

import com.cg.jpahibernatelab1.bean.Author;

public interface AuthorService {
	public boolean addAuthor(Author author);
	public Author updateAuthor(Author author);
	public boolean deleteAuthor(Integer id);
}
