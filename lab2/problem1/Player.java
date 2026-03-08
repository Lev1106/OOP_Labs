package lab2.problem1;

import java.util.Objects;

public class Player extends Character {
    private String nickname;
    public Player(String name, int level, String nickname) {
        super(name, level);
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        return Objects.equals(nickname, ((Player)obj).getNickname());
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nickname);
    }
    @Override
    public String toString() {
        return super.toString() + ", nickname: " + nickname;
    }
}