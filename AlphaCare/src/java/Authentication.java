/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Authentication class is to allow users logging in the system and create a account.
 * @author Phong Tran. Ami Bhagat, Michael Smith
 */
import java.util.Date;

public class Authentication {
   /** 
   * This method is used for to know or find user information.
   * @param username This is the user parameter for their login account.
   * @param password This is the user parameter to keep their information secure. 
   * @param email This is the user parameter to connect to the other people.
   * @param firstName This is the user first name to know their identity.
   * @param lastName This is the user last name to know their identity.
   * @param address This is the user address for their security.
   * @param phoneNumber This is the user phone number for their contact.
   * @param altphone This is the user alternative phone number for emaergency contact. 
   * @param dateOfBirth This is the user date of birth for their identity.
   */
   
    private String userName; //input username
    private String password; // input password
    private String email; // input email
    private String firstName; //input first name
    private String lastName; //input last name
    private String address; // input home address
    private int phoneNumber; //input phone number
    private int altPhone; // input alternative phone number
    private Date dateOfBirth; // input date of birth
    
    private void connectToDatabase(){
        
    }
    
    private void fillTable(){
        
    }
    
    
}
