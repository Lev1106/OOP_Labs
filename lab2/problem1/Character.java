package lab2.problem1;

import java.util.Objects;

public class Character {
    private String name;
    private int level;
    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Character other = (Character) obj;
        return level == other.level && Objects.equals(name, other.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }
    @Override
    public String toString() {
        return "Character " + name + ", level " + level;
    }
}