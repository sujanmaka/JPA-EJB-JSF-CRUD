/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsersEJB;
import Entity.DeletedUsers;

import Entity.Users;
import Entity.UsersFaculties;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author MstfDryl
 */
@ManagedBean(name = "users")
@SessionScoped
public class UsersController {

    @EJB
    private UsersEJB userEJB;

    private Users user;
    private Users editUser;
    
 

    Set<String> faculties = new HashSet<>();

    private List<Users> userList = new ArrayList();
    private String exceptions;
    private String deleteReason;
    private Long deleteId;
    private String deletedName;
    private List<DeletedUsers> deleteList = new ArrayList<>();

    @PostConstruct
    public void getAllUsersList() {
        user = new Users();
        userList = userEJB.allUsers();
        deleteList = userEJB.allDeleteUsers();

        editUser = new Users();

    }

    public List<String> SubJectList() {
        //this list to be rendered
        ArrayList<String> list = new ArrayList<>();

        list.add("physics");
        list.add("chemistry");
        list.add("math");
        return list;
    }

    public Users getEditUser() {
        return editUser;
    }

    public void setEditUser(Users editUser) {
        this.editUser = editUser;
    }

    @Override
    public String toString() {
        return "UsersController{" + "editUser=" + editUser + '}';
    }

    public String editUserss() {
        System.out.println("id ayo ki nai" + getEditUser());
        this.user = getEditUser();

        return "edit.xhtml";
    }

    public String editUser() {

        try {

            System.out.println("tala tira value haru check " + getEditUser());
            System.out.println("id ayo ki nai tala tira" + this.user);
            System.out.println("id ayo ki nai getUser" + getUser());

            userEJB.editUsers(this.user);
            userList = userEJB.allUsers();
            return "index1.xhtml?faces-redirect=true";
        } catch (Exception e) {
            return null;
        }

    }

    public String addUser() {

        System.out.println("Email : " + userEJB.mail(user.getEmail()));

        List data = userEJB.mail(user.getEmail());
        System.out.println(data.toString());
        if (!data.isEmpty()) {
            exceptions = "The user with email id already existed";
            System.out.println("Exceptions added " + getExceptions());

        } else {
            try {

                //Converting set to array
                String strArray[] = getFaculties().toArray(new String[getFaculties().size()]);

                Set<UsersFaculties> faculties = new HashSet<>();
                for (int i = 0; i < getFaculties().size(); i++) {

                    UsersFaculties u = new UsersFaculties();
                    u.setFaculty(strArray[i]);
                    u.setUser_faculties(user);
                    faculties.add(u);

                }

                user.setFaculties(faculties);

                user = userEJB.saveUser(user);
                user = new Users();

                userList = userEJB.allUsers();
                return "index1.xhtml?faces-redirect=true";
            } catch (Exception e) {
                return null;
            }
        }

        return null;
    }

    public void removeExceptions() {
        exceptions = "";
        System.out.println("Exceptions remove" + getExceptions());

    }

    public String deleteUser(Users getUser) {
        try {
            
            userEJB.deleteUsers(getUser);
            userList = userEJB.allUsers();
            
            DeletedUsers delete = new DeletedUsers();
            delete.setDelReason(getDeleteReason());
            delete.setUId(getDeleteId());
            delete.setuName(getDeletedName());
            userEJB.saveUserWithDeleteReason(delete);
            deleteList = userEJB.allDeleteUsers();
            
            return "index1.xhtml?faces-redirect=true";
        } catch (Exception e) {
            return null;
        }
    }

   
    
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<Users> getUserList() {
        return userList;
    }

    public void setUserList(List<Users> userList) {
        this.userList = userList;
    }

    public UsersEJB getUserEJB() {
        return userEJB;
    }

    public void setUserEJB(UsersEJB userEJB) {
        this.userEJB = userEJB;
    }

    public Set<String> getFaculties() {
        return faculties;
    }

    public void setFaculties(Set<String> faculties) {
        this.faculties = faculties;
    }

    public String getExceptions() {
        return exceptions;
    }

    public void setExceptions(String exceptions) {
        this.exceptions = exceptions;
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    public Long getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(Long deleteId) {
        this.deleteId = deleteId;
    }

    public String getDeletedName() {
        return deletedName;
    }

    public void setDeletedName(String deletedName) {
        this.deletedName = deletedName;
    }

    public List<DeletedUsers> getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(List<DeletedUsers> deleteList) {
        this.deleteList = deleteList;
    }
    
    

}
