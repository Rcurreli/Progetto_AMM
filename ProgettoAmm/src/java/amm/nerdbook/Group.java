package amm.nerdbook;

import java.util.ArrayList;

public class Group {
    
    private int id;
    private String nomeGruppo;
    private ArrayList<User> iscritti=new ArrayList<User>();
    
    public Group(){
        id=-1;
        nomeGruppo="";
    }
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeGruppo() {
        return nomeGruppo;
    }

    public void setNomeGruppo(String nomeGruppo) {
        this.nomeGruppo = nomeGruppo;
    }
    
    public ArrayList<User> getIscritti() {
        return iscritti;
    }

    public void setIscritti(User iscritto) {
        this.iscritti.add(iscritto);
    }
    
    public boolean equals (Object group){
        if(group instanceof Group){
            if(this.getId()==((Group)group).getId()){
                return true;
            }
        }
        return false;
    }
}