package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class BillboardManager {
  private FilmItem[] items = new FilmItem[0];
  private int count;

  public BillboardManager() {
    this.count = 10;
  }
  public BillboardManager(int count) {
    this.count = count;
  }

  public void add(FilmItem item) {
    // создаём новый массив размером на единицу больше
    int length = items.length + 1;
    FilmItem[] tmp = new FilmItem[length];
    // itar + tab
    // копируем поэлементно
    // for (int i = 0; i < items.length; i++) {
    //   tmp[i] = items[i];
    // }
    System.arraycopy(items, 0, tmp, 0, items.length);
    // кладём последним наш элемент
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    items = tmp;
  }

  public FilmItem[] getAll() {
    int numberOfItemsToGet;
    if (items.length < count){
      numberOfItemsToGet = items.length;
    }
    else {
      numberOfItemsToGet = count;
    }
    FilmItem[] result = new FilmItem[numberOfItemsToGet];
    // перебираем массив в прямом порядке
    // но кладём в результаты в обратном
    for (int i = 0; i < numberOfItemsToGet; i++) {
      int index = items.length - i - 1;
      result[i] = items[index];
    }
    return result;
  }

}
