package com.MohammadAyaad.ContactsManager;

import com.MohammadAyaad.ContactsManager.Data.ContactsManager;
import com.MohammadAyaad.ContactsManager.Model.Email.*;
import com.MohammadAyaad.ContactsManager.Model.PhoneNumber.*;

import java.sql.SQLException;


public class MainClass {
    public static ContactsManager manager;
    public static void main(String[] args) throws SQLException, InvalidPhoneNumberException, InvalidEmailAddressException
    {
        manager = new ContactsManager();
        //add your code here
    }
}
