package com.home;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CommentRepositoryTest {
    @Autowired
    CommentRepository commentRepository;

    @Test
    public void crud(){
//        Comment comment = new Comment();
//        comment.setComment("댓글!");
//        commentRepository.save(comment);
//
//        List<Comment> all = commentRepository.findAll();
//        assertThat(all.size()).isEqualTo(1);
//
//        long count = commentRepository.count();
//
//        assertThat(count).isEqualTo(1);

        this.createComments(100, "spring data jpa");
        this.createComments(55, "HIBERNATE SPRING");

        List<Comment> cmds = commentRepository.findByCommentContains("Spring");
        assertThat(cmds.size()).isEqualTo(0);

        List<Comment> cmds2 = commentRepository.findByCommentContainsIgnoreCase("Spring");
        assertThat(cmds2.size()).isEqualTo(2);

        List<Comment> cmds3 = commentRepository.findByCommentContainsIgnoreCaseAndLikeCountGreaterThan("Spring", 3);
        assertThat(cmds3.size()).isEqualTo(2);

        List<Comment> cmds4 = commentRepository.findByCommentContainsIgnoreCaseOrderByLikeCountDesc("spring");
        assertThat(cmds4).first().hasFieldOrPropertyWithValue("likeCount", 100);

        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "likeCount"));
        Page<Comment> cmds5 = commentRepository.findByCommentContainsIgnoreCase("spring", pageRequest);
        assertThat(cmds5.getTotalElements()).isEqualTo(2);
        assertThat(cmds5).first().hasFieldOrPropertyWithValue("likeCount", 100);


    }

    private void createComments(int likeCount, String comment) {
        Comment newComment = new Comment();
        newComment.setComment(comment);
        newComment.setLikeCount(likeCount);
        commentRepository.save(newComment);
    }
}