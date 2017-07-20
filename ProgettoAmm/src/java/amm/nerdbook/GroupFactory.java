/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;
import java.util.ArrayList;
import java.util.List;

public class GroupFactory {
    private static GroupFactory singleton;
    private String connectionString;

    public static GroupFactory getInstance() {
        if (singleton == null) {
            singleton = new GroupFactory();
        }
        return singleton;
    }
    
    private ArrayList<Group> listaGruppi=new ArrayList<Group>();
    
    private GroupFactory() {
        UserFactory userFactory = UserFactory.getInstance();
        
        Group gruppo1 = new Group();
        gruppo1.setNomeGruppo("Raffreddati");
        gruppo1.setId(0);
        gruppo1.setIscritti(userFactory.getUserById(2));
        
        Group gruppo2 = new Group();
        gruppo2.setNomeGruppo("Ottimisti");
        gruppo2.setId(1);
        gruppo2.setIscritti(userFactory.getUserById(2));
        
        Group gruppo3 = new Group();
        gruppo3.setNomeGruppo("Fuori Corso AMM");
        gruppo3.setId(2);
        gruppo3.setIscritti(userFactory.getUserById(2));
        
        listaGruppi.add(gruppo1);
        listaGruppi.add(gruppo2);
        listaGruppi.add(gruppo3);
    }
    
    public Group getGroupById(int id){
        for(Group group:listaGruppi){
            if(group.getId()==id){
                return group;
            }
        }
        return null;
    }
}
