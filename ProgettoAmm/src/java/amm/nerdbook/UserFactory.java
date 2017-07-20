package amm.nerdbook;

import java.util.ArrayList;


public class UserFactory {
    private static UserFactory singleton;
    private String connectionString;

    public static UserFactory getInstance() {
        if (singleton == null) {
            singleton = new UserFactory();
        }
        return singleton;
    }
    
    private ArrayList<User> listaUtenti=new ArrayList<>();
    
    public UserFactory(){
        User user1 = new User();
        user1.setId(0);
        user1.setNome("Klaus");
        user1.setCognome("Baudelaire");
        user1.setUrlFotoProfilo("img/fratello.jpg");
        user1.setFrasePresentazione("Lettore Assiduo");
        user1.setDataDiNascita("");
        user1.setPassword("password");
    
        User user2 = new User();
        user2.setId(1);
        user2.setNome("Olaf");
        user2.setCognome("Conte");
        user2.setUrlFotoProfilo("img/count.jpg");
        user2.setFrasePresentazione("Malvagio assassino e pessimo attore");
        user2.setDataDiNascita("");
        user2.setPassword("password");
        
        User user3 = new User();
        user3.setId(2);
        user3.setNome("Violet");
        user3.setCognome("Baudelaire");
        user3.setUrlFotoProfilo("img/sorella.jpg");
        user3.setFrasePresentazione("Inventrice");
        user3.setDataDiNascita("");
        user3.setPassword("password");

        
        listaUtenti.add(user1);
        listaUtenti.add(user2);
        listaUtenti.add(user3);
    }
    
    public User getUserById(int id){
        for (User user : listaUtenti){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPass(String username, String password){
        for (User user : listaUtenti){
            if((user.getNome()).equals(username) && 
               user.getPassword().equals(password)){
                return user.getId();
            }
        }
        return -1;
    }
    
    public boolean completeData(int id){
        User user= UserFactory.getInstance().getUserById(id);
        
            if(user.getNome()!=null && user.getCognome()!=null && 
               user.getUrlFotoProfilo()!=null && user.getFrasePresentazione()!=null){
                return true;
            }
        return false;
    }
}
