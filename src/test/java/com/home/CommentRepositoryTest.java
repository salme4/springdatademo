package com.home;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
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

        Comment comment = new Comment();
        comment.setComment("spring data jpa");
        commentRepository.save(comment);

        List<Comment> cmds = commentRepository.findByCommentContaining("Spring");
        assertThat(cmds.size()).isEqualTo(0);

        List<Comment> cmds2 = commentRepository.findByCommentContainingIgnoreCase("Spring");
        assertThat(cmds2.size()).isEqualTo(1);
    }
}