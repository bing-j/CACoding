package interface_adapter.clear_users;

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> usersDeleted;

    public ClearState(ClearState copy){
        usersDeleted = copy.usersDeleted;
    }

    public ClearState(){
    }

    public ArrayList<String> getUsersDeleted(){
        return usersDeleted;
    }

    public void setUsersDeleted(ArrayList<String> usersDeleted){
        this.usersDeleted = usersDeleted;
    }


}
