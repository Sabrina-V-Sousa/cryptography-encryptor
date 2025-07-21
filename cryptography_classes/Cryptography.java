package cryptography_classes; 
//* to compile classes in package:
// javac -d . Cryptography.java 

public abstract class Cryptography {
    public String message;
    public String encrypted_message;
    public String decrypted_message;
    public Cryptography() {
        message = null;
        encrypted_message = null;
        decrypted_message = null;
    }
    public Cryptography(String s) {
        message = s;
        encrypted_message = this.encrypt();
        decrypted_message = this.decrypt();
    }
    public void setMessage(String s) {
        message = s;
        encrypted_message = this.encrypt();
        decrypted_message = this.decrypt();
    }
    public String getMessage() {
        return message;
    }
    public String getEncrypted() {
        return encrypted_message;
    }
    public String getDecrypted() {
        return decrypted_message;
    }
    protected abstract String encrypt();
    protected abstract String decrypt();
}
