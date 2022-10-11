package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        BubbleSort<String> bubbleSort = new BubbleSort<>();

        System.out.println("[result]" + bubbleSort.sort(Arrays.asList(args)));
    }

}
