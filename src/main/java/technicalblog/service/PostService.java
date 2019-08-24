package technicalblog.service;

import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;

@Service
public class PostService {
  
  public PostService() {
    System.out.println("*** PostService ***");
}
  
  public ArrayList<Post> getAllPosts() {
    
    Post post1 = new Post();
    post1.setTitle("Post1");
    post1.setBody("Post 1 Body");
    post1.setDate(new Date());
    
    Post post2 = new Post();
    post2.setTitle("Post2");
    post2.setBody("Post 2 Body");
    post2.setDate(new Date());
    
    Post post3 = new Post();
    post3.setTitle("Post3");
    post3.setBody("Post 3 Body");
    post3.setDate(new Date());
    
    ArrayList<Post> posts = new ArrayList<>();
    posts.add(post1);
    posts.add(post2);
    posts.add(post3);
    
    return posts;
  }

  public ArrayList<Post> getOnePost() {
    
    Post userPost = new Post();
    userPost.setTitle("User Post");
    userPost.setBody("User Post Body");
    userPost.setDate(new Date());
    
    ArrayList<Post> post = new ArrayList<>();
    post.add(userPost);
    
    return post;
  }
}