package com.example.asus.letthemknow1;

/**
 * Created by ASUS on 26/03/2016.
 */
public class AddInfo {
    int Aid;
    String name;
    String age;
    String Afather;
    String Amother;
    String A_address;
    String A_phone;
    String r_name;
    String r_age;
    String r_father;
    String r_address;
    String occupation;
    String nid;
    String r_phone;
    String institute;

   public AddInfo()
    {

    }

   public AddInfo(int Aid,String name,String age,String Afather,String Amother,String A_address,String A_phone,
                  String r_name,String r_age,String r_father,String r_address,
                  String occupation,String nid,String r_phone,String institute)
    {
        this.Aid=Aid;
        this.name=name;
        this.age=age;
        this.Afather=Afather;
        this.Amother=Amother;
        this.A_address=A_address;
        this.A_phone=A_phone;
        this.r_name=r_name;
        this.r_age=r_age;
        this.r_father=r_father;
        this.r_address=r_address;
        this.occupation=occupation;
        this.nid=nid;
        this.r_phone=r_phone;
        this.institute=institute;

    }

    public AddInfo(String name,String age,String Afather,String Amother,String A_address,String A_phone,
                   String r_name,String r_age,String r_father,String r_address,
                   String occupation,String nid,String r_phone,String institute)
    {

        this.name=name;
        this.age=age;
        this.Afather=Afather;
        this.Amother=Amother;
        this.A_address=A_address;
        this.A_phone=A_phone;
        this.r_name=r_name;
        this.r_age=r_age;
        this.r_father=r_father;
        this.r_address=r_address;
        this.occupation=occupation;
        this.nid=nid;
        this.r_phone=r_phone;
        this.institute=institute;

    }


    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setA_address(String a_address) {
        this.A_address = a_address;
    }

    public String getA_address() {
        return A_address;
    }

    public void setAge(String Age) {
        this.age = Age;
    }

    public String getAge() {
        return age;
    }

    public void setAfather(String afather) {
        this.Afather = afather;
    }

    public String getAfather() {
        return Afather;
    }

    public String getAmother() {
        return Amother;
    }

    public void setAmother(String amother) {
        this.Amother = amother;
    }

    public void setA_phone(String a_phone) {
        this.A_phone = a_phone;
    }

    public String getA_phone() {
        return A_phone;
    }

    public void setAid(int aid) {
        this.Aid = aid;
    }

    public int getAid() {
        return Aid;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getInstitute() {
        return institute;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getNid() {
        return nid;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setR_address(String address) {
        this.r_address = address;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_age(String age) {
        this.r_age = age;
    }

    public String getR_age() {
        return r_age;
    }

    public void setR_father(String father) {
        this.r_father = father;
    }

    public String getR_father() {
        return r_father;
    }

    public void setR_name(String name) {
        this.r_name = name;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_phone(String phone) {
        this.r_phone = phone;
    }

    public String getR_phone() {
        return r_phone;
    }


}
