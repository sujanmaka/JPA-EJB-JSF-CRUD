/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author MstfDryl
 */
@Entity(name="USERS1")
@NamedQueries({
    @NamedQuery(name="allUsers", query="SELECT u FROM USERS1 u"),
    @NamedQuery(name="getXUser", query="SELECT u FROM USERS1 u WHERE u.userName = :username"),
    @NamedQuery(name="getXEmail", query="SELECT u FROM USERS1 u WHERE u.email = :email")
})
public class Users implements Serializable {
    
    @Column(name="ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="USERNAME", length=200, nullable=false)
    private String userName;
    
    @Column(name="MOBILE", length=255, nullable=false)
    private String mobile;
    
    @Column(name="EMAIL", length=255, nullable=false)
    private String email;

    @Column(name="FACULTY", length = 255, nullable = false)
    private String faculty;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user_faculties", orphanRemoval = true)
    private Set<UsersFaculties> faculties;

    public Users() {
    }

    public Users(Long id, String userName, String mobile, String email, String faculty, Set<UsersFaculties> faculties) {
        this.id = id;
        this.userName = userName;
        this.mobile = mobile;
        this.email = email;
        this.faculty = faculty;
        this.faculties = faculties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Set<UsersFaculties> getFaculties() {
        return faculties;
    }

    public void setFaculties(Set<UsersFaculties> faculties) {
        this.faculties = faculties;
    }
    
    
 }