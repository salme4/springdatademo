package com.home;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

//@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)
public interface CommentRepository extends MyRepository<Comment, Long> {

//    long count();

    List<Comment> findByCommentContains(String keyword);

    List<Comment> findByCommentContainsIgnoreCase(String keyword);

     List<Comment> findByCommentContainsIgnoreCaseAndLikeCountGreaterThan(String keyword, Integer likeCount);

     List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCountDesc(String keyword);

    Page<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);


}
