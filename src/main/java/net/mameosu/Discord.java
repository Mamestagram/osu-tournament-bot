package net.mameosu;

public abstract class Discord {
    String key;
    String token;

    public Discord (String key, String token) {
        this.key = key;
        this.token = token;
    }
}
