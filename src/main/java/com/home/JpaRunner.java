package com.home;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    //Jpa 핵심 클래스
//    @PersistenceContext
//    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        Session session = entityManager.unwrap(Session.class);
//        Account account = new Account();
//        account.setUsername("dave");
//        account.setPassword("1234");
//
//        Study study = new Study();
//        study.setName("Spring Data JPA");
//
//        account.getStudies().add(study);



//        Post post = new Post();
//        post.setTitle("첫 번째 포스트");
//
//        Comment comment = new Comment();
//        comment.setComment("와우");
//        post.addComment(comment);
//
//        Comment comment1 = new Comment();
//        comment1.setComment("앗싸 2등");
//        post.addComment(comment1);
//        session.save(post);



//        Post post = session.get(Post.class, 1L);
//        System.out.println("=========================");
//        System.out.println(post.getTitle());
//
//        post.getComments().stream().forEach(c -> {
//            System.out.println("--------------");
//            System.out.println(c.getComment());
//        });

//        Comment comment = session.get(Comment.class, 3L);
//        System.out.println("=========================");
//        System.out.println(comment.getComment());
//        System.out.println(comment.getPost().getTitle());

        //TypedQuery
//        TypedQuery<Post> query = entityManager.createQuery("SELECT p from Post as p", Post.class);
//        List<Post> resultList = query.getResultList();
//        resultList.forEach(System.out::println);

          //criteriaBuilder
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Post> query = builder.createQuery(Post.class);
//        Root<Post> root = query.from(Post.class);
//        query.select(root);
//        List<Post> posts = entityManager.createQuery(query).getResultList();
//        posts.forEach(System.out::println);

          //NativeQuery
//        List<Post> posts = entityManager.createNativeQuery("select  * from post", Post.class).getResultList();
//        posts.forEach(System.out::println);

    }
}
