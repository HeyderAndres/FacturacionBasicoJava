package modelo;

public class DBConfig {
    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String password = "1234";
    private String url = "jdbc:mysql://localhost:3307/FATURATION_SYSTEM";

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}


