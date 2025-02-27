package com.study.lec10;

public final class JavaPenguin extends JavaAnimal implements com.study.lec10.JavaSwimable, com.study.lec10.JavaFlyable {

  private final int wingCount;

  public JavaPenguin(String species) {
    super(species, 2);
    this.wingCount = 2;
  }

  @Override
  public void move() {
    System.out.println("펭귄이 움직입니다~ 꿱꿱");
  }

  @Override
  public int getLegCount() {
    return super.legCount + this.wingCount;
  }

  @Override
  public void act() {
    com.study.lec10.JavaSwimable.super.act();
    com.study.lec10.JavaFlyable.super.act();
  }

}
