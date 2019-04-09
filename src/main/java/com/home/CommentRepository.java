package com.home;

import java.util.List;

//@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)
public interface CommentRepository extends MyRepository<Comment, Long> {

//    long count();

    List<Comment> findByCommentContaining(String keyword);

    List<Comment> findByCommentContainingIgnoreCase(String keyword);

}
