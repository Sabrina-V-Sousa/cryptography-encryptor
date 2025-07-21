package cryptography_classes; 
//* to compile classes in package:
// javac -d . Caesar.java 

public class Caesar extends Cryptography {
    public int key;
    public Caesar() {
        super();
        key = 0;
    }
    public Caesar(String s) {
        key = 0;
        message = s;
        encrypted_message = this.encrypt();
        decrypted_message = this.decrypt();
    }
    public Caesar(String s, int k) {
        key = k;
        message = s;
        encrypted_message = this.encrypt();
        decrypted_message = this.decrypt();
    }
    public void setKey(int k) {
        key = k;
    }
    public int getKey() {
        return key;
    }
    public String encrypt() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int message_len = message.length();
        StringBuilder enc_message = new StringBuilder();
        for (int i = 0; i < message_len; i++) {
            char character = message.charAt(i);
            if (Character.isLetter(character)) {
                char enc_letter = alphabet.charAt((alphabet.indexOf(Character.toLowerCase(character)) + key) % 26);
                enc_message.append(Character.isUpperCase(character) ? Character.toUpperCase(enc_letter) : enc_letter);
            } else {
                enc_message.append(character);
            }
        }
        return enc_message.toString();
    }
    public String decrypt() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int message_len = message.length();
        StringBuilder dec_message = new StringBuilder();
        for (int i = 0; i < message_len; i++) {
            char character = message.charAt(i);
            if (Character.isLetter(character)) {
                char dec_letter = alphabet.charAt((26 + alphabet.indexOf(Character.toLowerCase(character)) - (key % 26)) % 26);
                dec_message.append(Character.isUpperCase(character) ? Character.toUpperCase(dec_letter) : dec_letter);
            } else {
                dec_message.append(character);
            }
        }
        return dec_message.toString();
    }
}