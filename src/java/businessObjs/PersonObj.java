package businessObjs;


public abstract class PersonObj {
    
    //Properties
    protected String Id;
    protected String fname;
    protected String lname;
    protected String email;
    protected String pw;
    protected String address; 
    
    //Constructors
    protected PersonObj() {
    
        Id = "";
        fname = "";
        lname = "";
        email = "";
        pw = "";
        address = "";   
    }

    protected PersonObj(String Id, String fname, String lname, String address, String password, String email){
     
    this.Id = Id;
    this.fname = fname;
    this.lname = lname;
    this.email = email;
    this.pw = password;
    this.address = address;    
    
    }
    
    //getters and Setters
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        
    //Database access methods
    //
    //Select Customer from database and populate object with it
    public abstract void selectDB(String primaryKey);
    //
    //Insert populated Customer Object into database
    public abstract void insertDB();     
    //
    //Delete populated Customer Object from database
    public abstract void deleteDB();  
    

}
