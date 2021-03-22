package AngryBirds;

/**
 * Esta clase contiene todos los atributos y
 * métodos de los personajes,
 */

public class Pajaro {
    private String nombre,color, power, soundEffect;
    private int level;
    
    public Pajaro(String nombre, String color, String power, String soundEffect, int level){
        setNombre(nombre);
        setColor(color);
        setPower(power);
        setSoundEffect(soundEffect); 
        setLevel(level);
    }
    
    
    public void activatePower(){
        System.out.println("Activando poder: " + power);
        System.out.println(soundEffect);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSoundEffect() {
        return soundEffect;
    }

    public void setSoundEffect(String soundEffect) {
        this.soundEffect = soundEffect;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
