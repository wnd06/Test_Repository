package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private String book;
    private String[] arr;
    private int count;
    public Library() {
    }

    public Library(int i) {
        if(i <= 0)
            throw new IllegalArgumentException("음수가 들어 오면 안됩니다.");
        arr = new String[i];
        count = 0;

        for (int j = 0; j < i; j++) {
            arr[j] = "";
        }
    }

    public void add(String book) {
        if(count == arr.length)
            throw new IllegalArgumentException("책장이 꽉 찾습니다.");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(book)){
                throw new IllegalArgumentException("[" + book + "]" + "은 이미 있는 책 입니다.");
            }
        }
        arr[count] = book;
        count++;
        System.out.println("[" + book + "]" + "책을 추가 하였습니다.");

    }

    public void delete(String book) {

        if(count == 0)
            throw new IllegalArgumentException("책장이 비어있어서 삭제가 불가능 합니다.");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(book)) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = "";
                count--;
                return;
            }
        }
        throw new IllegalArgumentException("없는 책[" + book + "]" + "을 찾을 수 없습니다.");

    }

    public void find(String book) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(book)){
                System.out.println("책 검색 결과 : " + book);
                return;
            }

        }
        System.out.println("없는 책 입니다.");
    }

    public void findAll() {
        System.out.println("모든 책 출력 :");
        System.out.println("==================");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(""))
                continue;
            System.out.println((i + 1) + " : " + arr[i]);
        }
        System.out.println("==================");

    }
}
