/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;
import java.util.ArrayList;
import java.util.List;

public class PostFactory {
    private static PostFactory singleton;
    private String connectionString;

    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }
    
    private ArrayList<Post> listaPost=new ArrayList<Post>();
    
    private PostFactory() {
        
        UserFactory userFactory = UserFactory.getInstance();

        //Creazione Post
        Post post1 = new Post();
        post1.setText("libera Sunny, mostro");
        post1.setUrl("http://protezionedonnebambini.blogspot.it/");
        post1.setLinkText("O ti denuncio.");
        post1.setId(0);
        post1.setPubId(1);
        post1.setUser(UserFactory.getInstance().getUserById(0));
        post1.setPostType(Post.Type.LINK);

        Post post2 = new Post();
        post2.setText("non potete far nulla per fermarmi");
        post2.setId(1);
        post2.setPubId(1);
        post2.setUser(UserFactory.getInstance().getUserById(1));

        Post post3 = new Post();
        post3.setText("Mi sto legando i capelli.");
        post3.setUrl("img/capelli.jpg");
        post3.setId(2);
        post3.setPubId(1);
        post3.setUser(UserFactory.getInstance().getUserById(2));
        post3.setPostType(Post.Type.IMAGE);


        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
        
        
    }
    
    public Post getPostById(int id){
        for(Post post:listaPost){
            if(post.getId()==id){
                return post;
            }
        }
        
        return null;
    }
    
    public List<Post> getPostList(User user){
        List<Post> nuovaLista=new ArrayList<Post>();
        
        
        for(Post post:listaPost){
            if(post.getId()==user.getId()){
                nuovaLista.add(post);
            }
        }
        return nuovaLista;
    }
    
    public List<Post> getPostListForUser(User user){
        List<Post> nuovaLista=new ArrayList<Post>();
        
        
        for(Post post:listaPost){
            if(post.getPubId()==user.getId()){
                nuovaLista.add(post);
            }
        }
        return nuovaLista;
    }
    
    public List<Post> getPostListByGroup(Group gruppo){//eliminare?!
        List<Post> listaPost=new ArrayList<Post>();
        
        for(Post post:listaPost){
            for(User user:gruppo.getIscritti()){
                if(post.getUser().equals(user)){
                    listaPost.add(post);
                }
            }
        }
        return listaPost;
    }
}