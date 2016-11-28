/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair;


/**
 *
 * @author PFENIGA1
 */
public class Pair {

    private static void comp(String[] a,String[] b){
        for(String alfa : a){
            for(String beta : b){
                if (alfa.toLowerCase().equals(beta.toLowerCase())){
                    System.out.println(alfa+" - "+beta);
                }
            }
        }
    }
    
    public static void main(String[] args) {
    String[] a1 = {"lastname","firstname","username","gender","GDDB_access_modification","GDDB_role","last time"};
    String[] b1 = {"Sector","Site_code","Pers_Cat","Lastname","Firstname","User_id","Admin Type","Admin Flag","Helpdesk Flag","Sector Right","Country Right","Site Right","Postoffice Right","Business Unit Right","Division Right","Phone","Email"};
    String[] c1 = {"MAIL_PERS_ID","UNIQUE_ID","LASTNAME","FIRSTNAME","MIDDLE_INITIAL","HR_DB_NAME","LASTNAME_EXT","FIRSTNAME_EXT","UPPER_LASTNAME","UPPER_FIRSTNAME","GENDER","ACADEMIC_TITLE","FUNCTIONAL_TITLE","PERS_CATEGORY","CREATION_DATE","LAST_UPDATE","LAST_PER_UPDATE","LAST_EML_UPDATE","LC_STATE","LC_DATE","PER_VISIBLE","EML_VISIBLE","OLD_HR_DB_NAME","HR_ID","HR_DB_SOURCE","HR_DB_PERS_ID","HIRE_DATE_C","JOB_HIRE_DATE","TERMINATION_DATE","PHONE1","PHONE1_TYPE","PHONE2","FAX","FAX_TYPE","MOBILE_PHONE","FREE_PHONE","DIV_BU_CODE","DIVISION_CODE","DIVISION_DESC","BUSINESS_UNIT_CODE","BUSINESS_UNIT_DESC","SECTOR_CODE","ORG_UNIT","DEPARTMENT_DESC","REFERENCE","FUNCTION_CODE","FUNCTION_DESC","COST_CENTER_TYPE","COST_CENTER_NUMBER","REGISTRATION_PERS_ID","SUPERVISOR_ID","INT_MAIL_ADDR","COUNTRY_CODE","COUNTRY_NAME","WORLD_REGION","SITE_CODE","SITE_NAME","SITE_CODE_EXT","POSTAL_ADDRESS_1","POSTAL_ADDRESS_2","POSTAL_ADDRESS_3","POSTAL_ADDRESS_4","POSTAL_ADDRESS_5","POSTAL_ADDRESS_6","PAPER_MAIL_ADDRESS_1","PAPER_MAIL_ADDRESS_2","PAPER_MAIL_ADDRESS_3","PAPER_MAIL_ADDRESS_4","PAPER_MAIL_ADDRESS_5","PAPER_MAIL_ADDRESS_6","PAPER_MAIL_ADDRESS_7","PAPER_MAIL_ADDRESS_8","X_S","X_G","UNKEY","NOTES_FULLNAME","SMTP_PRIMARY","EMAIL_SYSTEM","OPLEVEL3_CODE","OPLEVEL3_DESC","OPLEVEL2_CODE","OPLEVEL2_DESC","OPLEVEL1_CODE","OPLEVEL1_DESC","OM_DIV_CODE","FUNC_MANAGER_ID","OPER_MANAGER_ID","HR_MANAGER_ID"};
    String[] d1 = {"dn","objectClass","cn","sn","c","l","title","physicalDeliveryOfficeName","telephoneNumber","facsimileTelephoneNumber","userCertificate","givenName","distinguishedName","instanceType","whenCreated","whenChanged","displayName","uSNCreated","memberOf","uSNChanged","co","department","company","proxyAddresses","adminDescription","streetAddress","name","objectGUID","userAccountControl","pwdLastSet","primaryGroupID","objectSid","sAMAccountName","division","sAMAccountType","userPrincipalName","objectCategory","dSCorePropagationData","lastLogonTimestamp","mail","manager","mobile","thumbnailPhoto","extensionAttribute7","extensionAttribute8","extensionAttribute1","extensionAttribute9","extensionAttribute11","extensionAttribute12","extensionAttribute13","msRTCSIP-PrimaryUserAddress","extensionAttribute14","msExchHideFromAddressLists","extensionAttribute15","extensionAttribute5","extensionAttribute6","targetAddress","mailNickname","publicDelegatesBL"};
   
   
    comp(a1,b1);
    comp(a1,c1);
    comp(a1,d1);
    comp(b1,c1);
    comp(b1,d1);
    comp(c1,d1);
    
    
    }

}
